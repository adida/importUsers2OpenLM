
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LicensesProcurementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicensesProcurementResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="LicensesProcurements" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfLicenseProcurement" minOccurs="0"/>
 *         &lt;element name="TotalNumberOfLicensesProcurements" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicensesProcurementResponse", propOrder = {
    "licensesProcurements",
    "totalNumberOfLicensesProcurements"
})
public class LicensesProcurementResponse
    extends BaseResponse
{

    @XmlElementRef(name = "LicensesProcurements", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLicenseProcurement> licensesProcurements;
    @XmlElement(name = "TotalNumberOfLicensesProcurements")
    protected Long totalNumberOfLicensesProcurements;

    /**
     * Gets the value of the licensesProcurements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseProcurement }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLicenseProcurement> getLicensesProcurements() {
        return licensesProcurements;
    }

    /**
     * Sets the value of the licensesProcurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseProcurement }{@code >}
     *     
     */
    public void setLicensesProcurements(JAXBElement<ArrayOfLicenseProcurement> value) {
        this.licensesProcurements = value;
    }

    /**
     * Gets the value of the totalNumberOfLicensesProcurements property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumberOfLicensesProcurements() {
        return totalNumberOfLicensesProcurements;
    }

    /**
     * Sets the value of the totalNumberOfLicensesProcurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumberOfLicensesProcurements(Long value) {
        this.totalNumberOfLicensesProcurements = value;
    }

}
