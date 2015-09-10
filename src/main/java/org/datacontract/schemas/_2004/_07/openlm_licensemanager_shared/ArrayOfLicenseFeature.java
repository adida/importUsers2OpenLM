
package org.datacontract.schemas._2004._07.openlm_licensemanager_shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfLicenseFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLicenseFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LicenseFeature" type="{http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain}LicenseFeature" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLicenseFeature", propOrder = {
    "licenseFeature"
})
public class ArrayOfLicenseFeature {

    @XmlElement(name = "LicenseFeature", nillable = true)
    protected List<LicenseFeature> licenseFeature;

    /**
     * Gets the value of the licenseFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseFeature }
     * 
     * 
     */
    public List<LicenseFeature> getLicenseFeature() {
        if (licenseFeature == null) {
            licenseFeature = new ArrayList<LicenseFeature>();
        }
        return this.licenseFeature;
    }

}
