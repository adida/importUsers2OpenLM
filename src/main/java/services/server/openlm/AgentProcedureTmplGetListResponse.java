
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.AgentProcedureTmplResponse;

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
 *         &lt;element name="AgentProcedureTmplGetListResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}AgentProcedureTmplResponse" minOccurs="0"/>
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
    "agentProcedureTmplGetListResult"
})
@XmlRootElement(name = "AgentProcedureTmplGetListResponse")
public class AgentProcedureTmplGetListResponse {

    @XmlElementRef(name = "AgentProcedureTmplGetListResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<AgentProcedureTmplResponse> agentProcedureTmplGetListResult;

    /**
     * Gets the value of the agentProcedureTmplGetListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AgentProcedureTmplResponse }{@code >}
     *     
     */
    public JAXBElement<AgentProcedureTmplResponse> getAgentProcedureTmplGetListResult() {
        return agentProcedureTmplGetListResult;
    }

    /**
     * Sets the value of the agentProcedureTmplGetListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AgentProcedureTmplResponse }{@code >}
     *     
     */
    public void setAgentProcedureTmplGetListResult(JAXBElement<AgentProcedureTmplResponse> value) {
        this.agentProcedureTmplGetListResult = value;
    }

}
