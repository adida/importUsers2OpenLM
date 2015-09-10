
package org.datacontract.schemas._2004._07.openlm_server_services;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for OptFileFeatureValidKeywordsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptFileFeatureValidKeywordsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="IsCustomValuesEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Keywords" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptFileFeatureValidKeywordsResponse", propOrder = {
    "isCustomValuesEnabled",
    "keywords"
})
public class OptFileFeatureValidKeywordsResponse
    extends BaseResponse
{

    @XmlElement(name = "IsCustomValuesEnabled")
    protected Boolean isCustomValuesEnabled;
    @XmlElementRef(name = "Keywords", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1> keywords;

    /**
     * Gets the value of the isCustomValuesEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomValuesEnabled() {
        return isCustomValuesEnabled;
    }

    /**
     * Sets the value of the isCustomValuesEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomValuesEnabled(Boolean value) {
        this.isCustomValuesEnabled = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1> getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 }{@code >}
     *     
     */
    public void setKeywords(JAXBElement<ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1> value) {
        this.keywords = value;
    }

}
