
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertConditionOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertConditionOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GreaterThan"/>
 *     &lt;enumeration value="GreaterThanOrEquals"/>
 *     &lt;enumeration value="LessThan"/>
 *     &lt;enumeration value="LessThanOrEquals"/>
 *     &lt;enumeration value="Equals"/>
 *     &lt;enumeration value="NotEqual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertConditionOperator", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums")
@XmlEnum
public enum AlertConditionOperator {

    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("GreaterThanOrEquals")
    GREATER_THAN_OR_EQUALS("GreaterThanOrEquals"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("LessThanOrEquals")
    LESS_THAN_OR_EQUALS("LessThanOrEquals"),
    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("NotEqual")
    NOT_EQUAL("NotEqual");
    private final String value;

    AlertConditionOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertConditionOperator fromValue(String v) {
        for (AlertConditionOperator c: AlertConditionOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
