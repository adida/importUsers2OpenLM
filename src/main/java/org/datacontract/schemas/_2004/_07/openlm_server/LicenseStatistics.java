
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LicenseStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailableLicenses" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FeatureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HostIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOLMLicensed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsObsolete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LicenseId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LicenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NamedQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumOfBorrowedLicenses" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumOfLicensesInUse" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumOfTokens" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PackageID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalNumOfLicenses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseStatistics", propOrder = {
    "additionalKey",
    "availableLicenses",
    "featureName",
    "hostIds",
    "isOLMLicensed",
    "isObsolete",
    "licenseId",
    "licenseType",
    "namedQuantity",
    "numOfBorrowedLicenses",
    "numOfLicensesInUse",
    "numOfTokens",
    "packageID",
    "productName",
    "server",
    "sortOrder",
    "totalNumOfLicenses",
    "vendor",
    "vendorString",
    "version"
})
public class LicenseStatistics {

    @XmlElementRef(name = "AdditionalKey", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalKey;
    @XmlElement(name = "AvailableLicenses")
    protected Long availableLicenses;
    @XmlElementRef(name = "FeatureName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> featureName;
    @XmlElementRef(name = "HostIds", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hostIds;
    @XmlElement(name = "IsOLMLicensed")
    protected Boolean isOLMLicensed;
    @XmlElement(name = "IsObsolete")
    protected Boolean isObsolete;
    @XmlElement(name = "LicenseId")
    protected Integer licenseId;
    @XmlElementRef(name = "LicenseType", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licenseType;
    @XmlElementRef(name = "NamedQuantity", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> namedQuantity;
    @XmlElement(name = "NumOfBorrowedLicenses")
    protected Long numOfBorrowedLicenses;
    @XmlElement(name = "NumOfLicensesInUse")
    protected Long numOfLicensesInUse;
    @XmlElement(name = "NumOfTokens")
    protected Integer numOfTokens;
    @XmlElementRef(name = "PackageID", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> packageID;
    @XmlElementRef(name = "ProductName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productName;
    @XmlElementRef(name = "Server", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> server;
    @XmlElementRef(name = "SortOrder", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sortOrder;
    @XmlElement(name = "TotalNumOfLicenses")
    protected Integer totalNumOfLicenses;
    @XmlElementRef(name = "Vendor", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendor;
    @XmlElementRef(name = "VendorString", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorString;
    @XmlElementRef(name = "Version", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> version;

    /**
     * Gets the value of the additionalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalKey() {
        return additionalKey;
    }

    /**
     * Sets the value of the additionalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalKey(JAXBElement<String> value) {
        this.additionalKey = value;
    }

    /**
     * Gets the value of the availableLicenses property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailableLicenses() {
        return availableLicenses;
    }

    /**
     * Sets the value of the availableLicenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailableLicenses(Long value) {
        this.availableLicenses = value;
    }

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
     * Gets the value of the hostIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHostIds() {
        return hostIds;
    }

    /**
     * Sets the value of the hostIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHostIds(JAXBElement<String> value) {
        this.hostIds = value;
    }

    /**
     * Gets the value of the isOLMLicensed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOLMLicensed() {
        return isOLMLicensed;
    }

    /**
     * Sets the value of the isOLMLicensed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOLMLicensed(Boolean value) {
        this.isOLMLicensed = value;
    }

    /**
     * Gets the value of the isObsolete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsObsolete() {
        return isObsolete;
    }

    /**
     * Sets the value of the isObsolete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsObsolete(Boolean value) {
        this.isObsolete = value;
    }

    /**
     * Gets the value of the licenseId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLicenseId() {
        return licenseId;
    }

    /**
     * Sets the value of the licenseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLicenseId(Integer value) {
        this.licenseId = value;
    }

    /**
     * Gets the value of the licenseType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the value of the licenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicenseType(JAXBElement<String> value) {
        this.licenseType = value;
    }

    /**
     * Gets the value of the namedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNamedQuantity() {
        return namedQuantity;
    }

    /**
     * Sets the value of the namedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNamedQuantity(JAXBElement<Integer> value) {
        this.namedQuantity = value;
    }

    /**
     * Gets the value of the numOfBorrowedLicenses property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumOfBorrowedLicenses() {
        return numOfBorrowedLicenses;
    }

    /**
     * Sets the value of the numOfBorrowedLicenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumOfBorrowedLicenses(Long value) {
        this.numOfBorrowedLicenses = value;
    }

    /**
     * Gets the value of the numOfLicensesInUse property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumOfLicensesInUse() {
        return numOfLicensesInUse;
    }

    /**
     * Sets the value of the numOfLicensesInUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumOfLicensesInUse(Long value) {
        this.numOfLicensesInUse = value;
    }

    /**
     * Gets the value of the numOfTokens property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumOfTokens() {
        return numOfTokens;
    }

    /**
     * Sets the value of the numOfTokens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumOfTokens(Integer value) {
        this.numOfTokens = value;
    }

    /**
     * Gets the value of the packageID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPackageID() {
        return packageID;
    }

    /**
     * Sets the value of the packageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPackageID(JAXBElement<Integer> value) {
        this.packageID = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductName(JAXBElement<String> value) {
        this.productName = value;
    }

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServer(JAXBElement<String> value) {
        this.server = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSortOrder(JAXBElement<Integer> value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the totalNumOfLicenses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumOfLicenses() {
        return totalNumOfLicenses;
    }

    /**
     * Sets the value of the totalNumOfLicenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumOfLicenses(Integer value) {
        this.totalNumOfLicenses = value;
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
     * Gets the value of the vendorString property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendorString() {
        return vendorString;
    }

    /**
     * Sets the value of the vendorString property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendorString(JAXBElement<String> value) {
        this.vendorString = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersion(JAXBElement<String> value) {
        this.version = value;
    }

}
