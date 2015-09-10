
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.AlertsRulesResponse;

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
 *         &lt;element name="GetAlertsRulesResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}AlertsRulesResponse" minOccurs="0"/>
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
    "getAlertsRulesResult"
})
@XmlRootElement(name = "GetAlertsRulesResponse")
public class GetAlertsRulesResponse {

    @XmlElementRef(name = "GetAlertsRulesResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<AlertsRulesResponse> getAlertsRulesResult;

    /**
     * Gets the value of the getAlertsRulesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlertsRulesResponse }{@code >}
     *     
     */
    public JAXBElement<AlertsRulesResponse> getGetAlertsRulesResult() {
        return getAlertsRulesResult;
    }

    /**
     * Sets the value of the getAlertsRulesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlertsRulesResponse }{@code >}
     *     
     */
    public void setGetAlertsRulesResult(JAXBElement<AlertsRulesResponse> value) {
        this.getAlertsRulesResult = value;
    }

}
