
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.SystemMessagesResponse;

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
 *         &lt;element name="GetSystemMessagesResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}SystemMessagesResponse" minOccurs="0"/>
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
    "getSystemMessagesResult"
})
@XmlRootElement(name = "GetSystemMessagesResponse")
public class GetSystemMessagesResponse {

    @XmlElementRef(name = "GetSystemMessagesResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<SystemMessagesResponse> getSystemMessagesResult;

    /**
     * Gets the value of the getSystemMessagesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SystemMessagesResponse }{@code >}
     *     
     */
    public JAXBElement<SystemMessagesResponse> getGetSystemMessagesResult() {
        return getSystemMessagesResult;
    }

    /**
     * Sets the value of the getSystemMessagesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SystemMessagesResponse }{@code >}
     *     
     */
    public void setGetSystemMessagesResult(JAXBElement<SystemMessagesResponse> value) {
        this.getSystemMessagesResult = value;
    }

}
