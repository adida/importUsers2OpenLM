
package org.datacontract.schemas._2004._07.openlm_shared_public;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouterListenerPortProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RouterListenerPortProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="TCP"/>
 *     &lt;enumeration value="UDP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RouterListenerPortProtocol")
@XmlEnum
public enum RouterListenerPortProtocol {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    TCP("TCP"),
    UDP("UDP");
    private final String value;

    RouterListenerPortProtocol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RouterListenerPortProtocol fromValue(String v) {
        for (RouterListenerPortProtocol c: RouterListenerPortProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
