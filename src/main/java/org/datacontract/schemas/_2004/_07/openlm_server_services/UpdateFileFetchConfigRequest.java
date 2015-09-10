
package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_server.FileFetchConfig;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateFileFetchConfigRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateFileFetchConfigRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="FileFetchSettingToUpdate" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}FileFetchConfig" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateFileFetchConfigRequest", propOrder = {
    "fileFetchSettingToUpdate"
})
public class UpdateFileFetchConfigRequest
    extends BaseRequest
{

    @XmlElementRef(name = "FileFetchSettingToUpdate", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<FileFetchConfig> fileFetchSettingToUpdate;

    /**
     * Gets the value of the fileFetchSettingToUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileFetchConfig }{@code >}
     *     
     */
    public JAXBElement<FileFetchConfig> getFileFetchSettingToUpdate() {
        return fileFetchSettingToUpdate;
    }

    /**
     * Sets the value of the fileFetchSettingToUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileFetchConfig }{@code >}
     *     
     */
    public void setFileFetchSettingToUpdate(JAXBElement<FileFetchConfig> value) {
        this.fileFetchSettingToUpdate = value;
    }

}
