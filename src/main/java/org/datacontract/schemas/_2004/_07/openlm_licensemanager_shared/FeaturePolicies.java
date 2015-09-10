
package org.datacontract.schemas._2004._07.openlm_licensemanager_shared;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeaturePolicies.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeaturePolicies">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="overwrite"/>
 *     &lt;enumeration value="increment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeaturePolicies", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Enums")
@XmlEnum
public enum FeaturePolicies {

    @XmlEnumValue("overwrite")
    OVERWRITE("overwrite"),
    @XmlEnumValue("increment")
    INCREMENT("increment");
    private final String value;

    FeaturePolicies(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeaturePolicies fromValue(String v) {
        for (FeaturePolicies c: FeaturePolicies.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
