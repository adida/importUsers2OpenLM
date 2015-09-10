
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.DownloadLmFileResponse;

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
 *         &lt;element name="FileFetchSpecificFileResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}DownloadLmFileResponse" minOccurs="0"/>
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
    "fileFetchSpecificFileResult"
})
@XmlRootElement(name = "FileFetchSpecificFileResponse")
public class FileFetchSpecificFileResponse {

    @XmlElementRef(name = "FileFetchSpecificFileResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<DownloadLmFileResponse> fileFetchSpecificFileResult;

    /**
     * Gets the value of the fileFetchSpecificFileResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DownloadLmFileResponse }{@code >}
     *     
     */
    public JAXBElement<DownloadLmFileResponse> getFileFetchSpecificFileResult() {
        return fileFetchSpecificFileResult;
    }

    /**
     * Sets the value of the fileFetchSpecificFileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DownloadLmFileResponse }{@code >}
     *     
     */
    public void setFileFetchSpecificFileResult(JAXBElement<DownloadLmFileResponse> value) {
        this.fileFetchSpecificFileResult = value;
    }

}
