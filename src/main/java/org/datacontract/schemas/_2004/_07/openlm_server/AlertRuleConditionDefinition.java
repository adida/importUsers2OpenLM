
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AlertRuleConditionDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertRuleConditionDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HasConditionalOperator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasNotifyInvolvedUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IgnoreNotificationMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "AlertRuleConditionDefinition", propOrder = {
    "hasConditionalOperator",
    "hasFilter",
    "hasNotifyInvolvedUsers",
    "ignoreNotificationMode",
    "type"
})
public class AlertRuleConditionDefinition {

    @XmlElement(name = "HasConditionalOperator")
    protected Boolean hasConditionalOperator;
    @XmlElement(name = "HasFilter")
    protected Boolean hasFilter;
    @XmlElement(name = "HasNotifyInvolvedUsers")
    protected Boolean hasNotifyInvolvedUsers;
    @XmlElement(name = "IgnoreNotificationMode")
    protected Boolean ignoreNotificationMode;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected AlertRuleConditionType type;

    /**
     * Gets the value of the hasConditionalOperator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasConditionalOperator() {
        return hasConditionalOperator;
    }

    /**
     * Sets the value of the hasConditionalOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasConditionalOperator(Boolean value) {
        this.hasConditionalOperator = value;
    }

    /**
     * Gets the value of the hasFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFilter() {
        return hasFilter;
    }

    /**
     * Sets the value of the hasFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFilter(Boolean value) {
        this.hasFilter = value;
    }

    /**
     * Gets the value of the hasNotifyInvolvedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasNotifyInvolvedUsers() {
        return hasNotifyInvolvedUsers;
    }

    /**
     * Sets the value of the hasNotifyInvolvedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasNotifyInvolvedUsers(Boolean value) {
        this.hasNotifyInvolvedUsers = value;
    }

    /**
     * Gets the value of the ignoreNotificationMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreNotificationMode() {
        return ignoreNotificationMode;
    }

    /**
     * Sets the value of the ignoreNotificationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreNotificationMode(Boolean value) {
        this.ignoreNotificationMode = value;
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
