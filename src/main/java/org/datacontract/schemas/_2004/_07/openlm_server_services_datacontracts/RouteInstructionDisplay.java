
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import org.datacontract.schemas._2004._07.openlm_server.UpdateAction;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RouteInstructionDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteInstructionDisplay">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}RouteInstruction">
 *       &lt;sequence>
 *         &lt;element name="IsLicensed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateAction" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums}UpdateAction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteInstructionDisplay", propOrder = {
    "isLicensed",
    "updateAction"
})
public class RouteInstructionDisplay
    extends RouteInstruction
{

    @XmlElement(name = "IsLicensed")
    protected Boolean isLicensed;
    @XmlElement(name = "UpdateAction")
    @XmlSchemaType(name = "string")
    protected UpdateAction updateAction;

    /**
     * Gets the value of the isLicensed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLicensed() {
        return isLicensed;
    }

    /**
     * Sets the value of the isLicensed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLicensed(Boolean value) {
        this.isLicensed = value;
    }

    /**
     * Gets the value of the updateAction property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateAction }
     *     
     */
    public UpdateAction getUpdateAction() {
        return updateAction;
    }

    /**
     * Sets the value of the updateAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateAction }
     *     
     */
    public void setUpdateAction(UpdateAction value) {
        this.updateAction = value;
    }

}
