
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LicenseServerHostDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseServerHostDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BrokerInstallPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrokerVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnableAdministration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnableFileFetch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HostID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HostLocalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HostTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JavaVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LmUptime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PortStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortStatusSendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseServerHostDetails", propOrder = {
    "brokerInstallPath",
    "brokerVersion",
    "enableAdministration",
    "enableFileFetch",
    "hostID",
    "hostLocalTime",
    "hostName",
    "hostTimeZone",
    "javaVersion",
    "lmUptime",
    "port",
    "portStatus",
    "portStatusSendTime"
})
public class LicenseServerHostDetails {

    @XmlElementRef(name = "BrokerInstallPath", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brokerInstallPath;
    @XmlElementRef(name = "BrokerVersion", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brokerVersion;
    @XmlElement(name = "EnableAdministration")
    protected Boolean enableAdministration;
    @XmlElement(name = "EnableFileFetch")
    protected Boolean enableFileFetch;
    @XmlElement(name = "HostID")
    protected Integer hostID;
    @XmlElementRef(name = "HostLocalTime", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hostLocalTime;
    @XmlElementRef(name = "HostName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hostName;
    @XmlElementRef(name = "HostTimeZone", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hostTimeZone;
    @XmlElementRef(name = "JavaVersion", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> javaVersion;
    @XmlElementRef(name = "LmUptime", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lmUptime;
    @XmlElement(name = "Port")
    protected Integer port;
    @XmlElementRef(name = "PortStatus", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portStatus;
    @XmlElementRef(name = "PortStatusSendTime", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> portStatusSendTime;

    /**
     * Gets the value of the brokerInstallPath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrokerInstallPath() {
        return brokerInstallPath;
    }

    /**
     * Sets the value of the brokerInstallPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrokerInstallPath(JAXBElement<String> value) {
        this.brokerInstallPath = value;
    }

    /**
     * Gets the value of the brokerVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrokerVersion() {
        return brokerVersion;
    }

    /**
     * Sets the value of the brokerVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrokerVersion(JAXBElement<String> value) {
        this.brokerVersion = value;
    }

    /**
     * Gets the value of the enableAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAdministration() {
        return enableAdministration;
    }

    /**
     * Sets the value of the enableAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAdministration(Boolean value) {
        this.enableAdministration = value;
    }

    /**
     * Gets the value of the enableFileFetch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableFileFetch() {
        return enableFileFetch;
    }

    /**
     * Sets the value of the enableFileFetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableFileFetch(Boolean value) {
        this.enableFileFetch = value;
    }

    /**
     * Gets the value of the hostID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHostID() {
        return hostID;
    }

    /**
     * Sets the value of the hostID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHostID(Integer value) {
        this.hostID = value;
    }

    /**
     * Gets the value of the hostLocalTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHostLocalTime() {
        return hostLocalTime;
    }

    /**
     * Sets the value of the hostLocalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHostLocalTime(JAXBElement<String> value) {
        this.hostLocalTime = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHostName(JAXBElement<String> value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the hostTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHostTimeZone() {
        return hostTimeZone;
    }

    /**
     * Sets the value of the hostTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHostTimeZone(JAXBElement<String> value) {
        this.hostTimeZone = value;
    }

    /**
     * Gets the value of the javaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJavaVersion() {
        return javaVersion;
    }

    /**
     * Sets the value of the javaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJavaVersion(JAXBElement<String> value) {
        this.javaVersion = value;
    }

    /**
     * Gets the value of the lmUptime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLmUptime() {
        return lmUptime;
    }

    /**
     * Sets the value of the lmUptime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLmUptime(JAXBElement<String> value) {
        this.lmUptime = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPort(Integer value) {
        this.port = value;
    }

    /**
     * Gets the value of the portStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortStatus() {
        return portStatus;
    }

    /**
     * Sets the value of the portStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortStatus(JAXBElement<String> value) {
        this.portStatus = value;
    }

    /**
     * Gets the value of the portStatusSendTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPortStatusSendTime() {
        return portStatusSendTime;
    }

    /**
     * Sets the value of the portStatusSendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPortStatusSendTime(JAXBElement<XMLGregorianCalendar> value) {
        this.portStatusSendTime = value;
    }

}
