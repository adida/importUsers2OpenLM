
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.FileFetchStatusResponse;

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
 *         &lt;element name="GetFileFetchFetchingStatusResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}FileFetchStatusResponse" minOccurs="0"/>
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
    "getFileFetchFetchingStatusResult"
})
@XmlRootElement(name = "GetFileFetchFetchingStatusResponse")
public class GetFileFetchFetchingStatusResponse {

    @XmlElementRef(name = "GetFileFetchFetchingStatusResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<FileFetchStatusResponse> getFileFetchFetchingStatusResult;

    /**
     * Gets the value of the getFileFetchFetchingStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileFetchStatusResponse }{@code >}
     *     
     */
    public JAXBElement<FileFetchStatusResponse> getGetFileFetchFetchingStatusResult() {
        return getFileFetchFetchingStatusResult;
    }

    /**
     * Sets the value of the getFileFetchFetchingStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileFetchStatusResponse }{@code >}
     *     
     */
    public void setGetFileFetchFetchingStatusResult(JAXBElement<FileFetchStatusResponse> value) {
        this.getFileFetchFetchingStatusResult = value;
    }

}
