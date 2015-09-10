
package org.datacontract.schemas._2004._07.openlm_licensemanager_shared;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for EffectiveLicenseFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EffectiveLicenseFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeatureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Features" type="{http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain}ArrayOfLicenseFeature" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EffectiveLicenseFeature", propOrder = {
    "featureName",
    "features",
    "quantity",
    "value",
    "vendorName"
})
public class EffectiveLicenseFeature {

    @XmlElementRef(name = "FeatureName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> featureName;
    @XmlElementRef(name = "Features", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLicenseFeature> features;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElementRef(name = "Value", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> value;
    @XmlElementRef(name = "VendorName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorName;

    /**
     * Gets the value of the featureName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFeatureName() {
        return featureName;
    }

    /**
     * Sets the value of the featureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFeatureName(JAXBElement<String> value) {
        this.featureName = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseFeature }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLicenseFeature> getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseFeature }{@code >}
     *     
     */
    public void setFeatures(JAXBElement<ArrayOfLicenseFeature> value) {
        this.features = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValue(JAXBElement<String> value) {
        this.value = value;
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
