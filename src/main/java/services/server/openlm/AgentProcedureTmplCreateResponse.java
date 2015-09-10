
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
 *         &lt;element name="AgentProcedureTmplCreateResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse" minOccurs="0"/>
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
    "agentProcedureTmplCreateResult"
})
@XmlRootElement(name = "AgentProcedureTmplCreateResponse")
public class AgentProcedureTmplCreateResponse {

    @XmlElementRef(name = "AgentProcedureTmplCreateResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<BaseResponse> agentProcedureTmplCreateResult;

    /**
     * Gets the value of the agentProcedureTmplCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     *     
     */
    public JAXBElement<BaseResponse> getAgentProcedureTmplCreateResult() {
        return agentProcedureTmplCreateResult;
    }

    /**
     * Sets the value of the agentProcedureTmplCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     *     
     */
    public void setAgentProcedureTmplCreateResult(JAXBElement<BaseResponse> value) {
        this.agentProcedureTmplCreateResult = value;
    }

}
