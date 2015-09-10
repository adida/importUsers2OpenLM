
package com.microsoft.schemas._2003._10.serialization.arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfstringArrayOfstringty7Ep6D1" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1", propOrder = {
    "keyValueOfstringArrayOfstringty7Ep6D1"
})
public class ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 {

    @XmlElement(name = "KeyValueOfstringArrayOfstringty7Ep6D1")
    protected List<ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 .KeyValueOfstringArrayOfstringty7Ep6D1> keyValueOfstringArrayOfstringty7Ep6D1;

    /**
     * Gets the value of the keyValueOfstringArrayOfstringty7Ep6D1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfstringArrayOfstringty7Ep6D1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfstringArrayOfstringty7Ep6D1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 .KeyValueOfstringArrayOfstringty7Ep6D1 }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 .KeyValueOfstringArrayOfstringty7Ep6D1> getKeyValueOfstringArrayOfstringty7Ep6D1() {
        if (keyValueOfstringArrayOfstringty7Ep6D1 == null) {
            keyValueOfstringArrayOfstringty7Ep6D1 = new ArrayList<ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 .KeyValueOfstringArrayOfstringty7Ep6D1>();
        }
        return this.keyValueOfstringArrayOfstringty7Ep6D1;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "value"
    })
    public static class KeyValueOfstringArrayOfstringty7Ep6D1 {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected String key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ArrayOfstring value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfstring }
         *     
         */
        public ArrayOfstring getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfstring }
         *     
         */
        public void setValue(ArrayOfstring value) {
            this.value = value;
        }

    }

}
