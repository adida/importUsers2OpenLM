
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
 *         &lt;element name="SetProjectToUsageSessionByProcessResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse" minOccurs="0"/>
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
    "setProjectToUsageSessionByProcessResult"
})
@XmlRootElement(name = "SetProjectToUsageSessionByProcessResponse")
public class SetProjectToUsageSessionByProcessResponse {

    @XmlElementRef(name = "SetProjectToUsageSessionByProcessResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<BaseResponse> setProjectToUsageSessionByProcessResult;

    /**
     * Gets the value of the setProjectToUsageSessionByProcessResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     *     
     */
    public JAXBElement<BaseResponse> getSetProjectToUsageSessionByProcessResult() {
        return setProjectToUsageSessionByProcessResult;
    }

    /**
     * Sets the value of the setProjectToUsageSessionByProcessResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     *     
     */
    public void setSetProjectToUsageSessionByProcessResult(JAXBElement<BaseResponse> value) {
        this.setProjectToUsageSessionByProcessResult = value;
    }

}
