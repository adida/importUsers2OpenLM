
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.AlertDescriptionResponse;

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
 *         &lt;element name="GetAlertDescriptionResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}AlertDescriptionResponse" minOccurs="0"/>
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
    "getAlertDescriptionResult"
})
@XmlRootElement(name = "GetAlertDescriptionResponse")
public class GetAlertDescriptionResponse {

    @XmlElementRef(name = "GetAlertDescriptionResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<AlertDescriptionResponse> getAlertDescriptionResult;

    /**
     * Gets the value of the getAlertDescriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlertDescriptionResponse }{@code >}
     *     
     */
    public JAXBElement<AlertDescriptionResponse> getGetAlertDescriptionResult() {
        return getAlertDescriptionResult;
    }

    /**
     * Sets the value of the getAlertDescriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlertDescriptionResponse }{@code >}
     *     
     */
    public void setGetAlertDescriptionResult(JAXBElement<AlertDescriptionResponse> value) {
        this.getAlertDescriptionResult = value;
    }

}
