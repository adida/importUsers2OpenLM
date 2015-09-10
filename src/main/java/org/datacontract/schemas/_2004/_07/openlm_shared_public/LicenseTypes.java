
package org.datacontract.schemas._2004._07.openlm_shared_public;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicenseTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Floating"/>
 *     &lt;enumeration value="NodeLocked"/>
 *     &lt;enumeration value="NamedUser"/>
 *     &lt;enumeration value="SingleUse"/>
 *     &lt;enumeration value="NamedUserCasual"/>
 *     &lt;enumeration value="HostBased"/>
 *     &lt;enumeration value="Unmanaged"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicenseTypes")
@XmlEnum
public enum LicenseTypes {

    @XmlEnumValue("Floating")
    FLOATING("Floating"),
    @XmlEnumValue("NodeLocked")
    NODE_LOCKED("NodeLocked"),
    @XmlEnumValue("NamedUser")
    NAMED_USER("NamedUser"),
    @XmlEnumValue("SingleUse")
    SINGLE_USE("SingleUse"),
    @XmlEnumValue("NamedUserCasual")
    NAMED_USER_CASUAL("NamedUserCasual"),
    @XmlEnumValue("HostBased")
    HOST_BASED("HostBased"),
    @XmlEnumValue("Unmanaged")
    UNMANAGED("Unmanaged");
    private final String value;

    LicenseTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LicenseTypes fromValue(String v) {
        for (LicenseTypes c: LicenseTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
