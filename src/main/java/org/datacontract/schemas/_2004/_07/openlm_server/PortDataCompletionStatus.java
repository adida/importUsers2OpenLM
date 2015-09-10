
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortDataCompletionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PortDataCompletionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Busy"/>
 *     &lt;enumeration value="Free"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PortDataCompletionStatus", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums")
@XmlEnum
public enum PortDataCompletionStatus {

    @XmlEnumValue("Busy")
    BUSY("Busy"),
    @XmlEnumValue("Free")
    FREE("Free"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    PortDataCompletionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PortDataCompletionStatus fromValue(String v) {
        for (PortDataCompletionStatus c: PortDataCompletionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
