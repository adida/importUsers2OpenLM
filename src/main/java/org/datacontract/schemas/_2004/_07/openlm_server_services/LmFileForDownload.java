
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LmFileForDownload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LmFileForDownload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HostId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PathOnServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LmFileForDownload", propOrder = {
    "fileId",
    "fileName",
    "hostId",
    "pathOnServer"
})
public class LmFileForDownload {

    @XmlElement(name = "FileId")
    protected Integer fileId;
    @XmlElementRef(name = "FileName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileName;
    @XmlElement(name = "HostId")
    protected Integer hostId;
    @XmlElementRef(name = "PathOnServer", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pathOnServer;

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFileId(Integer value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileName(JAXBElement<String> value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the hostId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHostId() {
        return hostId;
    }

    /**
     * Sets the value of the hostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHostId(Integer value) {
        this.hostId = value;
    }

    /**
     * Gets the value of the pathOnServer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPathOnServer() {
        return pathOnServer;
    }

    /**
     * Sets the value of the pathOnServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPathOnServer(JAXBElement<String> value) {
        this.pathOnServer = value;
    }

}
