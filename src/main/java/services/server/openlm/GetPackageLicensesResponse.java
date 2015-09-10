
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.PackageLicensesResponse;

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
 *         &lt;element name="GetPackageLicensesResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}PackageLicensesResponse" minOccurs="0"/>
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
    "getPackageLicensesResult"
})
@XmlRootElement(name = "GetPackageLicensesResponse")
public class GetPackageLicensesResponse {

    @XmlElementRef(name = "GetPackageLicensesResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<PackageLicensesResponse> getPackageLicensesResult;

    /**
     * Gets the value of the getPackageLicensesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PackageLicensesResponse }{@code >}
     *     
     */
    public JAXBElement<PackageLicensesResponse> getGetPackageLicensesResult() {
        return getPackageLicensesResult;
    }

    /**
     * Sets the value of the getPackageLicensesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PackageLicensesResponse }{@code >}
     *     
     */
    public void setGetPackageLicensesResult(JAXBElement<PackageLicensesResponse> value) {
        this.getPackageLicensesResult = value;
    }

}
