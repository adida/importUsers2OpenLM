
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentProcedureTmplResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentProcedureTmplResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Templates" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfAgentProcedureTmpl" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentProcedureTmplResponse", propOrder = {
    "templates"
})
public class AgentProcedureTmplResponse
    extends BaseResponse
{

    @XmlElementRef(name = "Templates", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAgentProcedureTmpl> templates;

    /**
     * Gets the value of the templates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAgentProcedureTmpl }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAgentProcedureTmpl> getTemplates() {
        return templates;
    }

    /**
     * Sets the value of the templates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAgentProcedureTmpl }{@code >}
     *     
     */
    public void setTemplates(JAXBElement<ArrayOfAgentProcedureTmpl> value) {
        this.templates = value;
    }

}
