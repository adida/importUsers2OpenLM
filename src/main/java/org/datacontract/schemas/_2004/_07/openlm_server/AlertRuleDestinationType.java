
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertRuleDestinationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertRuleDestinationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="EasyAdmin"/>
 *     &lt;enumeration value="EventLog"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertRuleDestinationType", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums")
@XmlEnum
public enum AlertRuleDestinationType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    SMS("SMS"),
    @XmlEnumValue("EasyAdmin")
    EASY_ADMIN("EasyAdmin"),
    @XmlEnumValue("EventLog")
    EVENT_LOG("EventLog");
    private final String value;

    AlertRuleDestinationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertRuleDestinationType fromValue(String v) {
        for (AlertRuleDestinationType c: AlertRuleDestinationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
