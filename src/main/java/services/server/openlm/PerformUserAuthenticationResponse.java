
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.UserAuthenticationResponse;

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
 *         &lt;element name="PerformUserAuthenticationResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}UserAuthenticationResponse" minOccurs="0"/>
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
    "performUserAuthenticationResult"
})
@XmlRootElement(name = "PerformUserAuthenticationResponse")
public class PerformUserAuthenticationResponse {

    @XmlElementRef(name = "PerformUserAuthenticationResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<UserAuthenticationResponse> performUserAuthenticationResult;

    /**
     * Gets the value of the performUserAuthenticationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserAuthenticationResponse }{@code >}
     *     
     */
    public JAXBElement<UserAuthenticationResponse> getPerformUserAuthenticationResult() {
        return performUserAuthenticationResult;
    }

    /**
     * Sets the value of the performUserAuthenticationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserAuthenticationResponse }{@code >}
     *     
     */
    public void setPerformUserAuthenticationResult(JAXBElement<UserAuthenticationResponse> value) {
        this.performUserAuthenticationResult = value;
    }

}
