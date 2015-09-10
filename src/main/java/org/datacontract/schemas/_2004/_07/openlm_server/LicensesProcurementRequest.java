
package org.datacontract.schemas._2004._07.openlm_server;

import org.datacontract.schemas._2004._07.openlm_server_services.BaseRequest;
import org.datacontract.schemas._2004._07.openlm_shared.SlimDateTime;
import org.datacontract.schemas._2004._07.openlm_shared_public.ArrayOfLicenseTypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LicensesProcurementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicensesProcurementRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="AssetInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpiresBefore" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="Features" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfFeatureProductVersion" minOccurs="0"/>
 *         &lt;element name="IncludeObsolete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LicenseTypes" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums}ArrayOfLicenseTypes" minOccurs="0"/>
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
@XmlType(name = "LicensesProcurementRequest", propOrder = {
    "assetInfo",
    "expiresBefore",
    "features",
    "includeObsolete",
    "licenseTypes",
    "vendorName"
})
public class LicensesProcurementRequest
    extends BaseRequest
{

    @XmlElementRef(name = "AssetInfo", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assetInfo;
    @XmlElementRef(name = "ExpiresBefore", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> expiresBefore;
    @XmlElementRef(name = "Features", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFeatureProductVersion> features;
    @XmlElement(name = "IncludeObsolete")
    protected Boolean includeObsolete;
    @XmlElementRef(name = "LicenseTypes", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLicenseTypes> licenseTypes;
    @XmlElementRef(name = "VendorName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorName;

    /**
     * Gets the value of the assetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssetInfo() {
        return assetInfo;
    }

    /**
     * Sets the value of the assetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssetInfo(JAXBElement<String> value) {
        this.assetInfo = value;
    }

    /**
     * Gets the value of the expiresBefore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getExpiresBefore() {
        return expiresBefore;
    }

    /**
     * Sets the value of the expiresBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setExpiresBefore(JAXBElement<SlimDateTime> value) {
        this.expiresBefore = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFeatureProductVersion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFeatureProductVersion> getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFeatureProductVersion }{@code >}
     *     
     */
    public void setFeatures(JAXBElement<ArrayOfFeatureProductVersion> value) {
        this.features = value;
    }

    /**
     * Gets the value of the includeObsolete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeObsolete() {
        return includeObsolete;
    }

    /**
     * Sets the value of the includeObsolete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeObsolete(Boolean value) {
        this.includeObsolete = value;
    }

    /**
     * Gets the value of the licenseTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseTypes }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLicenseTypes> getLicenseTypes() {
        return licenseTypes;
    }

    /**
     * Sets the value of the licenseTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseTypes }{@code >}
     *     
     */
    public void setLicenseTypes(JAXBElement<ArrayOfLicenseTypes> value) {
        this.licenseTypes = value;
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
