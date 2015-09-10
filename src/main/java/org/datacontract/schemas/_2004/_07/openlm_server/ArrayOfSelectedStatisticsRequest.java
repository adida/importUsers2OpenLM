
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfSelectedStatisticsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSelectedStatisticsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedStatisticsRequest" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}SelectedStatisticsRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSelectedStatisticsRequest", propOrder = {
    "selectedStatisticsRequest"
})
public class ArrayOfSelectedStatisticsRequest {

    @XmlElement(name = "SelectedStatisticsRequest", nillable = true)
    protected List<SelectedStatisticsRequest> selectedStatisticsRequest;

    /**
     * Gets the value of the selectedStatisticsRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedStatisticsRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedStatisticsRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectedStatisticsRequest }
     * 
     * 
     */
    public List<SelectedStatisticsRequest> getSelectedStatisticsRequest() {
        if (selectedStatisticsRequest == null) {
            selectedStatisticsRequest = new ArrayList<SelectedStatisticsRequest>();
        }
        return this.selectedStatisticsRequest;
    }

}
