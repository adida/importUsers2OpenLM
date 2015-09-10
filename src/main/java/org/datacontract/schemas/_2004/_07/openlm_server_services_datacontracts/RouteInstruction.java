
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import org.datacontract.schemas._2004._07.openlm_shared_public.RouterListenerPortProtocol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RouteInstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteInstruction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientIPEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientIPStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Deny" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LimitPeriods" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}ArrayOfLimitPeriod" minOccurs="0"/>
 *         &lt;element name="ListenerPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListenerPortProtocol" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums}RouterListenerPortProtocol" minOccurs="0"/>
 *         &lt;element name="TargetHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteInstruction", propOrder = {
    "clientIPEnd",
    "clientIPStart",
    "deny",
    "enabled",
    "id",
    "limitPeriods",
    "listenerPort",
    "listenerPortProtocol",
    "targetHost",
    "targetPort"
})
@XmlSeeAlso({
    RouteInstructionDisplay.class
})
public class RouteInstruction {

    @XmlElementRef(name = "ClientIPEnd", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientIPEnd;
    @XmlElementRef(name = "ClientIPStart", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientIPStart;
    @XmlElement(name = "Deny")
    protected Boolean deny;
    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "LimitPeriods", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLimitPeriod> limitPeriods;
    @XmlElementRef(name = "ListenerPort", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> listenerPort;
    @XmlElement(name = "ListenerPortProtocol")
    @XmlSchemaType(name = "string")
    protected RouterListenerPortProtocol listenerPortProtocol;
    @XmlElementRef(name = "TargetHost", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> targetHost;
    @XmlElementRef(name = "TargetPort", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> targetPort;

    /**
     * Gets the value of the clientIPEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientIPEnd() {
        return clientIPEnd;
    }

    /**
     * Sets the value of the clientIPEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientIPEnd(JAXBElement<String> value) {
        this.clientIPEnd = value;
    }

    /**
     * Gets the value of the clientIPStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientIPStart() {
        return clientIPStart;
    }

    /**
     * Sets the value of the clientIPStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientIPStart(JAXBElement<String> value) {
        this.clientIPStart = value;
    }

    /**
     * Gets the value of the deny property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeny() {
        return deny;
    }

    /**
     * Sets the value of the deny property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeny(Boolean value) {
        this.deny = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
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
     * Gets the value of the limitPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLimitPeriod }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLimitPeriod> getLimitPeriods() {
        return limitPeriods;
    }

    /**
     * Sets the value of the limitPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLimitPeriod }{@code >}
     *     
     */
    public void setLimitPeriods(JAXBElement<ArrayOfLimitPeriod> value) {
        this.limitPeriods = value;
    }

    /**
     * Gets the value of the listenerPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getListenerPort() {
        return listenerPort;
    }

    /**
     * Sets the value of the listenerPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setListenerPort(JAXBElement<String> value) {
        this.listenerPort = value;
    }

    /**
     * Gets the value of the listenerPortProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link RouterListenerPortProtocol }
     *     
     */
    public RouterListenerPortProtocol getListenerPortProtocol() {
        return listenerPortProtocol;
    }

    /**
     * Sets the value of the listenerPortProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouterListenerPortProtocol }
     *     
     */
    public void setListenerPortProtocol(RouterListenerPortProtocol value) {
        this.listenerPortProtocol = value;
    }

    /**
     * Gets the value of the targetHost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTargetHost() {
        return targetHost;
    }

    /**
     * Sets the value of the targetHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTargetHost(JAXBElement<String> value) {
        this.targetHost = value;
    }

    /**
     * Gets the value of the targetPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTargetPort() {
        return targetPort;
    }

    /**
     * Sets the value of the targetPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTargetPort(JAXBElement<String> value) {
        this.targetPort = value;
    }

}
