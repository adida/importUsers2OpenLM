
package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_server.PagingData;
import org.datacontract.schemas._2004._07.openlm_server.SessionRefresh;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RequestBaseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestBaseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionData" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}SessionRefresh" minOccurs="0"/>
 *         &lt;element name="PagingData" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}PagingData" minOccurs="0"/>
 *         &lt;element name="UserLocalSettings" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}UserLocalSettings" minOccurs="0"/>
 *         &lt;element name="IsExport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestBaseInfo", propOrder = {
    "sessionData",
    "pagingData",
    "userLocalSettings",
    "isExport",
    "customerId"
})
public class RequestBaseInfo {

    @XmlElementRef(name = "SessionData", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<SessionRefresh> sessionData;
    @XmlElementRef(name = "PagingData", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<PagingData> pagingData;
    @XmlElementRef(name = "UserLocalSettings", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<UserLocalSettings> userLocalSettings;
    @XmlElement(name = "IsExport")
    protected Boolean isExport;
    @XmlElementRef(name = "CustomerId", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerId;

    /**
     * Gets the value of the sessionData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SessionRefresh }{@code >}
     *     
     */
    public JAXBElement<SessionRefresh> getSessionData() {
        return sessionData;
    }

    /**
     * Sets the value of the sessionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SessionRefresh }{@code >}
     *     
     */
    public void setSessionData(JAXBElement<SessionRefresh> value) {
        this.sessionData = value;
    }

    /**
     * Gets the value of the pagingData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PagingData }{@code >}
     *     
     */
    public JAXBElement<PagingData> getPagingData() {
        return pagingData;
    }

    /**
     * Sets the value of the pagingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PagingData }{@code >}
     *     
     */
    public void setPagingData(JAXBElement<PagingData> value) {
        this.pagingData = value;
    }

    /**
     * Gets the value of the userLocalSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserLocalSettings }{@code >}
     *     
     */
    public JAXBElement<UserLocalSettings> getUserLocalSettings() {
        return userLocalSettings;
    }

    /**
     * Sets the value of the userLocalSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserLocalSettings }{@code >}
     *     
     */
    public void setUserLocalSettings(JAXBElement<UserLocalSettings> value) {
        this.userLocalSettings = value;
    }

    /**
     * Gets the value of the isExport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExport() {
        return isExport;
    }

    /**
     * Sets the value of the isExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExport(Boolean value) {
        this.isExport = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerId(JAXBElement<String> value) {
        this.customerId = value;
    }

}
