
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.LicenseProcurementComponentsResponse;

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
 *         &lt;element name="GetLicenseProcurementComponentsResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LicenseProcurementComponentsResponse" minOccurs="0"/>
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
    "getLicenseProcurementComponentsResult"
})
@XmlRootElement(name = "GetLicenseProcurementComponentsResponse")
public class GetLicenseProcurementComponentsResponse {

    @XmlElementRef(name = "GetLicenseProcurementComponentsResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<LicenseProcurementComponentsResponse> getLicenseProcurementComponentsResult;

    /**
     * Gets the value of the getLicenseProcurementComponentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LicenseProcurementComponentsResponse }{@code >}
     *     
     */
    public JAXBElement<LicenseProcurementComponentsResponse> getGetLicenseProcurementComponentsResult() {
        return getLicenseProcurementComponentsResult;
    }

    /**
     * Sets the value of the getLicenseProcurementComponentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LicenseProcurementComponentsResponse }{@code >}
     *     
     */
    public void setGetLicenseProcurementComponentsResult(JAXBElement<LicenseProcurementComponentsResponse> value) {
        this.getLicenseProcurementComponentsResult = value;
    }

}
