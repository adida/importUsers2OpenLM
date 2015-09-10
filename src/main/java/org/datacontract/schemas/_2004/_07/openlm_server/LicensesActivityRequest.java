
package org.datacontract.schemas._2004._07.openlm_server;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.openlm_server_services.BaseRequest;
import org.datacontract.schemas._2004._07.openlm_shared.SlimDateTime;
import org.datacontract.schemas._2004._07.openlm_shared_public.ArrayOfLicenseTypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LicensesActivityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicensesActivityRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="AdditionalKey" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="ConsiderWorkHours" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="Features" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfFeatureProductVersion" minOccurs="0"/>
 *         &lt;element name="GroupIDS" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="LicenseTypes" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums}ArrayOfLicenseTypes" minOccurs="0"/>
 *         &lt;element name="Products" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfFeatureProductVersion" minOccurs="0"/>
 *         &lt;element name="ProjectIDS" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="ServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="UserNames" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Workstation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicensesActivityRequest", propOrder = {
    "additionalKey",
    "considerWorkHours",
    "endTime",
    "features",
    "groupIDS",
    "licenseTypes",
    "products",
    "projectIDS",
    "serverName",
    "startTime",
    "userNames",
    "vendor",
    "workstation"
})
public class LicensesActivityRequest
    extends BaseRequest
{

    @XmlElementRef(name = "AdditionalKey", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> additionalKey;
    @XmlElement(name = "ConsiderWorkHours")
    protected Boolean considerWorkHours;
    @XmlElementRef(name = "EndTime", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> endTime;
    @XmlElementRef(name = "Features", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFeatureProductVersion> features;
    @XmlElementRef(name = "GroupIDS", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> groupIDS;
    @XmlElementRef(name = "LicenseTypes", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLicenseTypes> licenseTypes;
    @XmlElementRef(name = "Products", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFeatureProductVersion> products;
    @XmlElementRef(name = "ProjectIDS", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> projectIDS;
    @XmlElementRef(name = "ServerName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serverName;
    @XmlElementRef(name = "StartTime", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> startTime;
    @XmlElementRef(name = "UserNames", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> userNames;
    @XmlElementRef(name = "Vendor", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendor;
    @XmlElementRef(name = "Workstation", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workstation;

    /**
     * Gets the value of the additionalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getAdditionalKey() {
        return additionalKey;
    }

    /**
     * Sets the value of the additionalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setAdditionalKey(JAXBElement<ArrayOfstring> value) {
        this.additionalKey = value;
    }

    /**
     * Gets the value of the considerWorkHours property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsiderWorkHours() {
        return considerWorkHours;
    }

    /**
     * Sets the value of the considerWorkHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsiderWorkHours(Boolean value) {
        this.considerWorkHours = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<SlimDateTime> value) {
        this.endTime = value;
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
     * Gets the value of the groupIDS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getGroupIDS() {
        return groupIDS;
    }

    /**
     * Sets the value of the groupIDS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setGroupIDS(JAXBElement<ArrayOfint> value) {
        this.groupIDS = value;
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
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFeatureProductVersion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFeatureProductVersion> getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFeatureProductVersion }{@code >}
     *     
     */
    public void setProducts(JAXBElement<ArrayOfFeatureProductVersion> value) {
        this.products = value;
    }

    /**
     * Gets the value of the projectIDS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getProjectIDS() {
        return projectIDS;
    }

    /**
     * Sets the value of the projectIDS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setProjectIDS(JAXBElement<ArrayOfint> value) {
        this.projectIDS = value;
    }

    /**
     * Gets the value of the serverName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServerName() {
        return serverName;
    }

    /**
     * Sets the value of the serverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServerName(JAXBElement<String> value) {
        this.serverName = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<SlimDateTime> value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the userNames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getUserNames() {
        return userNames;
    }

    /**
     * Sets the value of the userNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setUserNames(JAXBElement<ArrayOfstring> value) {
        this.userNames = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendor(JAXBElement<String> value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the workstation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkstation() {
        return workstation;
    }

    /**
     * Sets the value of the workstation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkstation(JAXBElement<String> value) {
        this.workstation = value;
    }

}
