
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.MonitoredProcessesResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MonitoredProcessGetNamesResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}MonitoredProcessesResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "monitoredProcessGetNamesResult"
})
@XmlRootElement(name = "MonitoredProcessGetNamesResponse")
public class MonitoredProcessGetNamesResponse {

    @XmlElementRef(name = "MonitoredProcessGetNamesResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<MonitoredProcessesResponse> monitoredProcessGetNamesResult;

    /**
     * Gets the value of the monitoredProcessGetNamesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonitoredProcessesResponse }{@code >}
     *     
     */
    public JAXBElement<MonitoredProcessesResponse> getMonitoredProcessGetNamesResult() {
        return monitoredProcessGetNamesResult;
    }

    /**
     * Sets the value of the monitoredProcessGetNamesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonitoredProcessesResponse }{@code >}
     *     
     */
    public void setMonitoredProcessGetNamesResult(JAXBElement<MonitoredProcessesResponse> value) {
        this.monitoredProcessGetNamesResult = value;
    }

}
