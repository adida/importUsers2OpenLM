package com.openlm.userimport.api.soap;

import com.openlm.userimport.User;
import com.openlm.userimport.api.IOpenLMServerAPI;
import org.datacontract.schemas._2004._07.openlm_server.SessionRefresh;
import org.datacontract.schemas._2004._07.openlm_server_services.*;
import org.datacontract.schemas._2004._07.system_collections.KeyValuePairOfintstring;
import services.server.openlm.IAdminAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * This class represents implementation of OpenLM connector via SOAP Web Service protocol.
 * The class is incomplete because OpenLM doesn't not provide all required functions as SOAP operations yet.
 * It is intended to demonstrate the approach to use the OpenLM SOAP API
 */
public class WebServiceAPI implements IOpenLMServerAPI {

    final Supplier<String> sessionIdSupplier;

    IAdminAPI adminApi;
    org.datacontract.schemas._2004._07.openlm_server_services.ObjectFactory servicesFactory = new org.datacontract.schemas._2004._07.openlm_server_services.ObjectFactory();
    org.datacontract.schemas._2004._07.openlm_server.ObjectFactory serverFactory = new org.datacontract.schemas._2004._07.openlm_server.ObjectFactory();


    public WebServiceAPI(Supplier<String> sessionIdSupplier) {
        this.sessionIdSupplier = sessionIdSupplier;
    }

    @Override
    public String authenticate(String login, String pwd) {
        UserAuthenticationRequest request = servicesFactory.createUserAuthenticationRequest();
        request.setPassword(servicesFactory.createUserAuthenticationRequestPassword(pwd));
        request.setUserName(servicesFactory.createUserAuthenticationRequestUserName(login));
        UserAuthenticationResponse response = adminApi.performUserAuthentication(request);
        return response.getSessionID().getValue();
    }

    @Override
    public boolean authRequired() {
        LoginFormSettingsRequest request = servicesFactory.createLoginFormSettingsRequest();
        LoginFormSettingsResponse response = adminApi.getLoginFormSettings(request);
        return response.isUserAuthenticationRequired();
    }

    @Override
    public Map<String, String> loadGroups() {
        GroupNamesRequest request = sessionize(servicesFactory.createGroupNamesRequest());
        GroupNamesResponse response = adminApi.getGroupsNames(request);
        List<KeyValuePairOfintstring> list = response.getGroups().getValue().getKeyValuePairOfintstring();
        HashMap<String, String> result = new HashMap<>();

        for (KeyValuePairOfintstring pair : list) {
            //Name to Id map
            result.put(pair.getValue(), String.valueOf(pair.getKey()));
        }

        return result;
    }

    private <T extends BaseRequest> T sessionize(T request) {
        SessionRefresh sessionRefresh = this.serverFactory.createSessionRefresh();
        sessionRefresh.setRefresh(Boolean.FALSE);
        sessionRefresh.setSessionID(this.serverFactory.createSessionRefreshSessionID(this.sessionIdSupplier.get()));

        RequestBaseInfo baseInfo = this.servicesFactory.createRequestBaseInfo();
        baseInfo.setSessionData(this.servicesFactory.createRequestBaseInfoSessionData(sessionRefresh));
        request.setBaseInfo(this.servicesFactory.createBaseRequestBaseInfo(baseInfo));
        return request;
    }

    @Override
    public Map<String, String> loadProjects() {
        GroupNamesRequest request = sessionize(servicesFactory.createGroupNamesRequest());
        GroupNamesResponse response = adminApi.getGroupsNames(request);
        List<KeyValuePairOfintstring> list = response.getGroups().getValue().getKeyValuePairOfintstring();
        HashMap<String, String> result = new HashMap<>();

        for (KeyValuePairOfintstring pair : list) {
            //Name to Id map
            result.put(pair.getValue(), String.valueOf(pair.getKey()));
        }

        return result;
    }

    @Override
    public void createGroup(String name) {
    }

    @Override
    public String createProject(String name) {
        return null;
    }

    @Override
    public Optional<User> loadUser(String userName) {
        return null;
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void loadExistingUsers(List<String> userNames) {

    }
}
