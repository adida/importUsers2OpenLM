
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import org.datacontract.schemas._2004._07.openlm_server.UpdateAction;
import org.datacontract.schemas._2004._07.openlm_shared.SlimDateTime;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RouterInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouterInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CanUpdateDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Config" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}RouterConfig" minOccurs="0"/>
 *         &lt;element name="ConfiguredDate" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Details" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}RouterDetails" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UpdateAction" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums}UpdateAction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouterInfo", propOrder = {
    "canUpdateDetails",
    "config",
    "configuredDate",
    "description",
    "details",
    "id",
    "updateAction"
})
public class RouterInfo {

    @XmlElement(name = "CanUpdateDetails")
    protected Boolean canUpdateDetails;
    @XmlElementRef(name = "Config", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<RouterConfig> config;
    @XmlElementRef(name = "ConfiguredDate", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> configuredDate;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Details", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<RouterDetails> details;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "UpdateAction")
    @XmlSchemaType(name = "string")
    protected UpdateAction updateAction;

    /**
     * Gets the value of the canUpdateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanUpdateDetails() {
        return canUpdateDetails;
    }

    /**
     * Sets the value of the canUpdateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanUpdateDetails(Boolean value) {
        this.canUpdateDetails = value;
    }

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouterConfig }{@code >}
     *     
     */
    public JAXBElement<RouterConfig> getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouterConfig }{@code >}
     *     
     */
    public void setConfig(JAXBElement<RouterConfig> value) {
        this.config = value;
    }

    /**
     * Gets the value of the configuredDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getConfiguredDate() {
        return configuredDate;
    }

    /**
     * Sets the value of the configuredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setConfiguredDate(JAXBElement<SlimDateTime> value) {
        this.configuredDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouterDetails }{@code >}
     *     
     */
    public JAXBElement<RouterDetails> getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouterDetails }{@code >}
     *     
     */
    public void setDetails(JAXBElement<RouterDetails> value) {
        this.details = value;
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
     * Gets the value of the updateAction property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateAction }
     *     
     */
    public UpdateAction getUpdateAction() {
        return updateAction;
    }

    /**
     * Sets the value of the updateAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateAction }
     *     
     */
    public void setUpdateAction(UpdateAction value) {
        this.updateAction = value;
    }

}
