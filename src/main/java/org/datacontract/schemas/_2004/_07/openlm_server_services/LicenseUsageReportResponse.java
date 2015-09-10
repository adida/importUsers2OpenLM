
package org.datacontract.schemas._2004._07.openlm_server_services;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfFeatureVendorServerArrayOfDateLeveliufBt9WS;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LicenseUsageReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseUsageReportResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="AggregateSessionsDictionary" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9wS" minOccurs="0"/>
 *         &lt;element name="DateQuantitiesSessionsDictionary" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_PUdM6eh4V" minOccurs="0"/>
 *         &lt;element name="Totals" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfFeatureVendorServerArrayOfDateLeveliufBt9wS" minOccurs="0"/>
 *         &lt;element name="UsageReportType" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LicenseUsageReportType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseUsageReportResponse", propOrder = {
    "aggregateSessionsDictionary",
    "dateQuantitiesSessionsDictionary",
    "totals",
    "usageReportType"
})
public class LicenseUsageReportResponse
    extends BaseResponse
{

    @XmlElementRef(name = "AggregateSessionsDictionary", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS> aggregateSessionsDictionary;
    @XmlElementRef(name = "DateQuantitiesSessionsDictionary", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V> dateQuantitiesSessionsDictionary;
    @XmlElementRef(name = "Totals", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfFeatureVendorServerArrayOfDateLeveliufBt9WS> totals;
    @XmlElement(name = "UsageReportType")
    @XmlSchemaType(name = "string")
    protected LicenseUsageReportType usageReportType;

    /**
     * Gets the value of the aggregateSessionsDictionary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS> getAggregateSessionsDictionary() {
        return aggregateSessionsDictionary;
    }

    /**
     * Sets the value of the aggregateSessionsDictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS }{@code >}
     *     
     */
    public void setAggregateSessionsDictionary(JAXBElement<ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS> value) {
        this.aggregateSessionsDictionary = value;
    }

    /**
     * Gets the value of the dateQuantitiesSessionsDictionary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V> getDateQuantitiesSessionsDictionary() {
        return dateQuantitiesSessionsDictionary;
    }

    /**
     * Sets the value of the dateQuantitiesSessionsDictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V }{@code >}
     *     
     */
    public void setDateQuantitiesSessionsDictionary(JAXBElement<ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V> value) {
        this.dateQuantitiesSessionsDictionary = value;
    }

    /**
     * Gets the value of the totals property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfFeatureVendorServerArrayOfDateLeveliufBt9WS }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfFeatureVendorServerArrayOfDateLeveliufBt9WS> getTotals() {
        return totals;
    }

    /**
     * Sets the value of the totals property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfFeatureVendorServerArrayOfDateLeveliufBt9WS }{@code >}
     *     
     */
    public void setTotals(JAXBElement<ArrayOfKeyValueOfFeatureVendorServerArrayOfDateLeveliufBt9WS> value) {
        this.totals = value;
    }

    /**
     * Gets the value of the usageReportType property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseUsageReportType }
     *     
     */
    public LicenseUsageReportType getUsageReportType() {
        return usageReportType;
    }

    /**
     * Sets the value of the usageReportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseUsageReportType }
     *     
     */
    public void setUsageReportType(LicenseUsageReportType value) {
        this.usageReportType = value;
    }

}
