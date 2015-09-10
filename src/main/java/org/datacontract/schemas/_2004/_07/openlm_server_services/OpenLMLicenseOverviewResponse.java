
package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_licensemanager_openlmshared.OpenLMLicenseTypes;
import org.datacontract.schemas._2004._07.openlm_licensemanager_shared.ArrayOfEffectiveLicenseFeature;
import org.datacontract.schemas._2004._07.openlm_shared.SlimDateTime;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for OpenLMLicenseOverviewResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenLMLicenseOverviewResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="EffectiveFeatures" type="{http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain}ArrayOfEffectiveLicenseFeature" minOccurs="0"/>
 *         &lt;element name="LicenseManagerMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpenLMLicExpirationDate" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="OpenLMLicenseType" type="{http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.OpenLMShared.Enums}OpenLMLicenseTypes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenLMLicenseOverviewResponse", propOrder = {
    "effectiveFeatures",
    "licenseManagerMacAddress",
    "licenseManagerName",
    "openLMLicExpirationDate",
    "openLMLicenseType"
})
public class OpenLMLicenseOverviewResponse
    extends BaseResponse
{

    @XmlElementRef(name = "EffectiveFeatures", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEffectiveLicenseFeature> effectiveFeatures;
    @XmlElementRef(name = "LicenseManagerMacAddress", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licenseManagerMacAddress;
    @XmlElementRef(name = "LicenseManagerName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licenseManagerName;
    @XmlElementRef(name = "OpenLMLicExpirationDate", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> openLMLicExpirationDate;
    @XmlElement(name = "OpenLMLicenseType")
    @XmlSchemaType(name = "string")
    protected OpenLMLicenseTypes openLMLicenseType;

    /**
     * Gets the value of the effectiveFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEffectiveLicenseFeature }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEffectiveLicenseFeature> getEffectiveFeatures() {
        return effectiveFeatures;
    }

    /**
     * Sets the value of the effectiveFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEffectiveLicenseFeature }{@code >}
     *     
     */
    public void setEffectiveFeatures(JAXBElement<ArrayOfEffectiveLicenseFeature> value) {
        this.effectiveFeatures = value;
    }

    /**
     * Gets the value of the licenseManagerMacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicenseManagerMacAddress() {
        return licenseManagerMacAddress;
    }

    /**
     * Sets the value of the licenseManagerMacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicenseManagerMacAddress(JAXBElement<String> value) {
        this.licenseManagerMacAddress = value;
    }

    /**
     * Gets the value of the licenseManagerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicenseManagerName() {
        return licenseManagerName;
    }

    /**
     * Sets the value of the licenseManagerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicenseManagerName(JAXBElement<String> value) {
        this.licenseManagerName = value;
    }

    /**
     * Gets the value of the openLMLicExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getOpenLMLicExpirationDate() {
        return openLMLicExpirationDate;
    }

    /**
     * Sets the value of the openLMLicExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setOpenLMLicExpirationDate(JAXBElement<SlimDateTime> value) {
        this.openLMLicExpirationDate = value;
    }

    /**
     * Gets the value of the openLMLicenseType property.
     * 
     * @return
     *     possible object is
     *     {@link OpenLMLicenseTypes }
     *     
     */
    public OpenLMLicenseTypes getOpenLMLicenseType() {
        return openLMLicenseType;
    }

    /**
     * Sets the value of the openLMLicenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenLMLicenseTypes }
     *     
     */
    public void setOpenLMLicenseType(OpenLMLicenseTypes value) {
        this.openLMLicenseType = value;
    }

}
