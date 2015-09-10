
package services.server.openlm;

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
 *         &lt;element name="GetUnmanagedVendorResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}GetUnmanagedVendorResponse" minOccurs="0"/>
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
    "getUnmanagedVendorResult"
})
@XmlRootElement(name = "GetUnmanagedVendorResponse")
public class GetUnmanagedVendorResponse {

    @XmlElementRef(name = "GetUnmanagedVendorResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.GetUnmanagedVendorResponse> getUnmanagedVendorResult;

    /**
     * Gets the value of the getUnmanagedVendorResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.GetUnmanagedVendorResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.GetUnmanagedVendorResponse> getGetUnmanagedVendorResult() {
        return getUnmanagedVendorResult;
    }

    /**
     * Sets the value of the getUnmanagedVendorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.GetUnmanagedVendorResponse }{@code >}
     *     
     */
    public void setGetUnmanagedVendorResult(JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.GetUnmanagedVendorResponse> value) {
        this.getUnmanagedVendorResult = value;
    }

}
