
package org.datacontract.schemas._2004._07.openlm_shared_public;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseManagerStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicenseManagerStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="DOWN"/>
 *     &lt;enumeration value="UP"/>
 *     &lt;enumeration value="PARTIAL"/>
 *     &lt;enumeration value="NO_VALID_LIC_FILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicenseManagerStatus")
@XmlEnum
public enum LicenseManagerStatus {

    UNKNOWN,
    DOWN,
    UP,
    PARTIAL,
    NO_VALID_LIC_FILE;

    public String value() {
        return name();
    }

    public static LicenseManagerStatus fromValue(String v) {
        return valueOf(v);
    }

}
