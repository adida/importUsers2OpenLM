
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for GetUnmanagedVendorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUnmanagedVendorResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="TotalUnmanagedProcesses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UnmanagedProcessesAllowed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Vendors" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfUnmanagedVendor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUnmanagedVendorResponse", propOrder = {
    "totalUnmanagedProcesses",
    "unmanagedProcessesAllowed",
    "vendors"
})
public class GetUnmanagedVendorResponse
    extends BaseResponse
{

    @XmlElement(name = "TotalUnmanagedProcesses")
    protected Integer totalUnmanagedProcesses;
    @XmlElement(name = "UnmanagedProcessesAllowed")
    protected Integer unmanagedProcessesAllowed;
    @XmlElementRef(name = "Vendors", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUnmanagedVendor> vendors;

    /**
     * Gets the value of the totalUnmanagedProcesses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalUnmanagedProcesses() {
        return totalUnmanagedProcesses;
    }

    /**
     * Sets the value of the totalUnmanagedProcesses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalUnmanagedProcesses(Integer value) {
        this.totalUnmanagedProcesses = value;
    }

    /**
     * Gets the value of the unmanagedProcessesAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnmanagedProcessesAllowed() {
        return unmanagedProcessesAllowed;
    }

    /**
     * Sets the value of the unmanagedProcessesAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnmanagedProcessesAllowed(Integer value) {
        this.unmanagedProcessesAllowed = value;
    }

    /**
     * Gets the value of the vendors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnmanagedVendor }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUnmanagedVendor> getVendors() {
        return vendors;
    }

    /**
     * Sets the value of the vendors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnmanagedVendor }{@code >}
     *     
     */
    public void setVendors(JAXBElement<ArrayOfUnmanagedVendor> value) {
        this.vendors = value;
    }

}
