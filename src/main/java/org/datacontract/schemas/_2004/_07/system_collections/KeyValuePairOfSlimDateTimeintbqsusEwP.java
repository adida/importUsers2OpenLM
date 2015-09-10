
package org.datacontract.schemas._2004._07.system_collections;

import org.datacontract.schemas._2004._07.openlm_shared.SlimDateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyValuePairOfSlimDateTimeintbqsusEw_P complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyValuePairOfSlimDateTimeintbqsusEw_P">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePairOfSlimDateTimeintbqsusEw_P", propOrder = {
    "key",
    "value"
})
public class KeyValuePairOfSlimDateTimeintbqsusEwP {

    @XmlElement(required = true, nillable = true)
    protected SlimDateTime key;
    protected int value;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link SlimDateTime }
     *     
     */
    public SlimDateTime getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlimDateTime }
     *     
     */
    public void setKey(SlimDateTime value) {
        this.key = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

}
