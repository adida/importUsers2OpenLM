
package org.datacontract.schemas._2004._07.system_collections;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfKeyValuePairOfintstring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValuePairOfintstring">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValuePairOfintstring" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfintstring" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValuePairOfintstring", propOrder = {
    "keyValuePairOfintstring"
})
public class ArrayOfKeyValuePairOfintstring {

    @XmlElement(name = "KeyValuePairOfintstring")
    protected List<KeyValuePairOfintstring> keyValuePairOfintstring;

    /**
     * Gets the value of the keyValuePairOfintstring property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValuePairOfintstring property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOfintstring().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOfintstring }
     * 
     * 
     */
    public List<KeyValuePairOfintstring> getKeyValuePairOfintstring() {
        if (keyValuePairOfintstring == null) {
            keyValuePairOfintstring = new ArrayList<KeyValuePairOfintstring>();
        }
        return this.keyValuePairOfintstring;
    }

}
