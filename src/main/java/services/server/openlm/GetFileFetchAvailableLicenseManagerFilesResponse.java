
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.LMFilesResponse;

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
 *         &lt;element name="GetFileFetchAvailableLicenseManagerFilesResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LMFilesResponse" minOccurs="0"/>
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
    "getFileFetchAvailableLicenseManagerFilesResult"
})
@XmlRootElement(name = "GetFileFetchAvailableLicenseManagerFilesResponse")
public class GetFileFetchAvailableLicenseManagerFilesResponse {

    @XmlElementRef(name = "GetFileFetchAvailableLicenseManagerFilesResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<LMFilesResponse> getFileFetchAvailableLicenseManagerFilesResult;

    /**
     * Gets the value of the getFileFetchAvailableLicenseManagerFilesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LMFilesResponse }{@code >}
     *     
     */
    public JAXBElement<LMFilesResponse> getGetFileFetchAvailableLicenseManagerFilesResult() {
        return getFileFetchAvailableLicenseManagerFilesResult;
    }

    /**
     * Sets the value of the getFileFetchAvailableLicenseManagerFilesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LMFilesResponse }{@code >}
     *     
     */
    public void setGetFileFetchAvailableLicenseManagerFilesResult(JAXBElement<LMFilesResponse> value) {
        this.getFileFetchAvailableLicenseManagerFilesResult = value;
    }

}
