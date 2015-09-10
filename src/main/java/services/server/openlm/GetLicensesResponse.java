
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.LicensesResponse;

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
 *         &lt;element name="GetLicensesResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LicensesResponse" minOccurs="0"/>
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
    "getLicensesResult"
})
@XmlRootElement(name = "GetLicensesResponse")
public class GetLicensesResponse {

    @XmlElementRef(name = "GetLicensesResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<LicensesResponse> getLicensesResult;

    /**
     * Gets the value of the getLicensesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LicensesResponse }{@code >}
     *     
     */
    public JAXBElement<LicensesResponse> getGetLicensesResult() {
        return getLicensesResult;
    }

    /**
     * Sets the value of the getLicensesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LicensesResponse }{@code >}
     *     
     */
    public void setGetLicensesResult(JAXBElement<LicensesResponse> value) {
        this.getLicensesResult = value;
    }

}
