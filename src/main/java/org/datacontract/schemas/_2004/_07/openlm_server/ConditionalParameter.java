
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ConditionalParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionalParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums}AlertConditionOperator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionalParameter", propOrder = {
    "level",
    "name",
    "operator"
})
public class ConditionalParameter {

    @XmlElement(name = "Level")
    protected Double level;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "Operator")
    @XmlSchemaType(name = "string")
    protected AlertConditionOperator operator;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLevel(Double value) {
        this.level = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link AlertConditionOperator }
     *     
     */
    public AlertConditionOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertConditionOperator }
     *     
     */
    public void setOperator(AlertConditionOperator value) {
        this.operator = value;
    }

}
