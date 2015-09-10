
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnmanagedProcessVendorRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnmanagedProcessVendorRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}GetUnmanagedVendorRequest">
 *       &lt;sequence>
 *         &lt;element name="ProcessFeatures" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfUnmanagedProcessFeature" minOccurs="0"/>
 *         &lt;element name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnmanagedProcessVendorRequest", propOrder = {
    "processFeatures",
    "vendorName"
})
public class UnmanagedProcessVendorRequest
    extends GetUnmanagedVendorRequest
{

    @XmlElementRef(name = "ProcessFeatures", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUnmanagedProcessFeature> processFeatures;
    @XmlElementRef(name = "VendorName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorName;

    /**
     * Gets the value of the processFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnmanagedProcessFeature }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUnmanagedProcessFeature> getProcessFeatures() {
        return processFeatures;
    }

    /**
     * Sets the value of the processFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnmanagedProcessFeature }{@code >}
     *     
     */
    public void setProcessFeatures(JAXBElement<ArrayOfUnmanagedProcessFeature> value) {
        this.processFeatures = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendorName(JAXBElement<String> value) {
        this.vendorName = value;
    }

}
