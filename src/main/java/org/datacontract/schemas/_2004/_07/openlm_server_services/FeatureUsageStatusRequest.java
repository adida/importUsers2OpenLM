
package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_server.ArrayOfSelectedStatisticsRequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureUsageStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureUsageStatusRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="Features" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfSelectedStatisticsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureUsageStatusRequest", propOrder = {
    "features"
})
public class FeatureUsageStatusRequest
    extends BaseRequest
{

    @XmlElementRef(name = "Features", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSelectedStatisticsRequest> features;

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSelectedStatisticsRequest }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSelectedStatisticsRequest> getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSelectedStatisticsRequest }{@code >}
     *     
     */
    public void setFeatures(JAXBElement<ArrayOfSelectedStatisticsRequest> value) {
        this.features = value;
    }

}
