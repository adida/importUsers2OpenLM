
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import org.datacontract.schemas._2004._07.openlm_server.UpdateAction;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RouterGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouterGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RouteInstructions" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}ArrayOfRouteInstructionDisplay" minOccurs="0"/>
 *         &lt;element name="Routers" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}ArrayOfRouterInfo" minOccurs="0"/>
 *         &lt;element name="UpdateAction" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums}UpdateAction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouterGroup", propOrder = {
    "description",
    "id",
    "name",
    "routeInstructions",
    "routers",
    "updateAction"
})
public class RouterGroup {

    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "RouteInstructions", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteInstructionDisplay> routeInstructions;
    @XmlElementRef(name = "Routers", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouterInfo> routers;
    @XmlElement(name = "UpdateAction")
    @XmlSchemaType(name = "string")
    protected UpdateAction updateAction;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the routeInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteInstructionDisplay }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteInstructionDisplay> getRouteInstructions() {
        return routeInstructions;
    }

    /**
     * Sets the value of the routeInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteInstructionDisplay }{@code >}
     *     
     */
    public void setRouteInstructions(JAXBElement<ArrayOfRouteInstructionDisplay> value) {
        this.routeInstructions = value;
    }

    /**
     * Gets the value of the routers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouterInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouterInfo> getRouters() {
        return routers;
    }

    /**
     * Sets the value of the routers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouterInfo }{@code >}
     *     
     */
    public void setRouters(JAXBElement<ArrayOfRouterInfo> value) {
        this.routers = value;
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
