
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertsRulesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertsRulesResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Rules" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfAlertRule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertsRulesResponse", propOrder = {
    "rules"
})
public class AlertsRulesResponse
    extends BaseResponse
{

    @XmlElementRef(name = "Rules", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAlertRule> rules;

    /**
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRule }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAlertRule> getRules() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlertRule }{@code >}
     *     
     */
    public void setRules(JAXBElement<ArrayOfAlertRule> value) {
        this.rules = value;
    }

}
