
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.LicensesActivityResponse;

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
 *         &lt;element name="GetLicensesActivityResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LicensesActivityResponse" minOccurs="0"/>
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
    "getLicensesActivityResult"
})
@XmlRootElement(name = "GetLicensesActivityResponse")
public class GetLicensesActivityResponse {

    @XmlElementRef(name = "GetLicensesActivityResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<LicensesActivityResponse> getLicensesActivityResult;

    /**
     * Gets the value of the getLicensesActivityResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LicensesActivityResponse }{@code >}
     *     
     */
    public JAXBElement<LicensesActivityResponse> getGetLicensesActivityResult() {
        return getLicensesActivityResult;
    }

    /**
     * Sets the value of the getLicensesActivityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LicensesActivityResponse }{@code >}
     *     
     */
    public void setGetLicensesActivityResult(JAXBElement<LicensesActivityResponse> value) {
        this.getLicensesActivityResult = value;
    }

}
