
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FetchStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FetchStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="Working"/>
 *     &lt;enumeration value="Pending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FetchStatus")
@XmlEnum
public enum FetchStatus {

    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Working")
    WORKING("Working"),
    @XmlEnumValue("Pending")
    PENDING("Pending");
    private final String value;

    FetchStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FetchStatus fromValue(String v) {
        for (FetchStatus c: FetchStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
