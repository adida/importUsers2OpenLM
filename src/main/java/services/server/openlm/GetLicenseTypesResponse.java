
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.LicenseTypesResponse;

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
 *         &lt;element name="GetLicenseTypesResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LicenseTypesResponse" minOccurs="0"/>
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
    "getLicenseTypesResult"
})
@XmlRootElement(name = "GetLicenseTypesResponse")
public class GetLicenseTypesResponse {

    @XmlElementRef(name = "GetLicenseTypesResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<LicenseTypesResponse> getLicenseTypesResult;

    /**
     * Gets the value of the getLicenseTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LicenseTypesResponse }{@code >}
     *     
     */
    public JAXBElement<LicenseTypesResponse> getGetLicenseTypesResult() {
        return getLicenseTypesResult;
    }

    /**
     * Sets the value of the getLicenseTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LicenseTypesResponse }{@code >}
     *     
     */
    public void setGetLicenseTypesResult(JAXBElement<LicenseTypesResponse> value) {
        this.getLicenseTypesResult = value;
    }

}
