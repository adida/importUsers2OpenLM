
package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_server.FileFetchConfig;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFileFetchConfigResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFileFetchConfigResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="FileFetchConfigSetting" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}FileFetchConfig" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFileFetchConfigResponse", propOrder = {
    "fileFetchConfigSetting"
})
public class GetFileFetchConfigResponse
    extends BaseResponse
{

    @XmlElementRef(name = "FileFetchConfigSetting", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<FileFetchConfig> fileFetchConfigSetting;

    /**
     * Gets the value of the fileFetchConfigSetting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileFetchConfig }{@code >}
     *     
     */
    public JAXBElement<FileFetchConfig> getFileFetchConfigSetting() {
        return fileFetchConfigSetting;
    }

    /**
     * Sets the value of the fileFetchConfigSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileFetchConfig }{@code >}
     *     
     */
    public void setFileFetchConfigSetting(JAXBElement<FileFetchConfig> value) {
        this.fileFetchConfigSetting = value;
    }

}
