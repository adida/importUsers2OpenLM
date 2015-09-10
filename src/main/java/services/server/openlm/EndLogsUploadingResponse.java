
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.LogsUploadingBaseResponse;

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
 *         &lt;element name="EndLogsUploadingResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LogsUploadingBaseResponse" minOccurs="0"/>
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
    "endLogsUploadingResult"
})
@XmlRootElement(name = "EndLogsUploadingResponse")
public class EndLogsUploadingResponse {

    @XmlElementRef(name = "EndLogsUploadingResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<LogsUploadingBaseResponse> endLogsUploadingResult;

    /**
     * Gets the value of the endLogsUploadingResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LogsUploadingBaseResponse }{@code >}
     *     
     */
    public JAXBElement<LogsUploadingBaseResponse> getEndLogsUploadingResult() {
        return endLogsUploadingResult;
    }

    /**
     * Sets the value of the endLogsUploadingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LogsUploadingBaseResponse }{@code >}
     *     
     */
    public void setEndLogsUploadingResult(JAXBElement<LogsUploadingBaseResponse> value) {
        this.endLogsUploadingResult = value;
    }

}
