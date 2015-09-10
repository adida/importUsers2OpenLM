
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for FileFetchStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileFetchStatusResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FetchStatus" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}FetchStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileFetchStatusResponse", propOrder = {
    "data",
    "fetchStatus"
})
public class FileFetchStatusResponse
    extends BaseResponse
{

    @XmlElementRef(name = "Data", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> data;
    @XmlElement(name = "FetchStatus")
    @XmlSchemaType(name = "string")
    protected FetchStatus fetchStatus;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setData(JAXBElement<String> value) {
        this.data = value;
    }

    /**
     * Gets the value of the fetchStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FetchStatus }
     *     
     */
    public FetchStatus getFetchStatus() {
        return fetchStatus;
    }

    /**
     * Sets the value of the fetchStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FetchStatus }
     *     
     */
    public void setFetchStatus(FetchStatus value) {
        this.fetchStatus = value;
    }

}
