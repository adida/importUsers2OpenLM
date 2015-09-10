
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.CurrentlyConsumedLicensesResponse;

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
 *         &lt;element name="GetCurrentlyConsumedLicensesResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}CurrentlyConsumedLicensesResponse" minOccurs="0"/>
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
    "getCurrentlyConsumedLicensesResult"
})
@XmlRootElement(name = "GetCurrentlyConsumedLicensesResponse")
public class GetCurrentlyConsumedLicensesResponse {

    @XmlElementRef(name = "GetCurrentlyConsumedLicensesResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<CurrentlyConsumedLicensesResponse> getCurrentlyConsumedLicensesResult;

    /**
     * Gets the value of the getCurrentlyConsumedLicensesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurrentlyConsumedLicensesResponse }{@code >}
     *     
     */
    public JAXBElement<CurrentlyConsumedLicensesResponse> getGetCurrentlyConsumedLicensesResult() {
        return getCurrentlyConsumedLicensesResult;
    }

    /**
     * Sets the value of the getCurrentlyConsumedLicensesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurrentlyConsumedLicensesResponse }{@code >}
     *     
     */
    public void setGetCurrentlyConsumedLicensesResult(JAXBElement<CurrentlyConsumedLicensesResponse> value) {
        this.getCurrentlyConsumedLicensesResult = value;
    }

}
