package com.openlm;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    private static connectToOpenLM olmConnector;
    private static String getAllUsersRequest = "<ULM><MESSAGE type=\"GetUsersForPage\"   /><SESSION sessionId=\"0\" refresh=\"true\" /><PAGING start_record=\"0\" end_record=\"99999\"  sort=\"\" dir=\"\" search=\"\"/><SHOW_DISABLED>false</SHOW_DISABLED> </ULM>\n";
    private static String addUserRequest = "<ULM><MESSAGE type=\"AddUser2\" thousands_separator=\",\" timezone=\"Israel Standard Time\" timeformat=\"dd/mm/yyyy hh:mm:ss\" decimalseparator=\".\"/><SESSION sessionId=\"#SessionID#\" /><PARAMETERS><PARAM name=\"user_name\">#username#</PARAM><PARAM name=\"first_name\">#first#</PARAM><PARAM name=\"last_name\">#lastName#</PARAM><PARAM name=\"display_name\"></PARAM><PARAM name=\"title\">Mr.</PARAM><PARAM name=\"department\"></PARAM><PARAM name=\"phone_number\"></PARAM><PARAM name=\"description\"></PARAM><PARAM name=\"office\"></PARAM><PARAM name=\"email\">#email#</PARAM><PARAM name=\"enabled\">true</PARAM><PARAM name=\"password\"><![CDATA[]]></PARAM><PARAM name=\"repassword\"><![CDATA[]]></PARAM></PARAMETERS><PROJECTS default_project_id=\"\"></PROJECTS><GROUPS default_group_id=\"\"></GROUPS ></ULM>";
    private static String updateUserRequest = "<ULM><MESSAGE type=\"UpdateUserDetails2\" /><SESSION sessionId=\"#SessionID#\" /><PARAMETERS><PARAM name=\"userid\">#userID#</PARAM><PARAM name=\"user_name\">#username#</PARAM><PARAM name=\"first_name\">#first#</PARAM><PARAM name=\"last_name\">#lastName#</PARAM><PARAM name=\"display_name\"><![CDATA[kajsdhf]]></PARAM><PARAM name=\"title\"><![CDATA[Mr.]]></PARAM><PARAM name=\"department\"><![CDATA[]]></PARAM><PARAM name=\"phone_number\"></PARAM><PARAM name=\"description\"><![CDATA[]]></PARAM><PARAM name=\"office\"><![CDATA[]]></PARAM><PARAM name=\"email\">#email#</PARAM><PARAM name=\"enabled\">true</PARAM></PARAMETERS></ULM>";
    private static String AuthenticationRequest = "<ULM><MESSAGE type=\"UserAuthentication\" /><NAME>#username#</NAME><PWD><![CDATA[#password#]]></PWD></ULM>";
    // Statistics counters:
    private static int new_users = 0;
    private static int updated = 0;
    private static int no_change = 0;
    private static int failed = 0;
    static String currentUserID;

    // authentication params
