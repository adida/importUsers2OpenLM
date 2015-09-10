
package org.datacontract.schemas._2004._07.openlm_shared;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseReleaseMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicenseReleaseMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Extension"/>
 *     &lt;enumeration value="Suspension"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Procedure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicenseReleaseMethod", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Shared.Enums")
@XmlEnum
public enum LicenseReleaseMethod {

    @XmlEnumValue("Extension")
    EXTENSION("Extension"),
    @XmlEnumValue("Suspension")
    SUSPENSION("Suspension"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Procedure")
    PROCEDURE("Procedure");
    private final String value;

    LicenseReleaseMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LicenseReleaseMethod fromValue(String v) {
        for (LicenseReleaseMethod c: LicenseReleaseMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
