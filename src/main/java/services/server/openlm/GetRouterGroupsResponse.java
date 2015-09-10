
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.RouterGroupsResponse;

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
 *         &lt;element name="GetRouterGroupsResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}RouterGroupsResponse" minOccurs="0"/>
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
    "getRouterGroupsResult"
})
@XmlRootElement(name = "GetRouterGroupsResponse")
public class GetRouterGroupsResponse {

    @XmlElementRef(name = "GetRouterGroupsResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<RouterGroupsResponse> getRouterGroupsResult;

    /**
     * Gets the value of the getRouterGroupsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouterGroupsResponse }{@code >}
     *     
     */
    public JAXBElement<RouterGroupsResponse> getGetRouterGroupsResult() {
        return getRouterGroupsResult;
    }

    /**
     * Sets the value of the getRouterGroupsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouterGroupsResponse }{@code >}
     *     
     */
    public void setGetRouterGroupsResult(JAXBElement<RouterGroupsResponse> value) {
        this.getRouterGroupsResult = value;
    }

}
