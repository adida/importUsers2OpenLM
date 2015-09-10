
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.AlertRuleComponentsResponse;

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
 *         &lt;element name="GetAlertRuleComponentsResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}AlertRuleComponentsResponse" minOccurs="0"/>
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
    "getAlertRuleComponentsResult"
})
@XmlRootElement(name = "GetAlertRuleComponentsResponse")
public class GetAlertRuleComponentsResponse {

    @XmlElementRef(name = "GetAlertRuleComponentsResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<AlertRuleComponentsResponse> getAlertRuleComponentsResult;

    /**
     * Gets the value of the getAlertRuleComponentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlertRuleComponentsResponse }{@code >}
     *     
     */
    public JAXBElement<AlertRuleComponentsResponse> getGetAlertRuleComponentsResult() {
        return getAlertRuleComponentsResult;
    }

    /**
     * Sets the value of the getAlertRuleComponentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlertRuleComponentsResponse }{@code >}
     *     
     */
    public void setGetAlertRuleComponentsResult(JAXBElement<AlertRuleComponentsResponse> value) {
        this.getAlertRuleComponentsResult = value;
    }

}
