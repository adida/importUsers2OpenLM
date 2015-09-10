
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.LoginFormSettingsResponse;

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
 *         &lt;element name="GetLoginFormSettingsResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LoginFormSettingsResponse" minOccurs="0"/>
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
    "getLoginFormSettingsResult"
})
@XmlRootElement(name = "GetLoginFormSettingsResponse")
public class GetLoginFormSettingsResponse {

    @XmlElementRef(name = "GetLoginFormSettingsResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<LoginFormSettingsResponse> getLoginFormSettingsResult;

    /**
     * Gets the value of the getLoginFormSettingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoginFormSettingsResponse }{@code >}
     *     
     */
    public JAXBElement<LoginFormSettingsResponse> getGetLoginFormSettingsResult() {
        return getLoginFormSettingsResult;
    }

    /**
     * Sets the value of the getLoginFormSettingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoginFormSettingsResponse }{@code >}
     *     
     */
    public void setGetLoginFormSettingsResult(JAXBElement<LoginFormSettingsResponse> value) {
        this.getLoginFormSettingsResult = value;
    }

}
