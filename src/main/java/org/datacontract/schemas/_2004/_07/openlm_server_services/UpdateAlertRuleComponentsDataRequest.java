
package org.datacontract.schemas._2004._07.openlm_server_services;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for UpdateAlertRuleComponentsDataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateAlertRuleComponentsDataRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="AddedConditions" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfAlertRuleCondition" minOccurs="0"/>
 *         &lt;element name="AddedDestinations" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfAlertRuleDestination" minOccurs="0"/>
 *         &lt;element name="DeletedConditions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="DeletedDestinations" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="RuleID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UpdatedConditions" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfAlertRuleCondition" minOccurs="0"/>
 *         &lt;element name="UpdatedDestinations" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfAlertRuleDestination" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateAlertRuleComponentsDataRequest", propOrder = {
    "addedConditions",
    "addedDestinations",
    "deletedConditions",
    "deletedDestinations",
    "ruleID",
    "updatedConditions",
    "updatedDestinations"
})
public class UpdateAlertRuleComponentsDataRequest
    extends BaseRequest
{

    @XmlElementRef(name = "AddedConditions", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAlertRuleCondition> addedConditions;
    @XmlElementRef(name = "AddedDestinations", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAlertRuleDestination> addedDestinations;
    @XmlElementRef(name = "DeletedConditions", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> deletedConditions;
    @XmlElementRef(name = "DeletedDestinations", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> deletedDestinations;
    @XmlElement(name = "RuleID")
    protected Integer ruleID;
    @XmlElementRef(name = "UpdatedConditions", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAlertRuleCondition> updatedConditions;
    @XmlElementRef(name = "UpdatedDestinations", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAlertRuleDestination> updatedDestinations;

    /**
     * Gets the value of the addedConditions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleCondition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAlertRuleCondition> getAddedConditions() {
        return addedConditions;
    }

    /**
     * Sets the value of the addedConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleCondition }{@code >}
     *     
     */
    public void setAddedConditions(JAXBElement<ArrayOfAlertRuleCondition> value) {
        this.addedConditions = value;
    }

    /**
     * Gets the value of the addedDestinations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleDestination }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAlertRuleDestination> getAddedDestinations() {
        return addedDestinations;
    }

    /**
     * Sets the value of the addedDestinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleDestination }{@code >}
     *     
     */
    public void setAddedDestinations(JAXBElement<ArrayOfAlertRuleDestination> value) {
        this.addedDestinations = value;
    }

    /**
     * Gets the value of the deletedConditions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getDeletedConditions() {
        return deletedConditions;
    }

    /**
     * Sets the value of the deletedConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setDeletedConditions(JAXBElement<ArrayOfint> value) {
        this.deletedConditions = value;
    }

    /**
     * Gets the value of the deletedDestinations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getDeletedDestinations() {
        return deletedDestinations;
    }

    /**
     * Sets the value of the deletedDestinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setDeletedDestinations(JAXBElement<ArrayOfint> value) {
        this.deletedDestinations = value;
    }

    /**
     * Gets the value of the ruleID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRuleID() {
        return ruleID;
    }

    /**
     * Sets the value of the ruleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRuleID(Integer value) {
        this.ruleID = value;
    }

    /**
     * Gets the value of the updatedConditions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleCondition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAlertRuleCondition> getUpdatedConditions() {
        return updatedConditions;
    }

    /**
     * Sets the value of the updatedConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleCondition }{@code >}
     *     
     */
    public void setUpdatedConditions(JAXBElement<ArrayOfAlertRuleCondition> value) {
        this.updatedConditions = value;
    }

    /**
     * Gets the value of the updatedDestinations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleDestination }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAlertRuleDestination> getUpdatedDestinations() {
        return updatedDestinations;
    }

    /**
     * Sets the value of the updatedDestinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleDestination }{@code >}
     *     
     */
    public void setUpdatedDestinations(JAXBElement<ArrayOfAlertRuleDestination> value) {
        this.updatedDestinations = value;
    }

}
