
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouterConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouterConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityLogInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KeepAliveInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StatisticsInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouterConfig", propOrder = {
    "activityLogInterval",
    "enabled",
    "keepAliveInterval",
    "statisticsInterval"
})
public class RouterConfig {

    @XmlElement(name = "ActivityLogInterval")
    protected Integer activityLogInterval;
    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "KeepAliveInterval")
    protected Integer keepAliveInterval;
    @XmlElement(name = "StatisticsInterval")
    protected Integer statisticsInterval;

    /**
     * Gets the value of the activityLogInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActivityLogInterval() {
        return activityLogInterval;
    }

    /**
     * Sets the value of the activityLogInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActivityLogInterval(Integer value) {
        this.activityLogInterval = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the keepAliveInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKeepAliveInterval() {
        return keepAliveInterval;
    }

    /**
     * Sets the value of the keepAliveInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKeepAliveInterval(Integer value) {
        this.keepAliveInterval = value;
    }

    /**
     * Gets the value of the statisticsInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatisticsInterval() {
        return statisticsInterval;
    }

    /**
     * Sets the value of the statisticsInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatisticsInterval(Integer value) {
        this.statisticsInterval = value;
    }

}
