
package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_shared.LicenseReleaseMethod;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for UnmanagedProcessFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnmanagedProcessFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsiderCPU" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/>
 *         &lt;element name="CpuRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CycleTimeInSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Enabled" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/>
 *         &lt;element name="FeatureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IoRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MinIdleTimeInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinInacivityTimeInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProcDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcedureID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProcedureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReleaseMethod" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.Enums}LicenseReleaseMethod" minOccurs="0"/>
 *         &lt;element name="ReleaseThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShutIdleSessions" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/>
 *         &lt;element name="TrackIdleTimes" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/>
 *         &lt;element name="UserRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnmanagedProcessFeature", propOrder = {
    "considerCPU",
    "cpuRate",
    "cycleTimeInSeconds",
    "enabled",
    "featureName",
    "id",
    "ioRate",
    "minIdleTimeInMinutes",
    "minInacivityTimeInMinutes",
    "procDesc",
    "procName",
    "procedureID",
    "procedureName",
    "quantity",
    "releaseMethod",
    "releaseThreshold",
    "shutIdleSessions",
    "trackIdleTimes",
    "userRate"
})
public class UnmanagedProcessFeature {

    @XmlElement(name = "ConsiderCPU")
    protected Integer considerCPU;
    @XmlElement(name = "CpuRate")
    protected Double cpuRate;
    @XmlElement(name = "CycleTimeInSeconds")
    protected Integer cycleTimeInSeconds;
    @XmlElement(name = "Enabled")
    protected Integer enabled;
    @XmlElementRef(name = "FeatureName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> featureName;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "IoRate")
    protected Double ioRate;
    @XmlElement(name = "MinIdleTimeInMinutes")
    protected Integer minIdleTimeInMinutes;
    @XmlElement(name = "MinInacivityTimeInMinutes")
    protected Integer minInacivityTimeInMinutes;
    @XmlElementRef(name = "ProcDesc", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> procDesc;
    @XmlElementRef(name = "ProcName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> procName;
    @XmlElement(name = "ProcedureID")
    protected Integer procedureID;
    @XmlElementRef(name = "ProcedureName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> procedureName;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "ReleaseMethod")
    @XmlSchemaType(name = "string")
    protected LicenseReleaseMethod releaseMethod;
    @XmlElement(name = "ReleaseThreshold")
    protected Integer releaseThreshold;
    @XmlElement(name = "ShutIdleSessions")
    protected Integer shutIdleSessions;
    @XmlElement(name = "TrackIdleTimes")
    protected Integer trackIdleTimes;
    @XmlElement(name = "UserRate")
    protected Double userRate;

    /**
     * Gets the value of the considerCPU property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsiderCPU() {
        return considerCPU;
    }

    /**
     * Sets the value of the considerCPU property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsiderCPU(Integer value) {
        this.considerCPU = value;
    }

    /**
     * Gets the value of the cpuRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCpuRate() {
        return cpuRate;
    }

    /**
     * Sets the value of the cpuRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCpuRate(Double value) {
        this.cpuRate = value;
    }

    /**
     * Gets the value of the cycleTimeInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCycleTimeInSeconds() {
        return cycleTimeInSeconds;
    }

    /**
     * Sets the value of the cycleTimeInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCycleTimeInSeconds(Integer value) {
        this.cycleTimeInSeconds = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnabled(Integer value) {
        this.enabled = value;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the ioRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIoRate() {
        return ioRate;
    }

    /**
     * Sets the value of the ioRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIoRate(Double value) {
        this.ioRate = value;
    }

    /**
     * Gets the value of the minIdleTimeInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinIdleTimeInMinutes() {
        return minIdleTimeInMinutes;
    }

    /**
     * Sets the value of the minIdleTimeInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinIdleTimeInMinutes(Integer value) {
        this.minIdleTimeInMinutes = value;
    }

    /**
     * Gets the value of the minInacivityTimeInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinInacivityTimeInMinutes() {
        return minInacivityTimeInMinutes;
    }

    /**
     * Sets the value of the minInacivityTimeInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinInacivityTimeInMinutes(Integer value) {
        this.minInacivityTimeInMinutes = value;
    }

    /**
     * Gets the value of the procDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcDesc() {
        return procDesc;
    }

    /**
     * Sets the value of the procDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcDesc(JAXBElement<String> value) {
        this.procDesc = value;
    }

    /**
     * Gets the value of the procName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcName() {
        return procName;
    }

    /**
     * Sets the value of the procName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcName(JAXBElement<String> value) {
        this.procName = value;
    }

    /**
     * Gets the value of the procedureID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcedureID() {
        return procedureID;
    }

    /**
     * Sets the value of the procedureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcedureID(Integer value) {
        this.procedureID = value;
    }

    /**
     * Gets the value of the procedureName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcedureName() {
        return procedureName;
    }

    /**
     * Sets the value of the procedureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcedureName(JAXBElement<String> value) {
        this.procedureName = value;
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
     * Gets the value of the releaseMethod property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseReleaseMethod }
     *     
     */
    public LicenseReleaseMethod getReleaseMethod() {
        return releaseMethod;
    }

    /**
     * Sets the value of the releaseMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseReleaseMethod }
     *     
     */
    public void setReleaseMethod(LicenseReleaseMethod value) {
        this.releaseMethod = value;
    }

    /**
     * Gets the value of the releaseThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReleaseThreshold() {
        return releaseThreshold;
    }

    /**
     * Sets the value of the releaseThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReleaseThreshold(Integer value) {
        this.releaseThreshold = value;
    }

    /**
     * Gets the value of the shutIdleSessions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShutIdleSessions() {
        return shutIdleSessions;
    }

    /**
     * Sets the value of the shutIdleSessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShutIdleSessions(Integer value) {
        this.shutIdleSessions = value;
    }

    /**
     * Gets the value of the trackIdleTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrackIdleTimes() {
        return trackIdleTimes;
    }

    /**
     * Sets the value of the trackIdleTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrackIdleTimes(Integer value) {
        this.trackIdleTimes = value;
    }

    /**
     * Gets the value of the userRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUserRate() {
        return userRate;
    }

    /**
     * Sets the value of the userRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUserRate(Double value) {
        this.userRate = value;
    }

}
