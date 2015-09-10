
package org.datacontract.schemas._2004._07.openlm_licensemanager_shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfEffectiveLicenseFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEffectiveLicenseFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EffectiveLicenseFeature" type="{http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain}EffectiveLicenseFeature" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEffectiveLicenseFeature", propOrder = {
    "effectiveLicenseFeature"
})
public class ArrayOfEffectiveLicenseFeature {

    @XmlElement(name = "EffectiveLicenseFeature", nillable = true)
    protected List<EffectiveLicenseFeature> effectiveLicenseFeature;

    /**
     * Gets the value of the effectiveLicenseFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveLicenseFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveLicenseFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EffectiveLicenseFeature }
     * 
     * 
     */
    public List<EffectiveLicenseFeature> getEffectiveLicenseFeature() {
        if (effectiveLicenseFeature == null) {
            effectiveLicenseFeature = new ArrayList<EffectiveLicenseFeature>();
        }
        return this.effectiveLicenseFeature;
    }

}
