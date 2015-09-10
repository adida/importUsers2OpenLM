
package org.datacontract.schemas._2004._07.openlm_server;

import org.datacontract.schemas._2004._07.openlm_server_services.BaseRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicensesProcurementComponentsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicensesProcurementComponentsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="LicenseProcurementId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicensesProcurementComponentsRequest", propOrder = {
    "licenseProcurementId"
})
public class LicensesProcurementComponentsRequest
    extends BaseRequest
{

    @XmlElement(name = "LicenseProcurementId")
    protected Integer licenseProcurementId;

    /**
     * Gets the value of the licenseProcurementId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLicenseProcurementId() {
        return licenseProcurementId;
    }

    /**
     * Sets the value of the licenseProcurementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLicenseProcurementId(Integer value) {
        this.licenseProcurementId = value;
    }

}
