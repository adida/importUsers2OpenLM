package com.openlm.userimport.api.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents...
 */
@XmlRootElement(name="PARAMETERS")
public class Parameters {
    @XmlElement(name = "PARAM")
    List<Parameter> list = new ArrayList<>();

    @XmlElement
    String userid;
    @XmlElement
    String user_name;
    @XmlElement
    String first_name;
    @XmlElement
    String last_name;
    @XmlElement
    String display_name;
    @XmlElement
    String title;
    @XmlElement
    String department;
    @XmlElement
    String phone_number;
    @XmlElement
    String description;
    @XmlElement
    String office;
    @XmlElement
    String email;
    @XmlElement
    Boolean enabled;

}
