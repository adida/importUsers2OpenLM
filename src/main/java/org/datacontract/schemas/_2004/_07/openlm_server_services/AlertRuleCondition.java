
package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_server.AlertRuleConditionParameters;
import org.datacontract.schemas._2004._07.openlm_server.AlertRuleConditionType;
import org.datacontract.schemas._2004._07.openlm_server.LogicalOperator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AlertRuleCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertRuleCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertRuleConditionParameters" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}AlertRuleConditionParameters" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LogicalOperator" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums}LogicalOperator" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums}AlertRuleConditionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertRuleCondition", propOrder = {
    "alertRuleConditionParameters",
    "description",
    "id",
    "logicalOperator",
    "order",
    "type"
})
public class AlertRuleCondition {

    @XmlElementRef(name = "AlertRuleConditionParameters", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<AlertRuleConditionParameters> alertRuleConditionParameters;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "LogicalOperator")
    @XmlSchemaType(name = "string")
    protected LogicalOperator logicalOperator;
    @XmlElement(name = "Order")
    protected Integer order;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected AlertRuleConditionType type;

    /**
     * Gets the value of the alertRuleConditionParameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlertRuleConditionParameters }{@code >}
     *     
     */
    public JAXBElement<AlertRuleConditionParameters> getAlertRuleConditionParameters() {
        return alertRuleConditionParameters;
    }

    /**
     * Sets the value of the alertRuleConditionParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlertRuleConditionParameters }{@code >}
     *     
     */
    public void setAlertRuleConditionParameters(JAXBElement<AlertRuleConditionParameters> value) {
        this.alertRuleConditionParameters = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the logicalOperator property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperator }
     *     
     */
    public LogicalOperator getLogicalOperator() {
        return logicalOperator;
    }

    /**
     * Sets the value of the logicalOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperator }
     *     
     */
    public void setLogicalOperator(LogicalOperator value) {
        this.logicalOperator = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AlertRuleConditionType }
     *     
     */
    public AlertRuleConditionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertRuleConditionType }
     *     
     */
    public void setType(AlertRuleConditionType value) {
        this.type = value;
    }

}
