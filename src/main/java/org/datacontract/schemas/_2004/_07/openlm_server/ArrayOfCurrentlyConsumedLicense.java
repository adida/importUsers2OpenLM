
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfCurrentlyConsumedLicense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCurrentlyConsumedLicense">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentlyConsumedLicense" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}CurrentlyConsumedLicense" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCurrentlyConsumedLicense", propOrder = {
    "currentlyConsumedLicense"
})
public class ArrayOfCurrentlyConsumedLicense {

    @XmlElement(name = "CurrentlyConsumedLicense", nillable = true)
    protected List<CurrentlyConsumedLicense> currentlyConsumedLicense;

    /**
     * Gets the value of the currentlyConsumedLicense property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentlyConsumedLicense property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentlyConsumedLicense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrentlyConsumedLicense }
     * 
     * 
     */
    public List<CurrentlyConsumedLicense> getCurrentlyConsumedLicense() {
        if (currentlyConsumedLicense == null) {
            currentlyConsumedLicense = new ArrayList<CurrentlyConsumedLicense>();
        }
        return this.currentlyConsumedLicense;
    }

}
