
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertRuleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertRuleRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="Rule" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}AlertRule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertRuleRequest", propOrder = {
    "rule"
})
public class AlertRuleRequest
    extends BaseRequest
{

    @XmlElementRef(name = "Rule", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<AlertRule> rule;

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlertRule }{@code >}
     *     
     */
    public JAXBElement<AlertRule> getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlertRule }{@code >}
     *     
     */
    public void setRule(JAXBElement<AlertRule> value) {
        this.rule = value;
    }

}
