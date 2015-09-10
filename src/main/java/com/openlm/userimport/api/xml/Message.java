package com.openlm.userimport.api.xml;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * This class represents...
 */
public class Message {
    @XmlType
    @XmlEnum(String.class)
    public enum Method{
        //Request
        GetProjectsList,
        GetGroupsList,
        GetUserDetails2,
        AddGroup2,
        AddUser2,
        AddProject,
        UpdateUserDetails2,
        GetUsersForPage,

        GetLoginFormSettings,
        UserAuthentication,
        //Response
        SkipLoginForm,
        ShowLoginForm,
        SessionAuthenticationID,

        ProjectsList,
        GroupsList,
        UsersList,
        ProjectAdded,
        UserDetails,
        Success,
        Error
    }

    @XmlAttribute
    Method type;
    @XmlMixed
    @XmlElementRefs({
            @XmlElementRef(name="PARAM", type=Parameter.class)})
    List<?> content;

    @XmlAttribute
    String format;

}