//    private static boolean useAuthentication = true;
//    private static String username = "adi";
//    private static String password = "adi";
//    private static String wsdlService = "http://10.0.0.195:7020/OpenLM.Server.Services/AdminAPI?singleWsdl";
    private static String SessionID;

    // properties file reading
    private static LoadPropertiesFile LoadPropertiesFile;
    private static String delimiter;

    public static void main(String[] args) throws Exception {

        // read config file or arguments
        if (args.length < 2) {
            System.out.println("Expecting to get 2 arguments: properties file path and CSV file path");
            System.out.println("USAGE: importUsers2OpenLM <properties file> <Users CSV file>");
            System.out.println("See example importUsers2OpenLM.properties and users.csv");
            return;
        }

        for(int i = 0; i < args.length; i++) {
        }

        // read from properties file
        LoadPropertiesFile = new LoadPropertiesFile();
        LoadPropertiesFile.loader(args[0]);
        delimiter = LoadPropertiesFile.getDelimiter();
        String OpenLMServerURL = LoadPropertiesFile.getOpenLMServerURL();

        // Open the csv file

        readCSV readCSV = new com.openlm.readCSV();
        readCSV.setInputFile(args[1]);
        readCSV.openFile();


        olmConnector = new connectToOpenLM();

        // Authenticate with OpenLM Server if needed

        if (LoadPropertiesFile.getUseAuthentication()) {
            String newAuthenticationRequest = AuthenticationRequest.replace("#username#", LoadPropertiesFile.getUsername()).replace("#password#", LoadPropertiesFile.getPassword());
            String response = null;
            try {
                response = olmConnector.sendPost(LoadPropertiesFile.getOpenLMServerURL(), newAuthenticationRequest);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }

            SessionID= XMLSessionParser(response);
        }
        else {
            SessionID="0";
        }

        // connect to OpenLM Server and get all current users
        System.out.println("connecting openlm server to get current user list");
        String allExistingUsers = olmConnector.sendPost(LoadPropertiesFile.getOpenLMServerURL(), getAllUsersRequest);
        if (allExistingUsers == null) {
            System.out.println("Error connecting to OpenLM Server!");
            return;
        }


        // Load result in to XMLDomParser
        XmlDomParser XDP = new XmlDomParser(allExistingUsers);
        //

        // Iterate on the employee list (csv) and for each
        //  - add if does not exist
        //  - Ignore if exists and no updates
        //  - Update if exists and there are updates
        String line;
        System.out.println(" working on the users");
        while ((line = readCSV.getNext()) != null) {
            String[] users = line.split(delimiter);
            // check if exists
            currentUserID = XDP.findUserByUsername(users[0]);
            if (currentUserID != "0") {
                //  check if need to update.
                //XmlDomParser xdp = new XmlDomParser();

                if (XDP.compareUsers(users[0], users[1], users[2], users[3])) {
                    no_change = no_change + 1;
                } else {

                    // call update
                    if (updateUser(users[0], users[1], users[2], users[3])) {
                        updated++;
                    } else {
                        failed = failed + 1;
                        System.out.println("failed updating the user:" + users[0]);
                    }
                }


            } else {
                // create new
                boolean userAdded = addUser(users[0], users[1], users[2], users[3]);
                if (userAdded) {
                    new_users = new_users + 1;
                } else {
                    failed = failed + 1;
                    System.out.println("failed adding the user:" + users[0]);
                }
            }
        }

        // Report statistics - updated, added, exists
        System.out.println("report:");
        System.out.println("new users=" + new_users);
        System.out.println("updeted users=" + updated);
        System.out.println("number of users that failed adding or updating=" + failed);
        System.out.println("number of users with no change=" + no_change);

    }


    public static boolean addUser(String username, String first_name, String last_name, String Email) {
        // replace #placeholders# with the correct attributes
        String newAddUserRequest = addUserRequest.replace("#username#", username).replace("#first#", first_name).replace("#lastName#", last_name).replace("#email#", Email).replace("#SessionID#",SessionID );
        // send add request to OpenLM Server

        String response = null;
        try {
            response = olmConnector.sendPost(LoadPropertiesFile.getOpenLMServerURL(), newAddUserRequest);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        // if success return true=<ULM><MESSAGE type="Success" /></ULM>

        if (response.contains("Success")) {
            return true;

        }
        // if failed return false
        else {
            return false;

        }


    }

    // new function updateUser
    static boolean updateUser(String username, String first_name, String last_name, String Email) {
        // replace #placeholders# with the correct attributes
        String newUpdateUserRequest = updateUserRequest.replace("#username#", username).replace("#first#", first_name).replace("#lastName#", last_name).replace("#email#", Email).replace("#userID#", currentUserID).replace("#userID#", currentUserID).replace("#SessionID#",SessionID );

        // send add request to OpenLM Server

        String response = null;
        try {
            response = olmConnector.sendPost(LoadPropertiesFile.getOpenLMServerURL(), newUpdateUserRequest);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        // if success return true       <ULM><MESSAGE type="Success" /></ULM>

        if (response.contains("Success")) {
            return true;

        }
        // if failed return false
        else {
            return false;

        }

    }

    public static String XMLSessionParser(String SessionIdXml)

    {

        DOMParser parser = new DOMParser();
        String SESSIONID = null;
        try {
            parser.parse(new InputSource(new java.io.StringReader(SessionIdXml)));
            Document doc = parser.getDocument();
            SESSIONID = doc.getElementsByTagName("SESSIONID").item(0).getTextContent();
        } catch (SAXException e) {
            // handle SAXException
        } catch (IOException e) {
            // handle IOException
        }
        return SESSIONID;
    }
}













    // Close CSV file
    // Close connection to OpenLM Server



    //XmlDomParser xdp = new XmlDomParser();
    //xdp.parseDocument();








