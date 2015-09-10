
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentProcedureTmplRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentProcedureTmplRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="Template" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}AgentProcedureTmpl" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentProcedureTmplRequest", propOrder = {
    "template"
})
public class AgentProcedureTmplRequest
    extends BaseRequest
{

    @XmlElementRef(name = "Template", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<AgentProcedureTmpl> template;

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AgentProcedureTmpl }{@code >}
     *     
     */
    public JAXBElement<AgentProcedureTmpl> getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AgentProcedureTmpl }{@code >}
     *     
     */
    public void setTemplate(JAXBElement<AgentProcedureTmpl> value) {
        this.template = value;
    }

}
