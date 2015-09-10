
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfFeatureProductVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFeatureProductVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeatureProductVersion" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}FeatureProductVersion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFeatureProductVersion", propOrder = {
    "featureProductVersion"
})
public class ArrayOfFeatureProductVersion {

    @XmlElement(name = "FeatureProductVersion", nillable = true)
    protected List<FeatureProductVersion> featureProductVersion;

    /**
     * Gets the value of the featureProductVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureProductVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureProductVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureProductVersion }
     * 
     * 
     */
    public List<FeatureProductVersion> getFeatureProductVersion() {
        if (featureProductVersion == null) {
            featureProductVersion = new ArrayList<FeatureProductVersion>();
        }
        return this.featureProductVersion;
    }

}
