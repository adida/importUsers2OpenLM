package com.openlm.userimport.api.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * This class represents...
 */
public class Session {
    public static final String DEFAULT_ID = "0";

    @XmlAttribute
    String sessionId;
    @XmlAttribute
    boolean refresh = false;
    @XmlValue
    String value;

    public Session() {
    }

    public Session(String sessionId) {
        this.sessionId = sessionId;
    }
}
