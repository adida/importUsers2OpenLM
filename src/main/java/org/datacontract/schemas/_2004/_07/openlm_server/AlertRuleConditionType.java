
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertRuleConditionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertRuleConditionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="FeatureUsageByPercentage"/>
 *     &lt;enumeration value="LicenseDuplicateUsage"/>
 *     &lt;enumeration value="FeatureExpirationDate"/>
 *     &lt;enumeration value="NotConnectedLicenseManagers"/>
 *     &lt;enumeration value="UsersWithoutDefaultGroup"/>
 *     &lt;enumeration value="UsersWithoutDefaultProject"/>
 *     &lt;enumeration value="FeatureUsageByPeriod"/>
 *     &lt;enumeration value="MaxDenialsByPeriod"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertRuleConditionType", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums")
@XmlEnum
public enum AlertRuleConditionType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("FeatureUsageByPercentage")
    FEATURE_USAGE_BY_PERCENTAGE("FeatureUsageByPercentage"),
    @XmlEnumValue("LicenseDuplicateUsage")
    LICENSE_DUPLICATE_USAGE("LicenseDuplicateUsage"),
    @XmlEnumValue("FeatureExpirationDate")
    FEATURE_EXPIRATION_DATE("FeatureExpirationDate"),
    @XmlEnumValue("NotConnectedLicenseManagers")
    NOT_CONNECTED_LICENSE_MANAGERS("NotConnectedLicenseManagers"),
    @XmlEnumValue("UsersWithoutDefaultGroup")
    USERS_WITHOUT_DEFAULT_GROUP("UsersWithoutDefaultGroup"),
    @XmlEnumValue("UsersWithoutDefaultProject")
    USERS_WITHOUT_DEFAULT_PROJECT("UsersWithoutDefaultProject"),
    @XmlEnumValue("FeatureUsageByPeriod")
    FEATURE_USAGE_BY_PERIOD("FeatureUsageByPeriod"),
    @XmlEnumValue("MaxDenialsByPeriod")
    MAX_DENIALS_BY_PERIOD("MaxDenialsByPeriod");
    private final String value;

    AlertRuleConditionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertRuleConditionType fromValue(String v) {
        for (AlertRuleConditionType c: AlertRuleConditionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
