
package org.datacontract.schemas._2004._07.openlm_shared;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.openlm_shared package. 
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

    private final static QName _LicenseReleaseMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Shared.Enums", "LicenseReleaseMethod");
    private final static QName _SlimDateTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO", "SlimDateTime");
    private final static QName _SlimDateTimeStringFormatted_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO", "StringFormatted");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.openlm_shared
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SlimDateTime }
     * 
     */
    public SlimDateTime createSlimDateTime() {
        return new SlimDateTime();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseReleaseMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Shared.Enums", name = "LicenseReleaseMethod")
    public JAXBElement<LicenseReleaseMethod> createLicenseReleaseMethod(LicenseReleaseMethod value) {
        return new JAXBElement<LicenseReleaseMethod>(_LicenseReleaseMethod_QNAME, LicenseReleaseMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO", name = "SlimDateTime")
    public JAXBElement<SlimDateTime> createSlimDateTime(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_SlimDateTime_QNAME, SlimDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO", name = "StringFormatted", scope = SlimDateTime.class)
    public JAXBElement<String> createSlimDateTimeStringFormatted(String value) {
        return new JAXBElement<String>(_SlimDateTimeStringFormatted_QNAME, String.class, SlimDateTime.class, value);
    }

}
