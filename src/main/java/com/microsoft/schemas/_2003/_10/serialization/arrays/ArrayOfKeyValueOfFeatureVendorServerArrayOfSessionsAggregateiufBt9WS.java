
package com.microsoft.schemas._2003._10.serialization.arrays;

import org.datacontract.schemas._2004._07.openlm_server.ArrayOfSessionsAggregate;
import org.datacontract.schemas._2004._07.openlm_server.FeatureVendorServer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9wS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9wS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9wS" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}FeatureVendorServer"/>
 *                   &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfSessionsAggregate"/>
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
@XmlType(name = "ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9wS", propOrder = {
    "keyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS"
})
public class ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS {

    @XmlElement(name = "KeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9wS")
    protected List<ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS.KeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS> keyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS;

    /**
     * Gets the value of the keyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS.KeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS.KeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS> getKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS() {
        if (keyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS == null) {
            keyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS = new ArrayList<ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS.KeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS>();
        }
        return this.keyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS;
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
     *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfSessionsAggregate"/>
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
    public static class KeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected FeatureVendorServer key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ArrayOfSessionsAggregate value;

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
         *     {@link ArrayOfSessionsAggregate }
         *     
         */
        public ArrayOfSessionsAggregate getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSessionsAggregate }
         *     
         */
        public void setValue(ArrayOfSessionsAggregate value) {
            this.value = value;
        }

    }

}
