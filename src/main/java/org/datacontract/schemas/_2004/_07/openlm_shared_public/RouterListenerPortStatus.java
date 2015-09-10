
package org.datacontract.schemas._2004._07.openlm_shared_public;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouterListenerPortStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RouterListenerPortStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Ok"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RouterListenerPortStatus")
@XmlEnum
public enum RouterListenerPortStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Ok")
    OK("Ok"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    RouterListenerPortStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RouterListenerPortStatus fromValue(String v) {
        for (RouterListenerPortStatus c: RouterListenerPortStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
