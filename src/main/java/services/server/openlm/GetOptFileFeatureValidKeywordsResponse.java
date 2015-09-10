
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.OptFileFeatureValidKeywordsResponse;

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
 *         &lt;element name="GetOptFileFeatureValidKeywordsResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}OptFileFeatureValidKeywordsResponse" minOccurs="0"/>
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
    "getOptFileFeatureValidKeywordsResult"
})
@XmlRootElement(name = "GetOptFileFeatureValidKeywordsResponse")
public class GetOptFileFeatureValidKeywordsResponse {

    @XmlElementRef(name = "GetOptFileFeatureValidKeywordsResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<OptFileFeatureValidKeywordsResponse> getOptFileFeatureValidKeywordsResult;

    /**
     * Gets the value of the getOptFileFeatureValidKeywordsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OptFileFeatureValidKeywordsResponse }{@code >}
     *     
     */
    public JAXBElement<OptFileFeatureValidKeywordsResponse> getGetOptFileFeatureValidKeywordsResult() {
        return getOptFileFeatureValidKeywordsResult;
    }

    /**
     * Sets the value of the getOptFileFeatureValidKeywordsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OptFileFeatureValidKeywordsResponse }{@code >}
     *     
     */
    public void setGetOptFileFeatureValidKeywordsResult(JAXBElement<OptFileFeatureValidKeywordsResponse> value) {
        this.getOptFileFeatureValidKeywordsResult = value;
    }

}
