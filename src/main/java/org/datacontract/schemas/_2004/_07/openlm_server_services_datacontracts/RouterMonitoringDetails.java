
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import org.datacontract.schemas._2004._07.openlm_shared.SlimDateTime;
import org.datacontract.schemas._2004._07.openlm_shared_public.RouterStatus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RouterMonitoringDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouterMonitoringDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="LastKeepAliveDate" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="LastRestarted" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="LoadInInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoadInTimestamp" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="MachineTime" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="PortsStatistics" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}ArrayOfRouterPortStatistics" minOccurs="0"/>
 *         &lt;element name="RouteInstructionsLastApplied" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="RouteInstructionsLastSent" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="RouterConfig" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}RouterConfig" minOccurs="0"/>
 *         &lt;element name="RouterDetails" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}RouterDetails" minOccurs="0"/>
 *         &lt;element name="RouterID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums}RouterStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouterMonitoringDetails", propOrder = {
    "description",
    "lastActivityDate",
    "lastKeepAliveDate",
    "lastRestarted",
    "loadInInterval",
    "loadInTimestamp",
    "machineTime",
    "portsStatistics",
    "routeInstructionsLastApplied",
    "routeInstructionsLastSent",
    "routerConfig",
    "routerDetails",
    "routerID",
    "status"
})
public class RouterMonitoringDetails {

    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "LastActivityDate", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> lastActivityDate;
    @XmlElementRef(name = "LastKeepAliveDate", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> lastKeepAliveDate;
    @XmlElementRef(name = "LastRestarted", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> lastRestarted;
    @XmlElement(name = "LoadInInterval")
    protected Integer loadInInterval;
    @XmlElementRef(name = "LoadInTimestamp", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> loadInTimestamp;
    @XmlElementRef(name = "MachineTime", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> machineTime;
    @XmlElementRef(name = "PortsStatistics", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouterPortStatistics> portsStatistics;
    @XmlElementRef(name = "RouteInstructionsLastApplied", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> routeInstructionsLastApplied;
    @XmlElementRef(name = "RouteInstructionsLastSent", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> routeInstructionsLastSent;
    @XmlElementRef(name = "RouterConfig", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<RouterConfig> routerConfig;
    @XmlElementRef(name = "RouterDetails", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<RouterDetails> routerDetails;
    @XmlElement(name = "RouterID")
    protected Integer routerID;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected RouterStatus status;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the lastActivityDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets the value of the lastActivityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setLastActivityDate(JAXBElement<SlimDateTime> value) {
        this.lastActivityDate = value;
    }

    /**
     * Gets the value of the lastKeepAliveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getLastKeepAliveDate() {
        return lastKeepAliveDate;
    }

    /**
     * Sets the value of the lastKeepAliveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setLastKeepAliveDate(JAXBElement<SlimDateTime> value) {
        this.lastKeepAliveDate = value;
    }

    /**
     * Gets the value of the lastRestarted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getLastRestarted() {
        return lastRestarted;
    }

    /**
     * Sets the value of the lastRestarted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setLastRestarted(JAXBElement<SlimDateTime> value) {
        this.lastRestarted = value;
    }

    /**
     * Gets the value of the loadInInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoadInInterval() {
        return loadInInterval;
    }

    /**
     * Sets the value of the loadInInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoadInInterval(Integer value) {
        this.loadInInterval = value;
    }

    /**
     * Gets the value of the loadInTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getLoadInTimestamp() {
        return loadInTimestamp;
    }

    /**
     * Sets the value of the loadInTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setLoadInTimestamp(JAXBElement<SlimDateTime> value) {
        this.loadInTimestamp = value;
    }

    /**
     * Gets the value of the machineTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getMachineTime() {
        return machineTime;
    }

    /**
     * Sets the value of the machineTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setMachineTime(JAXBElement<SlimDateTime> value) {
        this.machineTime = value;
    }

    /**
     * Gets the value of the portsStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouterPortStatistics }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouterPortStatistics> getPortsStatistics() {
        return portsStatistics;
    }

    /**
     * Sets the value of the portsStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouterPortStatistics }{@code >}
     *     
     */
    public void setPortsStatistics(JAXBElement<ArrayOfRouterPortStatistics> value) {
        this.portsStatistics = value;
    }

    /**
     * Gets the value of the routeInstructionsLastApplied property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getRouteInstructionsLastApplied() {
        return routeInstructionsLastApplied;
    }

    /**
     * Sets the value of the routeInstructionsLastApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setRouteInstructionsLastApplied(JAXBElement<SlimDateTime> value) {
        this.routeInstructionsLastApplied = value;
    }

    /**
     * Gets the value of the routeInstructionsLastSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getRouteInstructionsLastSent() {
        return routeInstructionsLastSent;
    }

    /**
     * Sets the value of the routeInstructionsLastSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setRouteInstructionsLastSent(JAXBElement<SlimDateTime> value) {
        this.routeInstructionsLastSent = value;
    }

    /**
     * Gets the value of the routerConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouterConfig }{@code >}
     *     
     */
    public JAXBElement<RouterConfig> getRouterConfig() {
        return routerConfig;
    }

    /**
     * Sets the value of the routerConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouterConfig }{@code >}
     *     
     */
    public void setRouterConfig(JAXBElement<RouterConfig> value) {
        this.routerConfig = value;
    }

    /**
     * Gets the value of the routerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouterDetails }{@code >}
     *     
     */
    public JAXBElement<RouterDetails> getRouterDetails() {
        return routerDetails;
    }

    /**
     * Sets the value of the routerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouterDetails }{@code >}
     *     
     */
    public void setRouterDetails(JAXBElement<RouterDetails> value) {
        this.routerDetails = value;
    }

    /**
     * Gets the value of the routerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRouterID() {
        return routerID;
    }

    /**
     * Sets the value of the routerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRouterID(Integer value) {
        this.routerID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RouterStatus }
     *     
     */
    public RouterStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouterStatus }
     *     
     */
    public void setStatus(RouterStatus value) {
        this.status = value;
    }

}
