
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfRouterGroupMonitoring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRouterGroupMonitoring">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RouterGroupMonitoring" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}RouterGroupMonitoring" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRouterGroupMonitoring", propOrder = {
    "routerGroupMonitoring"
})
public class ArrayOfRouterGroupMonitoring {

    @XmlElement(name = "RouterGroupMonitoring", nillable = true)
    protected List<RouterGroupMonitoring> routerGroupMonitoring;

    /**
     * Gets the value of the routerGroupMonitoring property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routerGroupMonitoring property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouterGroupMonitoring().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouterGroupMonitoring }
     * 
     * 
     */
    public List<RouterGroupMonitoring> getRouterGroupMonitoring() {
        if (routerGroupMonitoring == null) {
            routerGroupMonitoring = new ArrayList<RouterGroupMonitoring>();
        }
        return this.routerGroupMonitoring;
    }

}
