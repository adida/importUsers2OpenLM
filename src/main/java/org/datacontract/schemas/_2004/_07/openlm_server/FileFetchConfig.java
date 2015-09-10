
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for FileFetchConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileFetchConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DownloadFileDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnableFileFetching" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FileFetchTimeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileFetchUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileFetchConfig", propOrder = {
    "downloadFileDirectory",
    "enableFileFetching",
    "fileFetchTimeout",
    "fileFetchUrl"
})
public class FileFetchConfig {

    @XmlElementRef(name = "DownloadFileDirectory", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> downloadFileDirectory;
    @XmlElement(name = "EnableFileFetching")
    protected Boolean enableFileFetching;
    @XmlElementRef(name = "FileFetchTimeout", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileFetchTimeout;
    @XmlElementRef(name = "FileFetchUrl", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileFetchUrl;

    /**
     * Gets the value of the downloadFileDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDownloadFileDirectory() {
        return downloadFileDirectory;
    }

    /**
     * Sets the value of the downloadFileDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDownloadFileDirectory(JAXBElement<String> value) {
        this.downloadFileDirectory = value;
    }

    /**
     * Gets the value of the enableFileFetching property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableFileFetching() {
        return enableFileFetching;
    }

    /**
     * Sets the value of the enableFileFetching property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableFileFetching(Boolean value) {
        this.enableFileFetching = value;
    }

    /**
     * Gets the value of the fileFetchTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileFetchTimeout() {
        return fileFetchTimeout;
    }

    /**
     * Sets the value of the fileFetchTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileFetchTimeout(JAXBElement<String> value) {
        this.fileFetchTimeout = value;
    }

    /**
     * Gets the value of the fileFetchUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileFetchUrl() {
        return fileFetchUrl;
    }

    /**
     * Sets the value of the fileFetchUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileFetchUrl(JAXBElement<String> value) {
        this.fileFetchUrl = value;
    }

}
