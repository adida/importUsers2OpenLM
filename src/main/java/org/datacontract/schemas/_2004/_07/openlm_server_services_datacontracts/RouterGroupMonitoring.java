
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import org.datacontract.schemas._2004._07.openlm_shared_public.RouterStatus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RouterGroupMonitoring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouterGroupMonitoring">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RouterDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RouterGroupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RouterGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoutersMonitoringDetails" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}ArrayOfRouterMonitoringDetails" minOccurs="0"/>
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
@XmlType(name = "RouterGroupMonitoring", propOrder = {
    "routerDescription",
    "routerGroupID",
    "routerGroupName",
    "routersMonitoringDetails",
    "status"
})
public class RouterGroupMonitoring {

    @XmlElementRef(name = "RouterDescription", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routerDescription;
    @XmlElement(name = "RouterGroupID")
    protected Integer routerGroupID;
    @XmlElementRef(name = "RouterGroupName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routerGroupName;
    @XmlElementRef(name = "RoutersMonitoringDetails", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouterMonitoringDetails> routersMonitoringDetails;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected RouterStatus status;

    /**
     * Gets the value of the routerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouterDescription() {
        return routerDescription;
    }

    /**
     * Sets the value of the routerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouterDescription(JAXBElement<String> value) {
        this.routerDescription = value;
    }

    /**
     * Gets the value of the routerGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRouterGroupID() {
        return routerGroupID;
    }

    /**
     * Sets the value of the routerGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRouterGroupID(Integer value) {
        this.routerGroupID = value;
    }

    /**
     * Gets the value of the routerGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouterGroupName() {
        return routerGroupName;
    }

    /**
     * Sets the value of the routerGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouterGroupName(JAXBElement<String> value) {
        this.routerGroupName = value;
    }

    /**
     * Gets the value of the routersMonitoringDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouterMonitoringDetails }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouterMonitoringDetails> getRoutersMonitoringDetails() {
        return routersMonitoringDetails;
    }

    /**
     * Sets the value of the routersMonitoringDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouterMonitoringDetails }{@code >}
     *     
     */
    public void setRoutersMonitoringDetails(JAXBElement<ArrayOfRouterMonitoringDetails> value) {
        this.routersMonitoringDetails = value;
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
