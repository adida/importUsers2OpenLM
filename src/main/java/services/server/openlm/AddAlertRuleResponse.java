
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.AlertRuleResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddAlertRuleResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}AlertRuleResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addAlertRuleResult"
})
@XmlRootElement(name = "AddAlertRuleResponse")
public class AddAlertRuleResponse {

    @XmlElementRef(name = "AddAlertRuleResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<AlertRuleResponse> addAlertRuleResult;

    /**
     * Gets the value of the addAlertRuleResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlertRuleResponse }{@code >}
     *     
     */
    public JAXBElement<AlertRuleResponse> getAddAlertRuleResult() {
        return addAlertRuleResult;
    }

    /**
     * Sets the value of the addAlertRuleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlertRuleResponse }{@code >}
     *     
     */
    public void setAddAlertRuleResult(JAXBElement<AlertRuleResponse> value) {
        this.addAlertRuleResult = value;
    }

}
