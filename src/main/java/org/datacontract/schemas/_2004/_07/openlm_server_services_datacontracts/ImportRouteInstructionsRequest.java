
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import org.datacontract.schemas._2004._07.openlm_server_services.BaseRequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ImportRouteInstructionsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportRouteInstructionsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="FileContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RouterGroupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportRouteInstructionsRequest", propOrder = {
    "fileContent",
    "routerGroupID"
})
public class ImportRouteInstructionsRequest
    extends BaseRequest
{

    @XmlElementRef(name = "FileContent", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileContent;
    @XmlElement(name = "RouterGroupID")
    protected Integer routerGroupID;

    /**
     * Gets the value of the fileContent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileContent() {
        return fileContent;
    }

    /**
     * Sets the value of the fileContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileContent(JAXBElement<String> value) {
        this.fileContent = value;
    }

    /**
     * Gets the value of the routerGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRouterGroupID() {
        return routerGroupID;
    }

    /**
     * Sets the value of the routerGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRouterGroupID(Integer value) {
        this.routerGroupID = value;
    }

}
