
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.EmailSMSSettingsResponse;

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
 *         &lt;element name="GetEmailSMSSettingsResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}EmailSMSSettingsResponse" minOccurs="0"/>
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
    "getEmailSMSSettingsResult"
})
@XmlRootElement(name = "GetEmailSMSSettingsResponse")
public class GetEmailSMSSettingsResponse {

    @XmlElementRef(name = "GetEmailSMSSettingsResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<EmailSMSSettingsResponse> getEmailSMSSettingsResult;

    /**
     * Gets the value of the getEmailSMSSettingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmailSMSSettingsResponse }{@code >}
     *     
     */
    public JAXBElement<EmailSMSSettingsResponse> getGetEmailSMSSettingsResult() {
        return getEmailSMSSettingsResult;
    }

    /**
     * Sets the value of the getEmailSMSSettingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmailSMSSettingsResponse }{@code >}
     *     
     */
    public void setGetEmailSMSSettingsResult(JAXBElement<EmailSMSSettingsResponse> value) {
        this.getEmailSMSSettingsResult = value;
    }

}
