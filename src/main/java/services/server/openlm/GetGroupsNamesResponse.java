
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.GroupNamesResponse;

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
 *         &lt;element name="GetGroupsNamesResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}GroupNamesResponse" minOccurs="0"/>
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
    "getGroupsNamesResult"
})
@XmlRootElement(name = "GetGroupsNamesResponse")
public class GetGroupsNamesResponse {

    @XmlElementRef(name = "GetGroupsNamesResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<GroupNamesResponse> getGroupsNamesResult;

    /**
     * Gets the value of the getGroupsNamesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GroupNamesResponse }{@code >}
     *     
     */
    public JAXBElement<GroupNamesResponse> getGetGroupsNamesResult() {
        return getGroupsNamesResult;
    }

    /**
     * Sets the value of the getGroupsNamesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GroupNamesResponse }{@code >}
     *     
     */
    public void setGetGroupsNamesResult(JAXBElement<GroupNamesResponse> value) {
        this.getGroupsNamesResult = value;
    }

}
