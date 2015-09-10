
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertSeverity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Alert"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Notice"/>
 *     &lt;enumeration value="System"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertSeverity", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums")
@XmlEnum
public enum AlertSeverity {

    @XmlEnumValue("Alert")
    ALERT("Alert"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Notice")
    NOTICE("Notice"),
    @XmlEnumValue("System")
    SYSTEM("System");
    private final String value;

    AlertSeverity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertSeverity fromValue(String v) {
        for (AlertSeverity c: AlertSeverity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
