
package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_server.PortDataCompletionStatus;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LogsUploadingStartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogsUploadingStartResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LogsUploadingBaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums}PortDataCompletionStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogsUploadingStartResponse", propOrder = {
    "status"
})
public class LogsUploadingStartResponse
    extends LogsUploadingBaseResponse
{

    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected PortDataCompletionStatus status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PortDataCompletionStatus }
     *     
     */
    public PortDataCompletionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortDataCompletionStatus }
     *     
     */
    public void setStatus(PortDataCompletionStatus value) {
        this.status = value;
    }

}
