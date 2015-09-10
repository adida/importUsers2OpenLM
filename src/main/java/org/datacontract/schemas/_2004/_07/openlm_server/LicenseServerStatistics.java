
package org.datacontract.schemas._2004._07.openlm_server;

import org.datacontract.schemas._2004._07.openlm_shared_public.LicenseManagerStatus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LicenseServerStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseServerStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hosts" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfLicenseServerHostDetails" minOccurs="0"/>
 *         &lt;element name="IsUnlimited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LicenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermissionToAdministerServer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ServerLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerStatus" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums}LicenseManagerStatus" minOccurs="0"/>
 *         &lt;element name="TotalBorrowed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UsagePercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseServerStatistics", propOrder = {
    "hosts",
    "isUnlimited",
    "licenseType",
    "permissionToAdministerServer",
    "serverDescription",
    "serverID",
    "serverLM",
    "serverStatus",
    "totalBorrowed",
    "totalQuantity",
    "totalUsed",
    "usagePercent"
})
public class LicenseServerStatistics {

    @XmlElementRef(name = "Hosts", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLicenseServerHostDetails> hosts;
    @XmlElement(name = "IsUnlimited")
    protected Boolean isUnlimited;
    @XmlElementRef(name = "LicenseType", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licenseType;
    @XmlElement(name = "PermissionToAdministerServer")
    protected Boolean permissionToAdministerServer;
    @XmlElementRef(name = "ServerDescription", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serverDescription;
    @XmlElement(name = "ServerID")
    protected Integer serverID;
    @XmlElementRef(name = "ServerLM", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serverLM;
    @XmlElement(name = "ServerStatus")
    @XmlSchemaType(name = "string")
    protected LicenseManagerStatus serverStatus;
    @XmlElement(name = "TotalBorrowed")
    protected Integer totalBorrowed;
    @XmlElementRef(name = "TotalQuantity", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalQuantity;
    @XmlElement(name = "TotalUsed")
    protected Integer totalUsed;
    @XmlElement(name = "UsagePercent")
    protected Double usagePercent;

    /**
     * Gets the value of the hosts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseServerHostDetails }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLicenseServerHostDetails> getHosts() {
        return hosts;
    }

    /**
     * Sets the value of the hosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseServerHostDetails }{@code >}
     *     
     */
    public void setHosts(JAXBElement<ArrayOfLicenseServerHostDetails> value) {
        this.hosts = value;
    }

    /**
     * Gets the value of the isUnlimited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUnlimited() {
        return isUnlimited;
    }

    /**
     * Sets the value of the isUnlimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUnlimited(Boolean value) {
        this.isUnlimited = value;
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
     * Gets the value of the permissionToAdministerServer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionToAdministerServer() {
        return permissionToAdministerServer;
    }

    /**
     * Sets the value of the permissionToAdministerServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionToAdministerServer(Boolean value) {
        this.permissionToAdministerServer = value;
    }

    /**
     * Gets the value of the serverDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServerDescription() {
        return serverDescription;
    }

    /**
     * Sets the value of the serverDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServerDescription(JAXBElement<String> value) {
        this.serverDescription = value;
    }

    /**
     * Gets the value of the serverID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServerID() {
        return serverID;
    }

    /**
     * Sets the value of the serverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServerID(Integer value) {
        this.serverID = value;
    }

    /**
     * Gets the value of the serverLM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServerLM() {
        return serverLM;
    }

    /**
     * Sets the value of the serverLM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServerLM(JAXBElement<String> value) {
        this.serverLM = value;
    }

    /**
     * Gets the value of the serverStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseManagerStatus }
     *     
     */
    public LicenseManagerStatus getServerStatus() {
        return serverStatus;
    }

    /**
     * Sets the value of the serverStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseManagerStatus }
     *     
     */
    public void setServerStatus(LicenseManagerStatus value) {
        this.serverStatus = value;
    }

    /**
     * Gets the value of the totalBorrowed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalBorrowed() {
        return totalBorrowed;
    }

    /**
     * Sets the value of the totalBorrowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalBorrowed(Integer value) {
        this.totalBorrowed = value;
    }

    /**
     * Gets the value of the totalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * Sets the value of the totalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalQuantity(JAXBElement<Long> value) {
        this.totalQuantity = value;
    }

    /**
     * Gets the value of the totalUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalUsed() {
        return totalUsed;
    }

    /**
     * Sets the value of the totalUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalUsed(Integer value) {
        this.totalUsed = value;
    }

    /**
     * Gets the value of the usagePercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUsagePercent() {
        return usagePercent;
    }

    /**
     * Sets the value of the usagePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUsagePercent(Double value) {
        this.usagePercent = value;
    }

}
