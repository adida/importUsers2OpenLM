
package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_server.ArrayOfAlertRuleConditionDefinition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertRuleConditionDefinitionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertRuleConditionDefinitionsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="RuleConditionDefinitions" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfAlertRuleConditionDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertRuleConditionDefinitionsResponse", propOrder = {
    "ruleConditionDefinitions"
})
public class AlertRuleConditionDefinitionsResponse
    extends BaseResponse
{

    @XmlElementRef(name = "RuleConditionDefinitions", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAlertRuleConditionDefinition> ruleConditionDefinitions;

    /**
     * Gets the value of the ruleConditionDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleConditionDefinition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAlertRuleConditionDefinition> getRuleConditionDefinitions() {
        return ruleConditionDefinitions;
    }

    /**
     * Sets the value of the ruleConditionDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleConditionDefinition }{@code >}
     *     
     */
    public void setRuleConditionDefinitions(JAXBElement<ArrayOfAlertRuleConditionDefinition> value) {
        this.ruleConditionDefinitions = value;
    }

}
