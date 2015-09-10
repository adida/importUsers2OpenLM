
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.LicensesProcurementResponse;

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
 *         &lt;element name="GetLicensesProcurementResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LicensesProcurementResponse" minOccurs="0"/>
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
    "getLicensesProcurementResult"
})
@XmlRootElement(name = "GetLicensesProcurementResponse")
public class GetLicensesProcurementResponse {

    @XmlElementRef(name = "GetLicensesProcurementResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<LicensesProcurementResponse> getLicensesProcurementResult;

    /**
     * Gets the value of the getLicensesProcurementResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LicensesProcurementResponse }{@code >}
     *     
     */
    public JAXBElement<LicensesProcurementResponse> getGetLicensesProcurementResult() {
        return getLicensesProcurementResult;
    }

    /**
     * Sets the value of the getLicensesProcurementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LicensesProcurementResponse }{@code >}
     *     
     */
    public void setGetLicensesProcurementResult(JAXBElement<LicensesProcurementResponse> value) {
        this.getLicensesProcurementResult = value;
    }

}
