
package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_server.AlertRuleDestinationType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AlertRuleDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertRuleDestination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomPattern" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IncludeInvolvedUsers" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SuppressDuplicates" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/>
 *         &lt;element name="TimePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums}AlertRuleDestinationType" minOccurs="0"/>
 *         &lt;element name="Users" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertRuleDestination", propOrder = {
    "address",
    "customPattern",
    "id",
    "includeInvolvedUsers",
    "order",
    "suppressDuplicates",
    "timePattern",
    "type",
    "users"
})
public class AlertRuleDestination {

    @XmlElementRef(name = "Address", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address;
    @XmlElement(name = "CustomPattern")
    protected Integer customPattern;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "IncludeInvolvedUsers", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> includeInvolvedUsers;
    @XmlElement(name = "Order")
    protected Integer order;
    @XmlElement(name = "SuppressDuplicates")
    protected Integer suppressDuplicates;
    @XmlElementRef(name = "TimePattern", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timePattern;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected AlertRuleDestinationType type;
    @XmlElementRef(name = "Users", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUser> users;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress(JAXBElement<String> value) {
        this.address = value;
    }

    /**
     * Gets the value of the customPattern property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomPattern() {
        return customPattern;
    }

    /**
     * Sets the value of the customPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomPattern(Integer value) {
        this.customPattern = value;
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
     * Gets the value of the includeInvolvedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIncludeInvolvedUsers() {
        return includeInvolvedUsers;
    }

    /**
     * Sets the value of the includeInvolvedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIncludeInvolvedUsers(JAXBElement<Integer> value) {
        this.includeInvolvedUsers = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

    /**
     * Gets the value of the suppressDuplicates property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuppressDuplicates() {
        return suppressDuplicates;
    }

    /**
     * Sets the value of the suppressDuplicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuppressDuplicates(Integer value) {
        this.suppressDuplicates = value;
    }

    /**
     * Gets the value of the timePattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimePattern() {
        return timePattern;
    }

    /**
     * Sets the value of the timePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimePattern(JAXBElement<String> value) {
        this.timePattern = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AlertRuleDestinationType }
     *     
     */
    public AlertRuleDestinationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertRuleDestinationType }
     *     
     */
    public void setType(AlertRuleDestinationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUser> getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}
     *     
     */
    public void setUsers(JAXBElement<ArrayOfUser> value) {
        this.users = value;
    }

}
