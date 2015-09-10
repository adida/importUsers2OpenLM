
package org.datacontract.schemas._2004._07.openlm_server_services;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.openlm_server.ArrayOfFeatureVendorServer;
import org.datacontract.schemas._2004._07.openlm_shared.SlimDateTime;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LicenseUsageReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseUsageReportRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="ConsiderOnlyWorkingHours" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="Features" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfFeatureVendorServer" minOccurs="0"/>
 *         &lt;element name="GroupIDs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="IgnoreWeekends" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeCurrentUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProjectIDs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeparateCharts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="UserIDs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseUsageReportRequest", propOrder = {
    "considerOnlyWorkingHours",
    "endTime",
    "features",
    "groupIDs",
    "ignoreWeekends",
    "includeCurrentUsage",
    "projectIDs",
    "resolution",
    "separateCharts",
    "startTime",
    "userIDs"
})
public class LicenseUsageReportRequest
    extends BaseRequest
{

    @XmlElement(name = "ConsiderOnlyWorkingHours")
    protected Boolean considerOnlyWorkingHours;
    @XmlElementRef(name = "EndTime", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> endTime;
    @XmlElementRef(name = "Features", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFeatureVendorServer> features;
    @XmlElementRef(name = "GroupIDs", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> groupIDs;
    @XmlElement(name = "IgnoreWeekends")
    protected Boolean ignoreWeekends;
    @XmlElement(name = "IncludeCurrentUsage")
    protected Boolean includeCurrentUsage;
    @XmlElementRef(name = "ProjectIDs", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> projectIDs;
    @XmlElementRef(name = "Resolution", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resolution;
    @XmlElement(name = "SeparateCharts")
    protected Boolean separateCharts;
    @XmlElementRef(name = "StartTime", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> startTime;
    @XmlElementRef(name = "UserIDs", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> userIDs;

    /**
     * Gets the value of the considerOnlyWorkingHours property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsiderOnlyWorkingHours() {
        return considerOnlyWorkingHours;
    }

    /**
     * Sets the value of the considerOnlyWorkingHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsiderOnlyWorkingHours(Boolean value) {
        this.considerOnlyWorkingHours = value;
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfFeatureVendorServer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFeatureVendorServer> getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFeatureVendorServer }{@code >}
     *     
     */
    public void setFeatures(JAXBElement<ArrayOfFeatureVendorServer> value) {
        this.features = value;
    }

    /**
     * Gets the value of the groupIDs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getGroupIDs() {
        return groupIDs;
    }

    /**
     * Sets the value of the groupIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setGroupIDs(JAXBElement<ArrayOfint> value) {
        this.groupIDs = value;
    }

    /**
     * Gets the value of the ignoreWeekends property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreWeekends() {
        return ignoreWeekends;
    }

    /**
     * Sets the value of the ignoreWeekends property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreWeekends(Boolean value) {
        this.ignoreWeekends = value;
    }

    /**
     * Gets the value of the includeCurrentUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCurrentUsage() {
        return includeCurrentUsage;
    }

    /**
     * Sets the value of the includeCurrentUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCurrentUsage(Boolean value) {
        this.includeCurrentUsage = value;
    }

    /**
     * Gets the value of the projectIDs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getProjectIDs() {
        return projectIDs;
    }

    /**
     * Sets the value of the projectIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setProjectIDs(JAXBElement<ArrayOfint> value) {
        this.projectIDs = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResolution(JAXBElement<String> value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the separateCharts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeparateCharts() {
        return separateCharts;
    }

    /**
     * Sets the value of the separateCharts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeparateCharts(Boolean value) {
        this.separateCharts = value;
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
     * Gets the value of the userIDs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getUserIDs() {
        return userIDs;
    }

    /**
     * Sets the value of the userIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setUserIDs(JAXBElement<ArrayOfint> value) {
        this.userIDs = value;
    }

}
