
package org.datacontract.schemas._2004._07.openlm_licensemanager_openlmshared;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenLMLicenseTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpenLMLicenseTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Evaluation"/>
 *     &lt;enumeration value="Light"/>
 *     &lt;enumeration value="SingleVendor"/>
 *     &lt;enumeration value="Pro"/>
 *     &lt;enumeration value="Enterprise"/>
 *     &lt;enumeration value="Academic"/>
 *     &lt;enumeration value="Legacy"/>
 *     &lt;enumeration value="NotLicensed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OpenLMLicenseTypes", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.OpenLMShared.Enums")
@XmlEnum
public enum OpenLMLicenseTypes {

    @XmlEnumValue("Evaluation")
    EVALUATION("Evaluation"),
    @XmlEnumValue("Light")
    LIGHT("Light"),
    @XmlEnumValue("SingleVendor")
    SINGLE_VENDOR("SingleVendor"),
    @XmlEnumValue("Pro")
    PRO("Pro"),
    @XmlEnumValue("Enterprise")
    ENTERPRISE("Enterprise"),
    @XmlEnumValue("Academic")
    ACADEMIC("Academic"),
    @XmlEnumValue("Legacy")
    LEGACY("Legacy"),
    @XmlEnumValue("NotLicensed")
    NOT_LICENSED("NotLicensed");
    private final String value;

    OpenLMLicenseTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpenLMLicenseTypes fromValue(String v) {
        for (OpenLMLicenseTypes c: OpenLMLicenseTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
