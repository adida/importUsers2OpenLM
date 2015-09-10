package com.openlm.userimport.api.xml;

import com.openlm.userimport.User;
import com.openlm.userimport.api.IOpenLMServerAPI;
import org.apache.commons.io.IOUtils;

import javax.xml.bind.JAXBException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static com.openlm.userimport.api.xml.Message.Method.*;
import static com.openlm.userimport.api.xml.Message.Method.Error;

/**
 * This class represents...
 */
public class XmlAPI implements IOpenLMServerAPI {
    final Supplier<String> sessionIdSupplier;
    final URL url;

    String lastResponse;

    public XmlAPI(String url, Supplier<String> sessionIdSupplier) throws MalformedURLException {
        this.url = new URL(url);
        this.sessionIdSupplier = sessionIdSupplier;
    }

    private ULM send(ULM request, Message.Method ... expected) {
        try {
            HttpURLConnection con = (HttpURLConnection) this.url.openConnection();
            con.setRequestMethod("POST");
            con.setDoOutput(true);
            OutputStream out = con.getOutputStream();
            ByteArrayOutputStream req = new ByteArrayOutputStream();
            request.printXml(req);
            System.out.println(new String(req.toByteArray()));
            out.write(req.toByteArray());
            out.flush();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            IOUtils.copy(con.getInputStream(), baos);
            this.lastResponse = new String(baos.toByteArray());
            System.out.println(this.lastResponse);
            System.out.println();

            ULM result = ULM.parse(new ByteArrayInputStream(baos.toByteArray()));
            if(result.message == null){
                throwUnexpected();
            }
            boolean ok = isMessageExpected(result.message.type, expected);
            if(!ok){
                handleError(result);
                throwUnexpected();
            }
            return result;
        } catch (JAXBException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    private ULM request(Message.Method method){
        return new ULM(sessionIdSupplier.get(), method);
    } 

    private void throwUnexpected() {
        throw new RuntimeException("Unexpected response: " + this.lastResponse);
    }

    private boolean isMessageExpected(Message.Method type, Message.Method[] expected) {
        if(expected != null && expected.length > 0){
            for (Message.Method method : expected) {
                if(method.equals(type)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String authenticate(String login, String pwd) {
        ULM auth = new ULM(Session.DEFAULT_ID, UserAuthentication);
        auth.name = login;
        auth.pwd = pwd;
        ULM authResponse = send(auth, SessionAuthenticationID);
        return authResponse.sessionId;
    }

    @Override
    public boolean authRequired() {
        ULM response = send(new ULM(Session.DEFAULT_ID, GetLoginFormSettings),
                SkipLoginForm, ShowLoginForm);
        return response.message.type == ShowLoginForm;
    }

    @Override
    public Map<String, String> loadGroups() {
        return loadEntities(GetGroupsList, GroupsList, (ulm) -> ulm.groups);
    }

    @Override
    public Map<String, String> loadProjects() {
        return loadEntities(GetProjectsList, ProjectsList, (ulm) -> ulm.projects);
    }

    private <T extends AbstractEntity> Map<String, String> loadEntities(
            Message.Method requestMethod,
            Message.Method expectedResponse,
            Function<ULM, AbstractEntityList<T>> getter) {
        ULM response = send(request(requestMethod), expectedResponse);
        return getter.apply(response).list.stream()
                .filter(AbstractEntity::isEnabled)
                .collect(Collectors.toMap(AbstractEntity::getName, AbstractEntity::getId));
    }

    @Override
    public void createGroup(String name) {
        send(request(
                AddGroup2)
                    .parameter("group_name", name),
                Success);
    }

    @Override
    public String createProject(String name) {
        return send(request(AddProject)
                        .parameter("project_name", name),
                ProjectAdded)
                        .parameter("project_id").get();
    }

    @Override
    public Optional<User> loadUser(String userName) {
        ULM request = request(GetUserDetails2)
                .parameter("username", userName)
                .parameter("userid", "");

        ULM response = send(request,
                        UserDetails, Error);
        if(response.message.type == Error){
            return Optional.empty();
        }
        return Optional.of(new User(
                response.parameters.user_name,
                response.parameters.first_name,
                response.parameters.last_name,
                response.parameters.display_name,
                response.parameters.title,
                response.parameters.department,
                response.parameters.phone_number,
                response.parameters.description,
                response.parameters.office,
                response.parameters.email,
                response.parameters.enabled,
                toIdList(response.groups.list, Group::getId),
                response.groups.defaultId,
                toIdList(response.projects.list, Project::getId),
                response.projects.defaultId
        ));
    }

    private <T> List<String> toIdList(List<T> list, Function<T, String> getId) {
        return list.stream().map(getId).collect(Collectors.toList());
    }

    @Override
    public void createUser(User user) {
        updateOrCreateUser(user, AddUser2);
    }

    @Override
    public void updateUser(User user) {
        updateOrCreateUser(user, UpdateUserDetails2);
    }

    private void updateOrCreateUser(User user, Message.Method method) {
        send(request(method)
                        //May need to use mapping instead
                        .parameter("user_name", user.userName)
                        .parameter("first_name", user.firstName)
                        .parameter("last_name",         user.lastName)
                        .parameter("display_name",      user.displayName)
                        .parameter("title",             user.title)
                        .parameter("department",        user.department)
                        .parameter("phone_number",      user.phoneNumber)
                        .parameter("description",       user.description)
                        .parameter("office",            user.office)
                        .parameter("email",             user.email)
                        .parameter("enabled",           String.valueOf(user.enabled))
                        .projects(user.defaultProject, user.projects)
                        .groups(user.defaultGroup, user.groups),
                Success);
    }

    @Override
    public void loadExistingUsers(List<String> userNames) {
        ULM request = request(GetUsersForPage);
        request.paging = new Paging(0, 30);
        request.showDisabled = Boolean.FALSE;
        send(request, UsersList);
        //Process response and extract users when listed in userNames
    }


    private void handleError(ULM authResponse) {
        if(authResponse.message.type == Error){
            throw new RuntimeException(authResponse.message.content.toString());
        }
    }
}

