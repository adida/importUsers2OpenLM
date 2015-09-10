
package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_server.ArrayOfSelectedStatisticsResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureUsageStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureUsageStatusResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="FeaturesUsageStatuses" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfSelectedStatisticsResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureUsageStatusResponse", propOrder = {
    "featuresUsageStatuses"
})
public class FeatureUsageStatusResponse
    extends BaseResponse
{

    @XmlElementRef(name = "FeaturesUsageStatuses", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSelectedStatisticsResponse> featuresUsageStatuses;

    /**
     * Gets the value of the featuresUsageStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSelectedStatisticsResponse }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSelectedStatisticsResponse> getFeaturesUsageStatuses() {
        return featuresUsageStatuses;
    }

    /**
     * Sets the value of the featuresUsageStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSelectedStatisticsResponse }{@code >}
     *     
     */
    public void setFeaturesUsageStatuses(JAXBElement<ArrayOfSelectedStatisticsResponse> value) {
        this.featuresUsageStatuses = value;
    }

}
