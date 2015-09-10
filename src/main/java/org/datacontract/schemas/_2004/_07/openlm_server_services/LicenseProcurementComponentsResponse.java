
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseProcurementComponentsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseProcurementComponentsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Components" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfLicensePackageComponent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseProcurementComponentsResponse", propOrder = {
    "components"
})
public class LicenseProcurementComponentsResponse
    extends BaseResponse
{

    @XmlElementRef(name = "Components", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLicensePackageComponent> components;

    /**
     * Gets the value of the components property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicensePackageComponent }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLicensePackageComponent> getComponents() {
        return components;
    }

    /**
     * Sets the value of the components property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicensePackageComponent }{@code >}
     *     
     */
    public void setComponents(JAXBElement<ArrayOfLicensePackageComponent> value) {
        this.components = value;
    }

}
