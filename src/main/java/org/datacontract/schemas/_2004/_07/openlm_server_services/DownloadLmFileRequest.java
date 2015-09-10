
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DownloadLmFileRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DownloadLmFileRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="FileToDownload" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LmFileForDownload" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadLmFileRequest", propOrder = {
    "fileToDownload"
})
public class DownloadLmFileRequest
    extends BaseRequest
{

    @XmlElementRef(name = "FileToDownload", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<LmFileForDownload> fileToDownload;

    /**
     * Gets the value of the fileToDownload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LmFileForDownload }{@code >}
     *     
     */
    public JAXBElement<LmFileForDownload> getFileToDownload() {
        return fileToDownload;
    }

    /**
     * Sets the value of the fileToDownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LmFileForDownload }{@code >}
     *     
     */
    public void setFileToDownload(JAXBElement<LmFileForDownload> value) {
        this.fileToDownload = value;
    }

}
