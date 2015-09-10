
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseUsageReportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicenseUsageReportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Aggregate"/>
 *     &lt;enumeration value="DateQuantities"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicenseUsageReportType")
@XmlEnum
public enum LicenseUsageReportType {

    @XmlEnumValue("Aggregate")
    AGGREGATE("Aggregate"),
    @XmlEnumValue("DateQuantities")
    DATE_QUANTITIES("DateQuantities");
    private final String value;

    LicenseUsageReportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LicenseUsageReportType fromValue(String v) {
        for (LicenseUsageReportType c: LicenseUsageReportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
