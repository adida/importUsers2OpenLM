package com.openlm.userimport.api.xml;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * This class represents...
 */
public class Paging {
    @XmlAttribute
    int startRecord;
    @XmlAttribute
    int endRecord;
    @XmlAttribute
    String sort = "name";
    @XmlAttribute
    String dir = "";
    @XmlAttribute
    String search = "";

    public Paging(int start, int end) {
        this.startRecord = start;
        this.endRecord = end;
    }
}
