
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LMFilesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LMFilesResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="LmFilesForDownload" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfLmFileForDownload" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LMFilesResponse", propOrder = {
    "lmFilesForDownload"
})
public class LMFilesResponse
    extends BaseResponse
{

    @XmlElementRef(name = "LmFilesForDownload", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLmFileForDownload> lmFilesForDownload;

    /**
     * Gets the value of the lmFilesForDownload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLmFileForDownload }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLmFileForDownload> getLmFilesForDownload() {
        return lmFilesForDownload;
    }

    /**
     * Sets the value of the lmFilesForDownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLmFileForDownload }{@code >}
     *     
     */
    public void setLmFilesForDownload(JAXBElement<ArrayOfLmFileForDownload> value) {
        this.lmFilesForDownload = value;
    }

}
