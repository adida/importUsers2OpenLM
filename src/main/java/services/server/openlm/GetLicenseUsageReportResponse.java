
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.LicenseUsageReportResponse;

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
 *         &lt;element name="GetLicenseUsageReportResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LicenseUsageReportResponse" minOccurs="0"/>
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
    "getLicenseUsageReportResult"
})
@XmlRootElement(name = "GetLicenseUsageReportResponse")
public class GetLicenseUsageReportResponse {

    @XmlElementRef(name = "GetLicenseUsageReportResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<LicenseUsageReportResponse> getLicenseUsageReportResult;

    /**
     * Gets the value of the getLicenseUsageReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LicenseUsageReportResponse }{@code >}
     *     
     */
    public JAXBElement<LicenseUsageReportResponse> getGetLicenseUsageReportResult() {
        return getLicenseUsageReportResult;
    }

    /**
     * Sets the value of the getLicenseUsageReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LicenseUsageReportResponse }{@code >}
     *     
     */
    public void setGetLicenseUsageReportResult(JAXBElement<LicenseUsageReportResponse> value) {
        this.getLicenseUsageReportResult = value;
    }

}
