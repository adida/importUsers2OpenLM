
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.OpenLMLicenseOverviewResponse;

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
 *         &lt;element name="GetOpenLMLicenseOverviewResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}OpenLMLicenseOverviewResponse" minOccurs="0"/>
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
    "getOpenLMLicenseOverviewResult"
})
@XmlRootElement(name = "GetOpenLMLicenseOverviewResponse")
public class GetOpenLMLicenseOverviewResponse {

    @XmlElementRef(name = "GetOpenLMLicenseOverviewResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenLMLicenseOverviewResponse> getOpenLMLicenseOverviewResult;

    /**
     * Gets the value of the getOpenLMLicenseOverviewResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenLMLicenseOverviewResponse }{@code >}
     *     
     */
    public JAXBElement<OpenLMLicenseOverviewResponse> getGetOpenLMLicenseOverviewResult() {
        return getOpenLMLicenseOverviewResult;
    }

    /**
     * Sets the value of the getOpenLMLicenseOverviewResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenLMLicenseOverviewResponse }{@code >}
     *     
     */
    public void setGetOpenLMLicenseOverviewResult(JAXBElement<OpenLMLicenseOverviewResponse> value) {
        this.getOpenLMLicenseOverviewResult = value;
    }

}
