
package services.server.openlm;

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
 *         &lt;element name="GetFileFetchConfigResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}GetFileFetchConfigResponse" minOccurs="0"/>
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
    "getFileFetchConfigResult"
})
@XmlRootElement(name = "GetFileFetchConfigResponse")
public class GetFileFetchConfigResponse {

    @XmlElementRef(name = "GetFileFetchConfigResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.GetFileFetchConfigResponse> getFileFetchConfigResult;

    /**
     * Gets the value of the getFileFetchConfigResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.GetFileFetchConfigResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.GetFileFetchConfigResponse> getGetFileFetchConfigResult() {
        return getFileFetchConfigResult;
    }

    /**
     * Sets the value of the getFileFetchConfigResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.GetFileFetchConfigResponse }{@code >}
     *     
     */
    public void setGetFileFetchConfigResult(JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.GetFileFetchConfigResponse> value) {
        this.getFileFetchConfigResult = value;
    }

}
