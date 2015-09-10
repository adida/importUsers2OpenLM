
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfLicenseStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLicenseStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LicenseStatistics" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}LicenseStatistics" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLicenseStatistics", propOrder = {
    "licenseStatistics"
})
public class ArrayOfLicenseStatistics {

    @XmlElement(name = "LicenseStatistics", nillable = true)
    protected List<LicenseStatistics> licenseStatistics;

    /**
     * Gets the value of the licenseStatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseStatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseStatistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseStatistics }
     * 
     * 
     */
    public List<LicenseStatistics> getLicenseStatistics() {
        if (licenseStatistics == null) {
            licenseStatistics = new ArrayList<LicenseStatistics>();
        }
        return this.licenseStatistics;
    }

}
