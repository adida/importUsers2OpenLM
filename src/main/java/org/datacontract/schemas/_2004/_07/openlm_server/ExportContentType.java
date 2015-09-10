
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExportContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Link"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExportContentType", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums")
@XmlEnum
public enum ExportContentType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Link")
    LINK("Link");
    private final String value;

    ExportContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExportContentType fromValue(String v) {
        for (ExportContentType c: ExportContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
