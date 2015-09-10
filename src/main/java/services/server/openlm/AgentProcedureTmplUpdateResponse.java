
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
 *         &lt;element name="AgentProcedureTmplUpdateResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse" minOccurs="0"/>
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
    "agentProcedureTmplUpdateResult"
})
@XmlRootElement(name = "AgentProcedureTmplUpdateResponse")
public class AgentProcedureTmplUpdateResponse {

    @XmlElementRef(name = "AgentProcedureTmplUpdateResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<BaseResponse> agentProcedureTmplUpdateResult;

    /**
     * Gets the value of the agentProcedureTmplUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     *     
     */
    public JAXBElement<BaseResponse> getAgentProcedureTmplUpdateResult() {
        return agentProcedureTmplUpdateResult;
    }

    /**
     * Sets the value of the agentProcedureTmplUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     *     
     */
    public void setAgentProcedureTmplUpdateResult(JAXBElement<BaseResponse> value) {
        this.agentProcedureTmplUpdateResult = value;
    }

}
