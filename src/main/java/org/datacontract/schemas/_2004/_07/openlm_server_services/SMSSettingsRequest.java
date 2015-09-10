
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SMSSettingsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SMSSettingsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="SmsClickatellApiId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmsPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmsServerUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmsUseUnicode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmsUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMSSettingsRequest", propOrder = {
    "smsClickatellApiId",
    "smsPwd",
    "smsServerUrl",
    "smsUseUnicode",
    "smsUsername"
})
@XmlSeeAlso({
    TestSmsSettingsRequest.class
})
public class SMSSettingsRequest
    extends BaseRequest
{

    @XmlElementRef(name = "SmsClickatellApiId", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> smsClickatellApiId;
    @XmlElementRef(name = "SmsPwd", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> smsPwd;
    @XmlElementRef(name = "SmsServerUrl", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> smsServerUrl;
    @XmlElementRef(name = "SmsUseUnicode", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> smsUseUnicode;
    @XmlElementRef(name = "SmsUsername", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> smsUsername;

    /**
     * Gets the value of the smsClickatellApiId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSmsClickatellApiId() {
        return smsClickatellApiId;
    }

    /**
     * Sets the value of the smsClickatellApiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSmsClickatellApiId(JAXBElement<String> value) {
        this.smsClickatellApiId = value;
    }

    /**
     * Gets the value of the smsPwd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSmsPwd() {
        return smsPwd;
    }

    /**
     * Sets the value of the smsPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSmsPwd(JAXBElement<String> value) {
        this.smsPwd = value;
    }

    /**
     * Gets the value of the smsServerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSmsServerUrl() {
        return smsServerUrl;
    }

    /**
     * Sets the value of the smsServerUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSmsServerUrl(JAXBElement<String> value) {
        this.smsServerUrl = value;
    }

    /**
     * Gets the value of the smsUseUnicode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSmsUseUnicode() {
        return smsUseUnicode;
    }

    /**
     * Sets the value of the smsUseUnicode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSmsUseUnicode(JAXBElement<String> value) {
        this.smsUseUnicode = value;
    }

    /**
     * Gets the value of the smsUsername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSmsUsername() {
        return smsUsername;
    }

    /**
     * Sets the value of the smsUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSmsUsername(JAXBElement<String> value) {
        this.smsUsername = value;
    }

}
