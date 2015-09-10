
package com.microsoft.schemas._2003._10.serialization.arrays;

import org.datacontract.schemas._2004._07.openlm_server.FeatureVendorServer;
import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_PUdM6eh4V complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_PUdM6eh4V">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_PUdM6eh4V" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}FeatureVendorServer"/>
 *                   &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_P"/>
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
@XmlType(name = "ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_PUdM6eh4V", propOrder = {
    "keyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V"
})
public class ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V {

    @XmlElement(name = "KeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_PUdM6eh4V")
    protected List<ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V.KeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V> keyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V;

    /**
     * Gets the value of the keyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V.KeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V.KeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V> getKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V() {
        if (keyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V == null) {
            keyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V = new ArrayList<ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V.KeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V>();
        }
        return this.keyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V;
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
     *         &lt;element name="Key" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}FeatureVendorServer"/>
     *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_P"/>
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
    public static class KeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected FeatureVendorServer key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link FeatureVendorServer }
         *     
         */
        public FeatureVendorServer getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeatureVendorServer }
         *     
         */
        public void setKey(FeatureVendorServer value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP }
         *     
         */
        public ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP }
         *     
         */
        public void setValue(ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP value) {
            this.value = value;
        }

    }

}
