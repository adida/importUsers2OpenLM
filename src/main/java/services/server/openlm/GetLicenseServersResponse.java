
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.LicenseServersResponse;

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
 *         &lt;element name="GetLicenseServersResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LicenseServersResponse" minOccurs="0"/>
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
    "getLicenseServersResult"
})
@XmlRootElement(name = "GetLicenseServersResponse")
public class GetLicenseServersResponse {

    @XmlElementRef(name = "GetLicenseServersResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<LicenseServersResponse> getLicenseServersResult;

    /**
     * Gets the value of the getLicenseServersResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LicenseServersResponse }{@code >}
     *     
     */
    public JAXBElement<LicenseServersResponse> getGetLicenseServersResult() {
        return getLicenseServersResult;
    }

    /**
     * Sets the value of the getLicenseServersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LicenseServersResponse }{@code >}
     *     
     */
    public void setGetLicenseServersResult(JAXBElement<LicenseServersResponse> value) {
        this.getLicenseServersResult = value;
    }

}
