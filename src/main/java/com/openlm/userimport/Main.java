package com.openlm.userimport;

import com.openlm.userimport.api.IOpenLMServerAPI;
import com.openlm.userimport.api.xml.XmlAPI;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.net.MalformedURLException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main{
    final Properties configuration;
    final IOpenLMServerAPI serverApi;
    final File csv;
    final String listDelimiter = "\\|";
    //Maps of name to ID
    final Map<String, String> groups = new HashMap<>();
    final Map<String, String> projects = new HashMap<>();

    final List<String> userNamesToImport = new ArrayList<>();

    final boolean mergeUserDetailsOnUpdate;
    final boolean allowToAddMissingEntities;

    String sessionId;

    public Main(File csv, Properties configuration) {
        this.csv = csv;
        this.configuration = configuration;
        this.allowToAddMissingEntities = Boolean.parseBoolean(configuration.getProperty("allow.to.add.entities"));
        this.mergeUserDetailsOnUpdate = Boolean.parseBoolean(configuration.getProperty("merge.user.details.on.update"));
        try {
            this.serverApi = new XmlAPI(configuration.getProperty("xml.api.url"), () -> sessionId);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        File csv = validateCommandLine(args);
        Properties configuration = new Properties();
        try (FileReader reader = new FileReader("config.properties")) {
            configuration.load(reader);
        } catch (IOException e) {
            System.err.println("Failed to read configuration: ");
            e.printStackTrace();
        }
        try {
            new Main(csv, configuration).run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void run() {
        authenticate();
        readCSV((record) -> {
            collect(record, "Groups", this.groups);
            collect(record, "Projects", this.projects);
            this.userNamesToImport.add(record.get("UserName"));
        });
        loadAndUpdateGroups();
        loadAndUpdateProjects();
//        this.serverApi.loadExistingUsers(this.userNamesToImport);
        readCSV(this::importUser);
//        printSummary();
    }

    private void importUser(CSVRecord csv) {
        String userName = csv.get("UserName");
        //Performance can be optimized if we load multiple users at once
        Optional<User> existingUser = this.serverApi.loadUser(userName);
        User csvUser = createUser(csv);
        //Can we simplify this with Optional lambdas ?
        if (existingUser.isPresent()) {
            if(mergeUserDetailsOnUpdate){
                csvUser.merge(existingUser.get());
            }
            this.serverApi.updateUser(csvUser);
        } else if(allowToAddMissingEntities){
            if(csvUser.enabled == null) {
                csvUser.enabled = true;
            }
            this.serverApi.createUser(csvUser);
        }
    }

    private User createUser(CSVRecord record) {
        return new User(
                record.get("UserName"),
                record.get("FirstName"),
                record.get("LastName"),
                record.get("DisplayName"),
                record.get("Title"),
                record.get("Department"),
                record.get("PhoneNumber"),
                record.get("Description"),
                record.get("Office"),
                record.get("Email"),
                nullableBoolean(record.get("Enabled")),
                existingIds(record.get("Groups"), this.groups),
                existingId(record.get("DefaultGroup"), this.groups),
                existingIds(record.get("Projects"), this.projects),
                existingId(record.get("DefaultProject"), this.projects)
        );
    }


    private Boolean nullableBoolean(String value) {
        return value == null ? null : Boolean.valueOf(value);
    }

    //Useless method for better readability
    private String existingId(String name, Map<String, String> idMap) {
        return idMap.get(name);
    }

    private List<String> existingIds(String line, Map<String, String> idMap) {
        if(line == null) return null;
        return Arrays.stream(line.split(this.listDelimiter))
                .filter((name) -> idMap.get(name) != null)//Use only existing id
                .map(idMap::get) //Convert names to id
                .collect(Collectors.toList());
    }

    private void loadAndUpdateProjects() {
        loadId(this.serverApi::loadProjects, this.projects);
        if (this.allowToAddMissingEntities) {
            this.projects.entrySet().stream()
                    .filter((p) -> p.getValue() == null)//Use ones without id
                    .map(Map.Entry::getKey) //Use names
                    .forEach(this::createProject);
        }
    }

    private void createProject(String name) {
        this.projects.put(name, this.serverApi.createProject(name));
    }

    private void loadAndUpdateGroups() {
        loadId(this.serverApi::loadGroups, this.groups);
        if (this.allowToAddMissingEntities) {
            this.groups.entrySet().stream()
                    .filter((g) -> g.getValue() == null)
                    .forEach((g) -> serverApi.createGroup(g.getKey()));
            //Update collected groups again, because id is not returned when a group created
            loadId(this.serverApi::loadGroups, this.groups);
        }
    }

    private void loadId(Supplier<Map<String, String>> loadMethod, Map<String, String> collected) {
        Map<String, String> existing = loadMethod.get();
        for (Map.Entry<String, String> entity : collected.entrySet()) {
            String name = entity.getKey();
            entity.setValue(existing.get(name));
        }
    }

    private void readCSV(Consumer<CSVRecord> consumer) {
        try (Reader reader = new BufferedReader(new FileReader(csv))) {
            CSVFormat.DEFAULT
                    .withHeader()
                    .withNullString("")
                    .parse(reader).iterator()
                    .forEachRemaining(consumer);
        } catch (IOException e) {
            throw new RuntimeException("CSV read failure", e);
        }
    }

    private void collect(CSVRecord record, String name, Map<String, String> collectTo) {
        String groups = record.get(name);
        if(groups != null) {
            String[] split = groups.split(this.listDelimiter);
            for (String s : split) {
                collectTo.put(s, null);
            }
        }
    }

    private void authenticate() {
        if (this.serverApi.authRequired()) {
            String login = configuration.getProperty("login");
            String password = configuration.getProperty("password");
            if(login == null || login.isEmpty() || password == null || password.isEmpty()){
                Console console = System.console();
                if (console != null) {
                    login = console.readLine("Authentication required. Please enter login: ");
                    password = new String(console.readPassword("Password: "));
                } else {
                   throw new RuntimeException("Authentication required. Configuration has no login nor password. Use java.exe instead of javaw.exe to enter credentials");
                }
            }

            this.sessionId = this.serverApi.authenticate(login, password);
        }
    }

    private static File validateCommandLine(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: lack of arguments. Use CSV file name as the argument.");
            System.exit(0);
        }
        File csv = new File(args[0]);
        if (!csv.exists()) {
            System.out.println("File not found: " + csv.getAbsolutePath());
            System.exit(1);
        }
        return csv;
    }
}
