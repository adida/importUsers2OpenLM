
package org.datacontract.schemas._2004._07.openlm_licensemanager_shared;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.openlm_licensemanager_shared package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FeaturePolicies_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Enums", "FeaturePolicies");
    private final static QName _EffectiveLicenseFeature_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", "EffectiveLicenseFeature");
    private final static QName _ArrayOfLicenseFeature_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", "ArrayOfLicenseFeature");
    private final static QName _ArrayOfEffectiveLicenseFeature_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", "ArrayOfEffectiveLicenseFeature");
    private final static QName _LicenseFeature_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", "LicenseFeature");
    private final static QName _BaseLicenseClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", "BaseLicenseClass");
    private final static QName _LicenseFeatureRemarks_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", "Remarks");
    private final static QName _BaseLicenseClassName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", "Name");
    private final static QName _BaseLicenseClassValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", "Value");
    private final static QName _BaseLicenseClassVendorName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", "VendorName");
    private final static QName _EffectiveLicenseFeatureFeatureName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", "FeatureName");
    private final static QName _EffectiveLicenseFeatureFeatures_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", "Features");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.openlm_licensemanager_shared
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LicenseFeature }
     * 
     */
    public LicenseFeature createLicenseFeature() {
        return new LicenseFeature();
    }

    /**
     * Create an instance of {@link BaseLicenseClass }
     * 
     */
    public BaseLicenseClass createBaseLicenseClass() {
        return new BaseLicenseClass();
    }

    /**
     * Create an instance of {@link EffectiveLicenseFeature }
     * 
     */
    public EffectiveLicenseFeature createEffectiveLicenseFeature() {
        return new EffectiveLicenseFeature();
    }

    /**
     * Create an instance of {@link ArrayOfEffectiveLicenseFeature }
     * 
     */
    public ArrayOfEffectiveLicenseFeature createArrayOfEffectiveLicenseFeature() {
        return new ArrayOfEffectiveLicenseFeature();
    }

    /**
     * Create an instance of {@link ArrayOfLicenseFeature }
     * 
     */
    public ArrayOfLicenseFeature createArrayOfLicenseFeature() {
        return new ArrayOfLicenseFeature();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeaturePolicies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Enums", name = "FeaturePolicies")
    public JAXBElement<FeaturePolicies> createFeaturePolicies(FeaturePolicies value) {
        return new JAXBElement<FeaturePolicies>(_FeaturePolicies_QNAME, FeaturePolicies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EffectiveLicenseFeature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", name = "EffectiveLicenseFeature")
    public JAXBElement<EffectiveLicenseFeature> createEffectiveLicenseFeature(EffectiveLicenseFeature value) {
        return new JAXBElement<EffectiveLicenseFeature>(_EffectiveLicenseFeature_QNAME, EffectiveLicenseFeature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseFeature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", name = "ArrayOfLicenseFeature")
    public JAXBElement<ArrayOfLicenseFeature> createArrayOfLicenseFeature(ArrayOfLicenseFeature value) {
        return new JAXBElement<ArrayOfLicenseFeature>(_ArrayOfLicenseFeature_QNAME, ArrayOfLicenseFeature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEffectiveLicenseFeature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", name = "ArrayOfEffectiveLicenseFeature")
    public JAXBElement<ArrayOfEffectiveLicenseFeature> createArrayOfEffectiveLicenseFeature(ArrayOfEffectiveLicenseFeature value) {
        return new JAXBElement<ArrayOfEffectiveLicenseFeature>(_ArrayOfEffectiveLicenseFeature_QNAME, ArrayOfEffectiveLicenseFeature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseFeature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", name = "LicenseFeature")
    public JAXBElement<LicenseFeature> createLicenseFeature(LicenseFeature value) {
        return new JAXBElement<LicenseFeature>(_LicenseFeature_QNAME, LicenseFeature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseLicenseClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", name = "BaseLicenseClass")
    public JAXBElement<BaseLicenseClass> createBaseLicenseClass(BaseLicenseClass value) {
        return new JAXBElement<BaseLicenseClass>(_BaseLicenseClass_QNAME, BaseLicenseClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", name = "Remarks", scope = LicenseFeature.class)
    public JAXBElement<String> createLicenseFeatureRemarks(String value) {
        return new JAXBElement<String>(_LicenseFeatureRemarks_QNAME, String.class, LicenseFeature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", name = "Name", scope = BaseLicenseClass.class)
    public JAXBElement<String> createBaseLicenseClassName(String value) {
        return new JAXBElement<String>(_BaseLicenseClassName_QNAME, String.class, BaseLicenseClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", name = "Value", scope = BaseLicenseClass.class)
    public JAXBElement<String> createBaseLicenseClassValue(String value) {
        return new JAXBElement<String>(_BaseLicenseClassValue_QNAME, String.class, BaseLicenseClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", name = "VendorName", scope = BaseLicenseClass.class)
    public JAXBElement<String> createBaseLicenseClassVendorName(String value) {
        return new JAXBElement<String>(_BaseLicenseClassVendorName_QNAME, String.class, BaseLicenseClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", name = "FeatureName", scope = EffectiveLicenseFeature.class)
    public JAXBElement<String> createEffectiveLicenseFeatureFeatureName(String value) {
        return new JAXBElement<String>(_EffectiveLicenseFeatureFeatureName_QNAME, String.class, EffectiveLicenseFeature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseFeature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", name = "Features", scope = EffectiveLicenseFeature.class)
    public JAXBElement<ArrayOfLicenseFeature> createEffectiveLicenseFeatureFeatures(ArrayOfLicenseFeature value) {
        return new JAXBElement<ArrayOfLicenseFeature>(_EffectiveLicenseFeatureFeatures_QNAME, ArrayOfLicenseFeature.class, EffectiveLicenseFeature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", name = "Value", scope = EffectiveLicenseFeature.class)
    public JAXBElement<String> createEffectiveLicenseFeatureValue(String value) {
        return new JAXBElement<String>(_BaseLicenseClassValue_QNAME, String.class, EffectiveLicenseFeature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.LicenseManager.Shared.Domain", name = "VendorName", scope = EffectiveLicenseFeature.class)
    public JAXBElement<String> createEffectiveLicenseFeatureVendorName(String value) {
        return new JAXBElement<String>(_BaseLicenseClassVendorName_QNAME, String.class, EffectiveLicenseFeature.class, value);
    }

}
