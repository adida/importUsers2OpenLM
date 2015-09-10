
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import org.datacontract.schemas._2004._07.openlm_server_services.BaseRequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateRouterGroupsAndComponentsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateRouterGroupsAndComponentsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="UpdatedGroups" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}ArrayOfRouterGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRouterGroupsAndComponentsRequest", propOrder = {
    "updatedGroups"
})
public class UpdateRouterGroupsAndComponentsRequest
    extends BaseRequest
{

    @XmlElementRef(name = "UpdatedGroups", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouterGroup> updatedGroups;

    /**
     * Gets the value of the updatedGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouterGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouterGroup> getUpdatedGroups() {
        return updatedGroups;
    }

    /**
     * Sets the value of the updatedGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouterGroup }{@code >}
     *     
     */
    public void setUpdatedGroups(JAXBElement<ArrayOfRouterGroup> value) {
        this.updatedGroups = value;
    }

}
