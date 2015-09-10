
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LogsUploadingBaseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogsUploadingBaseRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="SendingHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendingPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SendingTimeUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogsUploadingBaseRequest", propOrder = {
    "sendingHost",
    "sendingPort",
    "sendingTimeUTC"
})
@XmlSeeAlso({
    LogsUploadingStartRequest.class,
    LogsUploadingKeepAliveRequest.class,
    LogsUploadingEndRequest.class
})
public class LogsUploadingBaseRequest
    extends BaseRequest
{

    @XmlElementRef(name = "SendingHost", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sendingHost;
    @XmlElement(name = "SendingPort")
    protected Integer sendingPort;
    @XmlElement(name = "SendingTimeUTC")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendingTimeUTC;

    /**
     * Gets the value of the sendingHost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSendingHost() {
        return sendingHost;
    }

    /**
     * Sets the value of the sendingHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSendingHost(JAXBElement<String> value) {
        this.sendingHost = value;
    }

    /**
     * Gets the value of the sendingPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendingPort() {
        return sendingPort;
    }

    /**
     * Sets the value of the sendingPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendingPort(Integer value) {
        this.sendingPort = value;
    }

    /**
     * Gets the value of the sendingTimeUTC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendingTimeUTC() {
        return sendingTimeUTC;
    }

    /**
     * Sets the value of the sendingTimeUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendingTimeUTC(XMLGregorianCalendar value) {
        this.sendingTimeUTC = value;
    }

}
