
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.openlm_server_services.BaseRequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RouterGroupsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouterGroupsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="GroupIDs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="IncludeGroupComponents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouterGroupsRequest", propOrder = {
    "groupIDs",
    "includeGroupComponents"
})
public class RouterGroupsRequest
    extends BaseRequest
{

    @XmlElementRef(name = "GroupIDs", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> groupIDs;
    @XmlElement(name = "IncludeGroupComponents")
    protected Boolean includeGroupComponents;

    /**
     * Gets the value of the groupIDs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getGroupIDs() {
        return groupIDs;
    }

    /**
     * Sets the value of the groupIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setGroupIDs(JAXBElement<ArrayOfint> value) {
        this.groupIDs = value;
    }

    /**
     * Gets the value of the includeGroupComponents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeGroupComponents() {
        return includeGroupComponents;
    }

    /**
     * Sets the value of the includeGroupComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeGroupComponents(Boolean value) {
        this.includeGroupComponents = value;
    }

}
