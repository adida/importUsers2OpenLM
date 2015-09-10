package com.openlm.userimport.api.xml;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlValue;

/**
 * This class represents...
 */
@XmlRootElement(name = "PARAM")
public class Parameter {
    @XmlAttribute
    String name;
    @XmlTransient
    String value;

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Parameter() {
    }

    public Parameter(String name, String value) {
        this.name = name;
        this.value = value;
    }
}
