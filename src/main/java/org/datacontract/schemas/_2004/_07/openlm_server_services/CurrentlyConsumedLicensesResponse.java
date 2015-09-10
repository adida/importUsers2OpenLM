
package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_server.ArrayOfCurrentlyConsumedLicense;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CurrentlyConsumedLicensesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentlyConsumedLicensesResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Licenses" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfCurrentlyConsumedLicense" minOccurs="0"/>
 *         &lt;element name="TotalNumberOfLicenses" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentlyConsumedLicensesResponse", propOrder = {
    "licenses",
    "totalNumberOfLicenses"
})
public class CurrentlyConsumedLicensesResponse
    extends BaseResponse
{

    @XmlElementRef(name = "Licenses", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCurrentlyConsumedLicense> licenses;
    @XmlElement(name = "TotalNumberOfLicenses")
    protected Long totalNumberOfLicenses;

    /**
     * Gets the value of the licenses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCurrentlyConsumedLicense }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCurrentlyConsumedLicense> getLicenses() {
        return licenses;
    }

    /**
     * Sets the value of the licenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCurrentlyConsumedLicense }{@code >}
     *     
     */
    public void setLicenses(JAXBElement<ArrayOfCurrentlyConsumedLicense> value) {
        this.licenses = value;
    }

    /**
     * Gets the value of the totalNumberOfLicenses property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumberOfLicenses() {
        return totalNumberOfLicenses;
    }

    /**
     * Sets the value of the totalNumberOfLicenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumberOfLicenses(Long value) {
        this.totalNumberOfLicenses = value;
    }

}
