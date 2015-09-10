
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AlertRuleComponentsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertRuleComponentsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Conditions" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfAlertRuleCondition" minOccurs="0"/>
 *         &lt;element name="Destinations" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfAlertRuleDestination" minOccurs="0"/>
 *         &lt;element name="RuleID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertRuleComponentsResponse", propOrder = {
    "conditions",
    "destinations",
    "ruleID"
})
public class AlertRuleComponentsResponse
    extends BaseResponse
{

    @XmlElementRef(name = "Conditions", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAlertRuleCondition> conditions;
    @XmlElementRef(name = "Destinations", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAlertRuleDestination> destinations;
    @XmlElement(name = "RuleID")
    protected Integer ruleID;

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleCondition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAlertRuleCondition> getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleCondition }{@code >}
     *     
     */
    public void setConditions(JAXBElement<ArrayOfAlertRuleCondition> value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the destinations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleDestination }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAlertRuleDestination> getDestinations() {
        return destinations;
    }

    /**
     * Sets the value of the destinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleDestination }{@code >}
     *     
     */
    public void setDestinations(JAXBElement<ArrayOfAlertRuleDestination> value) {
        this.destinations = value;
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

}
