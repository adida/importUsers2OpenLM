
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestEmailSettingsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestEmailSettingsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}EmailSettingsRequest">
 *       &lt;sequence>
 *         &lt;element name="EmailRecepientAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestEmailSettingsRequest", propOrder = {
    "emailRecepientAddress"
})
public class TestEmailSettingsRequest
    extends EmailSettingsRequest
{

    @XmlElementRef(name = "EmailRecepientAddress", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailRecepientAddress;

    /**
     * Gets the value of the emailRecepientAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailRecepientAddress() {
        return emailRecepientAddress;
    }

    /**
     * Sets the value of the emailRecepientAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailRecepientAddress(JAXBElement<String> value) {
        this.emailRecepientAddress = value;
    }

}
