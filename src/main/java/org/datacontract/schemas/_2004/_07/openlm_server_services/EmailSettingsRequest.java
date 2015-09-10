
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for EmailSettingsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailSettingsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="EmailEnableSSL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmailPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailSendingAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailSmtpHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailSmtpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EmailUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailSettingsRequest", propOrder = {
    "emailEnableSSL",
    "emailPwd",
    "emailSendingAddress",
    "emailSmtpHost",
    "emailSmtpPort",
    "emailUsername"
})
@XmlSeeAlso({
    TestEmailSettingsRequest.class
})
public class EmailSettingsRequest
    extends BaseRequest
{

    @XmlElement(name = "EmailEnableSSL")
    protected Boolean emailEnableSSL;
    @XmlElementRef(name = "EmailPwd", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailPwd;
    @XmlElementRef(name = "EmailSendingAddress", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailSendingAddress;
    @XmlElementRef(name = "EmailSmtpHost", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailSmtpHost;
    @XmlElementRef(name = "EmailSmtpPort", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> emailSmtpPort;
    @XmlElementRef(name = "EmailUsername", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailUsername;

    /**
     * Gets the value of the emailEnableSSL property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailEnableSSL() {
        return emailEnableSSL;
    }

    /**
     * Sets the value of the emailEnableSSL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailEnableSSL(Boolean value) {
        this.emailEnableSSL = value;
    }

    /**
     * Gets the value of the emailPwd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailPwd() {
        return emailPwd;
    }

    /**
     * Sets the value of the emailPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailPwd(JAXBElement<String> value) {
        this.emailPwd = value;
    }

    /**
     * Gets the value of the emailSendingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailSendingAddress() {
        return emailSendingAddress;
    }

    /**
     * Sets the value of the emailSendingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailSendingAddress(JAXBElement<String> value) {
        this.emailSendingAddress = value;
    }

    /**
     * Gets the value of the emailSmtpHost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailSmtpHost() {
        return emailSmtpHost;
    }

    /**
     * Sets the value of the emailSmtpHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailSmtpHost(JAXBElement<String> value) {
        this.emailSmtpHost = value;
    }

    /**
     * Gets the value of the emailSmtpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEmailSmtpPort() {
        return emailSmtpPort;
    }

    /**
     * Sets the value of the emailSmtpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEmailSmtpPort(JAXBElement<Integer> value) {
        this.emailSmtpPort = value;
    }

    /**
     * Gets the value of the emailUsername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailUsername() {
        return emailUsername;
    }

    /**
     * Sets the value of the emailUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailUsername(JAXBElement<String> value) {
        this.emailUsername = value;
    }

}
