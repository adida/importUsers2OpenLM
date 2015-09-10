
package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_server.ArrayOfLicenseActivity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LicensesActivityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicensesActivityResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="LicensesActivities" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfLicenseActivity" minOccurs="0"/>
 *         &lt;element name="TotalNumberOfLicensesActivities" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicensesActivityResponse", propOrder = {
    "licensesActivities",
    "totalNumberOfLicensesActivities"
})
public class LicensesActivityResponse
    extends BaseResponse
{

    @XmlElementRef(name = "LicensesActivities", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLicenseActivity> licensesActivities;
    @XmlElement(name = "TotalNumberOfLicensesActivities")
    protected Long totalNumberOfLicensesActivities;

    /**
     * Gets the value of the licensesActivities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseActivity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLicenseActivity> getLicensesActivities() {
        return licensesActivities;
    }

    /**
     * Sets the value of the licensesActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseActivity }{@code >}
     *     
     */
    public void setLicensesActivities(JAXBElement<ArrayOfLicenseActivity> value) {
        this.licensesActivities = value;
    }

    /**
     * Gets the value of the totalNumberOfLicensesActivities property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumberOfLicensesActivities() {
        return totalNumberOfLicensesActivities;
    }

    /**
     * Sets the value of the totalNumberOfLicensesActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumberOfLicensesActivities(Long value) {
        this.totalNumberOfLicensesActivities = value;
    }

}
