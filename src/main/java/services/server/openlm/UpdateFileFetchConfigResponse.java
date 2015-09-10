
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
 *         &lt;element name="UpdateFileFetchConfigResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}UpdateFileFetchConfigResponse" minOccurs="0"/>
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
    "updateFileFetchConfigResult"
})
@XmlRootElement(name = "UpdateFileFetchConfigResponse")
public class UpdateFileFetchConfigResponse {

    @XmlElementRef(name = "UpdateFileFetchConfigResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.UpdateFileFetchConfigResponse> updateFileFetchConfigResult;

    /**
     * Gets the value of the updateFileFetchConfigResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.UpdateFileFetchConfigResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.UpdateFileFetchConfigResponse> getUpdateFileFetchConfigResult() {
        return updateFileFetchConfigResult;
    }

    /**
     * Sets the value of the updateFileFetchConfigResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.UpdateFileFetchConfigResponse }{@code >}
     *     
     */
    public void setUpdateFileFetchConfigResult(JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.UpdateFileFetchConfigResponse> value) {
        this.updateFileFetchConfigResult = value;
    }

}
