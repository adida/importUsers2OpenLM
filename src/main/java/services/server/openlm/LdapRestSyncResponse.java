
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.LDAPResetSyncResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LdapRestSyncResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LDAPResetSyncResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ldapRestSyncResult"
})
@XmlRootElement(name = "LdapRestSyncResponse")
public class LdapRestSyncResponse {

    @XmlElementRef(name = "LdapRestSyncResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<LDAPResetSyncResponse> ldapRestSyncResult;

    /**
     * Gets the value of the ldapRestSyncResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LDAPResetSyncResponse }{@code >}
     *     
     */
    public JAXBElement<LDAPResetSyncResponse> getLdapRestSyncResult() {
        return ldapRestSyncResult;
    }

    /**
     * Sets the value of the ldapRestSyncResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LDAPResetSyncResponse }{@code >}
     *     
     */
    public void setLdapRestSyncResult(JAXBElement<LDAPResetSyncResponse> value) {
        this.ldapRestSyncResult = value;
    }

}
