
package org.datacontract.schemas._2004._07.openlm_server_dal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentStepKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgentStepKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LicenseManager"/>
 *     &lt;enumeration value="AgentKill"/>
 *     &lt;enumeration value="AgentSuspend"/>
 *     &lt;enumeration value="AgentScript"/>
 *     &lt;enumeration value="AgentRelease"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgentStepKind", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.DAL.Domain")
@XmlEnum
public enum AgentStepKind {

    @XmlEnumValue("LicenseManager")
    LICENSE_MANAGER("LicenseManager"),
    @XmlEnumValue("AgentKill")
    AGENT_KILL("AgentKill"),
    @XmlEnumValue("AgentSuspend")
    AGENT_SUSPEND("AgentSuspend"),
    @XmlEnumValue("AgentScript")
    AGENT_SCRIPT("AgentScript"),
    @XmlEnumValue("AgentRelease")
    AGENT_RELEASE("AgentRelease");
    private final String value;

    AgentStepKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgentStepKind fromValue(String v) {
        for (AgentStepKind c: AgentStepKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
