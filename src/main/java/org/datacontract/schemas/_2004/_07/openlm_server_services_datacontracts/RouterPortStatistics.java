
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import org.datacontract.schemas._2004._07.openlm_shared.SlimDateTime;
import org.datacontract.schemas._2004._07.openlm_shared_public.RouterListenerPortProtocol;
import org.datacontract.schemas._2004._07.openlm_shared_public.RouterListenerPortStatus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RouterPortStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouterPortStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DenialsInInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortProtocolReported" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums}RouterListenerPortProtocol" minOccurs="0"/>
 *         &lt;element name="PortReported" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PortStatus" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums}RouterListenerPortStatus" minOccurs="0"/>
 *         &lt;element name="RouteInInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="TimestampUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouterPortStatistics", propOrder = {
    "denialsInInterval",
    "errorMsg",
    "portProtocolReported",
    "portReported",
    "portStatus",
    "routeInInterval",
    "timestamp",
    "timestampUTC"
})
public class RouterPortStatistics {

    @XmlElement(name = "DenialsInInterval")
    protected Integer denialsInInterval;
    @XmlElementRef(name = "ErrorMsg", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMsg;
    @XmlElement(name = "PortProtocolReported")
    @XmlSchemaType(name = "string")
    protected RouterListenerPortProtocol portProtocolReported;
    @XmlElement(name = "PortReported")
    protected Integer portReported;
    @XmlElement(name = "PortStatus")
    @XmlSchemaType(name = "string")
    protected RouterListenerPortStatus portStatus;
    @XmlElement(name = "RouteInInterval")
    protected Integer routeInInterval;
    @XmlElementRef(name = "Timestamp", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> timestamp;
    @XmlElement(name = "TimestampUTC")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestampUTC;

    /**
     * Gets the value of the denialsInInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDenialsInInterval() {
        return denialsInInterval;
    }

    /**
     * Sets the value of the denialsInInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDenialsInInterval(Integer value) {
        this.denialsInInterval = value;
    }

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMsg(JAXBElement<String> value) {
        this.errorMsg = value;
    }

    /**
     * Gets the value of the portProtocolReported property.
     * 
     * @return
     *     possible object is
     *     {@link RouterListenerPortProtocol }
     *     
     */
    public RouterListenerPortProtocol getPortProtocolReported() {
        return portProtocolReported;
    }

    /**
     * Sets the value of the portProtocolReported property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouterListenerPortProtocol }
     *     
     */
    public void setPortProtocolReported(RouterListenerPortProtocol value) {
        this.portProtocolReported = value;
    }

    /**
     * Gets the value of the portReported property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPortReported() {
        return portReported;
    }

    /**
     * Sets the value of the portReported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPortReported(Integer value) {
        this.portReported = value;
    }

    /**
     * Gets the value of the portStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RouterListenerPortStatus }
     *     
     */
    public RouterListenerPortStatus getPortStatus() {
        return portStatus;
    }

    /**
     * Sets the value of the portStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouterListenerPortStatus }
     *     
     */
    public void setPortStatus(RouterListenerPortStatus value) {
        this.portStatus = value;
    }

    /**
     * Gets the value of the routeInInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRouteInInterval() {
        return routeInInterval;
    }

    /**
     * Sets the value of the routeInInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRouteInInterval(Integer value) {
        this.routeInInterval = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setTimestamp(JAXBElement<SlimDateTime> value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the timestampUTC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestampUTC() {
        return timestampUTC;
    }

    /**
     * Sets the value of the timestampUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestampUTC(XMLGregorianCalendar value) {
        this.timestampUTC = value;
    }

}
