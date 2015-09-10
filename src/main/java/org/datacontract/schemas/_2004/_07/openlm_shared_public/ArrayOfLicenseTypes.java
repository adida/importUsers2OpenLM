
package org.datacontract.schemas._2004._07.openlm_shared_public;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfLicenseTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLicenseTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LicenseTypes" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums}LicenseTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLicenseTypes", propOrder = {
    "licenseTypes"
})
public class ArrayOfLicenseTypes {

    @XmlElement(name = "LicenseTypes")
    @XmlSchemaType(name = "string")
    protected List<LicenseTypes> licenseTypes;

    /**
     * Gets the value of the licenseTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseTypes }
     * 
     * 
     */
    public List<LicenseTypes> getLicenseTypes() {
        if (licenseTypes == null) {
            licenseTypes = new ArrayList<LicenseTypes>();
        }
        return this.licenseTypes;
    }

}
