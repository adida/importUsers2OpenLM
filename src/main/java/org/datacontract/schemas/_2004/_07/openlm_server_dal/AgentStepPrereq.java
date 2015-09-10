
package org.datacontract.schemas._2004._07.openlm_server_dal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentStepPrereq.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgentStepPrereq">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoWait"/>
 *     &lt;enumeration value="WaitComplete"/>
 *     &lt;enumeration value="WaitSuccess"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgentStepPrereq", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.DAL.Domain")
@XmlEnum
public enum AgentStepPrereq {

    @XmlEnumValue("NoWait")
    NO_WAIT("NoWait"),
    @XmlEnumValue("WaitComplete")
    WAIT_COMPLETE("WaitComplete"),
    @XmlEnumValue("WaitSuccess")
    WAIT_SUCCESS("WaitSuccess");
    private final String value;

    AgentStepPrereq(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgentStepPrereq fromValue(String v) {
        for (AgentStepPrereq c: AgentStepPrereq.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
