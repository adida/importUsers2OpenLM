
package org.datacontract.schemas._2004._07.openlm_licensemanager_shared;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LicenseFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseFeature">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain}BaseLicenseClass">
 *       &lt;sequence>
 *         &lt;element name="Policy" type="{http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Enums}FeaturePolicies" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseFeature", propOrder = {
    "policy",
    "quantity",
    "remarks"
})
public class LicenseFeature
    extends BaseLicenseClass
{

    @XmlElement(name = "Policy")
    @XmlSchemaType(name = "string")
    protected FeaturePolicies policy;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElementRef(name = "Remarks", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remarks;

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturePolicies }
     *     
     */
    public FeaturePolicies getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturePolicies }
     *     
     */
    public void setPolicy(FeaturePolicies value) {
        this.policy = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemarks(JAXBElement<String> value) {
        this.remarks = value;
    }

}
