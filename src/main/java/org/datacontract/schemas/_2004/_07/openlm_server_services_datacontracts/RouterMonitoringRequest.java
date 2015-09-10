
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.openlm_server_services.BaseRequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RouterMonitoringRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouterMonitoringRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="GroupIDs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="Hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RouterIDs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="ShowDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouterMonitoringRequest", propOrder = {
    "groupIDs",
    "hostname",
    "ip",
    "routerIDs",
    "showDisabled",
    "version"
})
public class RouterMonitoringRequest
    extends BaseRequest
{

    @XmlElementRef(name = "GroupIDs", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> groupIDs;
    @XmlElementRef(name = "Hostname", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hostname;
    @XmlElementRef(name = "IP", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ip;
    @XmlElementRef(name = "RouterIDs", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> routerIDs;
    @XmlElement(name = "ShowDisabled")
    protected Boolean showDisabled;
    @XmlElementRef(name = "Version", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> version;

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
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHostname(JAXBElement<String> value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIP() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIP(JAXBElement<String> value) {
        this.ip = value;
    }

    /**
     * Gets the value of the routerIDs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getRouterIDs() {
        return routerIDs;
    }

    /**
     * Sets the value of the routerIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setRouterIDs(JAXBElement<ArrayOfint> value) {
        this.routerIDs = value;
    }

    /**
     * Gets the value of the showDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowDisabled() {
        return showDisabled;
    }

    /**
     * Sets the value of the showDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowDisabled(Boolean value) {
        this.showDisabled = value;
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
