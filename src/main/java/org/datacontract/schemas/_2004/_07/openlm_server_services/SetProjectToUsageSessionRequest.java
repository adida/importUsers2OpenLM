
package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_shared.SlimDateTime;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SetProjectToUsageSessionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetProjectToUsageSessionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="ProcessStartTimeUTC" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="ProjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Workstation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetProjectToUsageSessionRequest", propOrder = {
    "processStartTimeUTC",
    "projectID",
    "username",
    "workstation"
})
@XmlSeeAlso({
    SetProjectToUsageSessionByFeatureRequest.class,
    SetProjectToUsageSessionByProcessRequest.class
})
public class SetProjectToUsageSessionRequest
    extends BaseRequest
{

    @XmlElementRef(name = "ProcessStartTimeUTC", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> processStartTimeUTC;
    @XmlElement(name = "ProjectID")
    protected Integer projectID;
    @XmlElementRef(name = "Username", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> username;
    @XmlElementRef(name = "Workstation", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workstation;

    /**
     * Gets the value of the processStartTimeUTC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getProcessStartTimeUTC() {
        return processStartTimeUTC;
    }

    /**
     * Sets the value of the processStartTimeUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setProcessStartTimeUTC(JAXBElement<SlimDateTime> value) {
        this.processStartTimeUTC = value;
    }

    /**
     * Gets the value of the projectID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectID() {
        return projectID;
    }

    /**
     * Sets the value of the projectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectID(Integer value) {
        this.projectID = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsername(JAXBElement<String> value) {
        this.username = value;
    }

    /**
     * Gets the value of the workstation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkstation() {
        return workstation;
    }

    /**
     * Sets the value of the workstation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkstation(JAXBElement<String> value) {
        this.workstation = value;
    }

}
