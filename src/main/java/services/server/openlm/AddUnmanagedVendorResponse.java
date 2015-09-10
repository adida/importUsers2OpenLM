
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
 *         &lt;element name="AddUnmanagedVendorResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}AddUnmanagedVendorResponse" minOccurs="0"/>
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
    "addUnmanagedVendorResult"
})
@XmlRootElement(name = "AddUnmanagedVendorResponse")
public class AddUnmanagedVendorResponse {

    @XmlElementRef(name = "AddUnmanagedVendorResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.AddUnmanagedVendorResponse> addUnmanagedVendorResult;

    /**
     * Gets the value of the addUnmanagedVendorResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.AddUnmanagedVendorResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.AddUnmanagedVendorResponse> getAddUnmanagedVendorResult() {
        return addUnmanagedVendorResult;
    }

    /**
     * Sets the value of the addUnmanagedVendorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.AddUnmanagedVendorResponse }{@code >}
     *     
     */
    public void setAddUnmanagedVendorResult(JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.AddUnmanagedVendorResponse> value) {
        this.addUnmanagedVendorResult = value;
    }

}
