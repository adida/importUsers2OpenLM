
package org.datacontract.schemas._2004._07.system_collections;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_P complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_P">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValuePairOfSlimDateTimeintbqsusEw_P" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfSlimDateTimeintbqsusEw_P" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_P", propOrder = {
    "keyValuePairOfSlimDateTimeintbqsusEwP"
})
public class ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP {

    @XmlElement(name = "KeyValuePairOfSlimDateTimeintbqsusEw_P")
    protected List<KeyValuePairOfSlimDateTimeintbqsusEwP> keyValuePairOfSlimDateTimeintbqsusEwP;

    /**
     * Gets the value of the keyValuePairOfSlimDateTimeintbqsusEwP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValuePairOfSlimDateTimeintbqsusEwP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOfSlimDateTimeintbqsusEwP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOfSlimDateTimeintbqsusEwP }
     * 
     * 
     */
    public List<KeyValuePairOfSlimDateTimeintbqsusEwP> getKeyValuePairOfSlimDateTimeintbqsusEwP() {
        if (keyValuePairOfSlimDateTimeintbqsusEwP == null) {
            keyValuePairOfSlimDateTimeintbqsusEwP = new ArrayList<KeyValuePairOfSlimDateTimeintbqsusEwP>();
        }
        return this.keyValuePairOfSlimDateTimeintbqsusEwP;
    }

}
