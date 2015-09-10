
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddUnmanagedVendorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddUnmanagedVendorResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="features" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}UnmanagedProcessVendorRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddUnmanagedVendorResponse", propOrder = {
    "features"
})
public class AddUnmanagedVendorResponse
    extends BaseResponse
{

    @XmlElementRef(name = "features", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<UnmanagedProcessVendorRequest> features;

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnmanagedProcessVendorRequest }{@code >}
     *     
     */
    public JAXBElement<UnmanagedProcessVendorRequest> getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnmanagedProcessVendorRequest }{@code >}
     *     
     */
    public void setFeatures(JAXBElement<UnmanagedProcessVendorRequest> value) {
        this.features = value;
    }

}
