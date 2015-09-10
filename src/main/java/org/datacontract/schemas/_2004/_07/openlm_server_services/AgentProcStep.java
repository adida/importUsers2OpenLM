
package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_server_dal.AgentStepKind;
import org.datacontract.schemas._2004._07.openlm_server_dal.AgentStepPrereq;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AgentProcStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentProcStep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Kind" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.DAL.Domain}AgentStepKind" minOccurs="0"/>
 *         &lt;element name="Ordinal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Prereq" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.DAL.Domain}AgentStepPrereq" minOccurs="0"/>
 *         &lt;element name="ScriptInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentProcStep", propOrder = {
    "active",
    "id",
    "kind",
    "ordinal",
    "prereq",
    "scriptInfo"
})
public class AgentProcStep {

    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "Kind")
    @XmlSchemaType(name = "string")
    protected AgentStepKind kind;
    @XmlElement(name = "Ordinal")
    protected Integer ordinal;
    @XmlElement(name = "Prereq")
    @XmlSchemaType(name = "string")
    protected AgentStepPrereq prereq;
    @XmlElementRef(name = "ScriptInfo", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scriptInfo;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link AgentStepKind }
     *     
     */
    public AgentStepKind getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentStepKind }
     *     
     */
    public void setKind(AgentStepKind value) {
        this.kind = value;
    }

    /**
     * Gets the value of the ordinal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    /**
     * Sets the value of the ordinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdinal(Integer value) {
        this.ordinal = value;
    }

    /**
     * Gets the value of the prereq property.
     * 
     * @return
     *     possible object is
     *     {@link AgentStepPrereq }
     *     
     */
    public AgentStepPrereq getPrereq() {
        return prereq;
    }

    /**
     * Sets the value of the prereq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentStepPrereq }
     *     
     */
    public void setPrereq(AgentStepPrereq value) {
        this.prereq = value;
    }

    /**
     * Gets the value of the scriptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScriptInfo() {
        return scriptInfo;
    }

    /**
     * Sets the value of the scriptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScriptInfo(JAXBElement<String> value) {
        this.scriptInfo = value;
    }

}
