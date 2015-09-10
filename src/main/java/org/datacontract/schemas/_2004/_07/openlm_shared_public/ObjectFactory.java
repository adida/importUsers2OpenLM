
package org.datacontract.schemas._2004._07.openlm_shared_public;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.openlm_shared_public package. 
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

    private final static QName _LicenseTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums", "LicenseTypes");
    private final static QName _RouterStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums", "RouterStatus");
    private final static QName _RouterListenerPortStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums", "RouterListenerPortStatus");
    private final static QName _RouterListenerPortProtocol_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums", "RouterListenerPortProtocol");
    private final static QName _ArrayOfLicenseTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums", "ArrayOfLicenseTypes");
    private final static QName _LicenseManagerStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums", "LicenseManagerStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.openlm_shared_public
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfLicenseTypes }
     * 
     */
    public ArrayOfLicenseTypes createArrayOfLicenseTypes() {
        return new ArrayOfLicenseTypes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums", name = "LicenseTypes")
    public JAXBElement<LicenseTypes> createLicenseTypes(LicenseTypes value) {
        return new JAXBElement<LicenseTypes>(_LicenseTypes_QNAME, LicenseTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums", name = "RouterStatus")
    public JAXBElement<RouterStatus> createRouterStatus(RouterStatus value) {
        return new JAXBElement<RouterStatus>(_RouterStatus_QNAME, RouterStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterListenerPortStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums", name = "RouterListenerPortStatus")
    public JAXBElement<RouterListenerPortStatus> createRouterListenerPortStatus(RouterListenerPortStatus value) {
        return new JAXBElement<RouterListenerPortStatus>(_RouterListenerPortStatus_QNAME, RouterListenerPortStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterListenerPortProtocol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums", name = "RouterListenerPortProtocol")
    public JAXBElement<RouterListenerPortProtocol> createRouterListenerPortProtocol(RouterListenerPortProtocol value) {
        return new JAXBElement<RouterListenerPortProtocol>(_RouterListenerPortProtocol_QNAME, RouterListenerPortProtocol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums", name = "ArrayOfLicenseTypes")
    public JAXBElement<ArrayOfLicenseTypes> createArrayOfLicenseTypes(ArrayOfLicenseTypes value) {
        return new JAXBElement<ArrayOfLicenseTypes>(_ArrayOfLicenseTypes_QNAME, ArrayOfLicenseTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseManagerStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums", name = "LicenseManagerStatus")
    public JAXBElement<LicenseManagerStatus> createLicenseManagerStatus(LicenseManagerStatus value) {
        return new JAXBElement<LicenseManagerStatus>(_LicenseManagerStatus_QNAME, LicenseManagerStatus.class, null, value);
    }

}
