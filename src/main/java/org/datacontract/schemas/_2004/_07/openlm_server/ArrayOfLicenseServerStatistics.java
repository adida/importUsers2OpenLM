
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfLicenseServerStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLicenseServerStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LicenseServerStatistics" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}LicenseServerStatistics" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLicenseServerStatistics", propOrder = {
    "licenseServerStatistics"
})
public class ArrayOfLicenseServerStatistics {

    @XmlElement(name = "LicenseServerStatistics", nillable = true)
    protected List<LicenseServerStatistics> licenseServerStatistics;

    /**
     * Gets the value of the licenseServerStatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseServerStatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseServerStatistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseServerStatistics }
     * 
     * 
     */
    public List<LicenseServerStatistics> getLicenseServerStatistics() {
        if (licenseServerStatistics == null) {
            licenseServerStatistics = new ArrayList<LicenseServerStatistics>();
        }
        return this.licenseServerStatistics;
    }

}
