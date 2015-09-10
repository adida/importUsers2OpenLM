
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouterMonitoringResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouterMonitoringResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="RouterGroupMonitors" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}ArrayOfRouterGroupMonitoring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouterMonitoringResponse", propOrder = {
    "routerGroupMonitors"
})
public class RouterMonitoringResponse
    extends BaseResponse
{

    @XmlElementRef(name = "RouterGroupMonitors", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouterGroupMonitoring> routerGroupMonitors;

    /**
     * Gets the value of the routerGroupMonitors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouterGroupMonitoring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouterGroupMonitoring> getRouterGroupMonitors() {
        return routerGroupMonitors;
    }

    /**
     * Sets the value of the routerGroupMonitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouterGroupMonitoring }{@code >}
     *     
     */
    public void setRouterGroupMonitors(JAXBElement<ArrayOfRouterGroupMonitoring> value) {
        this.routerGroupMonitors = value;
    }

}
