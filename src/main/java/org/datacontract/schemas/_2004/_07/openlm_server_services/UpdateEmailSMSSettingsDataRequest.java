
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateEmailSMSSettingsDataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateEmailSMSSettingsDataRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="EmailSettings" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}EmailSettingsRequest" minOccurs="0"/>
 *         &lt;element name="SMSSettings" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}SMSSettingsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateEmailSMSSettingsDataRequest", propOrder = {
    "emailSettings",
    "smsSettings"
})
public class UpdateEmailSMSSettingsDataRequest
    extends BaseRequest
{

    @XmlElementRef(name = "EmailSettings", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<EmailSettingsRequest> emailSettings;
    @XmlElementRef(name = "SMSSettings", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<SMSSettingsRequest> smsSettings;

    /**
     * Gets the value of the emailSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmailSettingsRequest }{@code >}
     *     
     */
    public JAXBElement<EmailSettingsRequest> getEmailSettings() {
        return emailSettings;
    }

    /**
     * Sets the value of the emailSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmailSettingsRequest }{@code >}
     *     
     */
    public void setEmailSettings(JAXBElement<EmailSettingsRequest> value) {
        this.emailSettings = value;
    }

    /**
     * Gets the value of the smsSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SMSSettingsRequest }{@code >}
     *     
     */
    public JAXBElement<SMSSettingsRequest> getSMSSettings() {
        return smsSettings;
    }

    /**
     * Sets the value of the smsSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SMSSettingsRequest }{@code >}
     *     
     */
    public void setSMSSettings(JAXBElement<SMSSettingsRequest> value) {
        this.smsSettings = value;
    }

}
