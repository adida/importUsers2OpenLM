
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.LogsUploadingStartResponse;

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
 *         &lt;element name="StartLogsUploadingResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LogsUploadingStartResponse" minOccurs="0"/>
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
    "startLogsUploadingResult"
})
@XmlRootElement(name = "StartLogsUploadingResponse")
public class StartLogsUploadingResponse {

    @XmlElementRef(name = "StartLogsUploadingResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<LogsUploadingStartResponse> startLogsUploadingResult;

    /**
     * Gets the value of the startLogsUploadingResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LogsUploadingStartResponse }{@code >}
     *     
     */
    public JAXBElement<LogsUploadingStartResponse> getStartLogsUploadingResult() {
        return startLogsUploadingResult;
    }

    /**
     * Sets the value of the startLogsUploadingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LogsUploadingStartResponse }{@code >}
     *     
     */
    public void setStartLogsUploadingResult(JAXBElement<LogsUploadingStartResponse> value) {
        this.startLogsUploadingResult = value;
    }

}
