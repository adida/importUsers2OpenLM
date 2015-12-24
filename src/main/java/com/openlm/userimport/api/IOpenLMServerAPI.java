package com.openlm.userimport.api;

import com.openlm.userimport.User;
import com.openlm.userimport.api.xml.Groups;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * This class represents...
 */
public interface IOpenLMServerAPI {
    String authenticate(String login, String pwd);
    boolean authRequired();
    Map<String, String> loadGroups();
    Map<String, String> loadProjects();
    void createGroup(String name);
    String createProject(String name);
    Optional<User> loadUser(String userName);
    void createUser(User user);

    void updateUser(User user);

    void loadExistingUsers(List<String> userNames);

    void updateGroup(String id, String name, String parentId, String prevParentId);

    Groups getGroupDetails(String id, String name);
}
