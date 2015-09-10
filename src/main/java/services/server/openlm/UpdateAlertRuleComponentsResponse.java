
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse;

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
 *         &lt;element name="UpdateAlertRuleComponentsResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse" minOccurs="0"/>
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
    "updateAlertRuleComponentsResult"
})
@XmlRootElement(name = "UpdateAlertRuleComponentsResponse")
public class UpdateAlertRuleComponentsResponse {

    @XmlElementRef(name = "UpdateAlertRuleComponentsResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<BaseResponse> updateAlertRuleComponentsResult;

    /**
     * Gets the value of the updateAlertRuleComponentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     *     
     */
    public JAXBElement<BaseResponse> getUpdateAlertRuleComponentsResult() {
        return updateAlertRuleComponentsResult;
    }

    /**
     * Sets the value of the updateAlertRuleComponentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     *     
     */
    public void setUpdateAlertRuleComponentsResult(JAXBElement<BaseResponse> value) {
        this.updateAlertRuleComponentsResult = value;
    }

}
