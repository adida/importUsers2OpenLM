
package org.datacontract.schemas._2004._07.openlm_shared_public;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouterStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RouterStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="NoReporting"/>
 *     &lt;enumeration value="ListenerPortError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RouterStatus")
@XmlEnum
public enum RouterStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("NoReporting")
    NO_REPORTING("NoReporting"),
    @XmlEnumValue("ListenerPortError")
    LISTENER_PORT_ERROR("ListenerPortError");
    private final String value;

    RouterStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RouterStatus fromValue(String v) {
        for (RouterStatus c: RouterStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
