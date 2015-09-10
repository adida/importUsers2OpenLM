
package org.datacontract.schemas._2004._07.system_collections;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.system_collections package. 
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

    private final static QName _KeyValuePairOfintstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfintstring");
    private final static QName _KeyValuePairOfSlimDateTimeintbqsusEwP_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfSlimDateTimeintbqsusEw_P");
    private final static QName _ArrayOfKeyValuePairOfintstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfintstring");
    private final static QName _ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_P");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.system_collections
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KeyValuePairOfSlimDateTimeintbqsusEwP }
     * 
     */
    public KeyValuePairOfSlimDateTimeintbqsusEwP createKeyValuePairOfSlimDateTimeintbqsusEwP() {
        return new KeyValuePairOfSlimDateTimeintbqsusEwP();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValuePairOfintstring }
     * 
     */
    public ArrayOfKeyValuePairOfintstring createArrayOfKeyValuePairOfintstring() {
        return new ArrayOfKeyValuePairOfintstring();
    }

    /**
     * Create an instance of {@link KeyValuePairOfintstring }
     * 
     */
    public KeyValuePairOfintstring createKeyValuePairOfintstring() {
        return new KeyValuePairOfintstring();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP }
     * 
     */
    public ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP createArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP() {
        return new ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfintstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "KeyValuePairOfintstring")
    public JAXBElement<KeyValuePairOfintstring> createKeyValuePairOfintstring(KeyValuePairOfintstring value) {
        return new JAXBElement<KeyValuePairOfintstring>(_KeyValuePairOfintstring_QNAME, KeyValuePairOfintstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfSlimDateTimeintbqsusEwP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "KeyValuePairOfSlimDateTimeintbqsusEw_P")
    public JAXBElement<KeyValuePairOfSlimDateTimeintbqsusEwP> createKeyValuePairOfSlimDateTimeintbqsusEwP(KeyValuePairOfSlimDateTimeintbqsusEwP value) {
        return new JAXBElement<KeyValuePairOfSlimDateTimeintbqsusEwP>(_KeyValuePairOfSlimDateTimeintbqsusEwP_QNAME, KeyValuePairOfSlimDateTimeintbqsusEwP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfintstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "ArrayOfKeyValuePairOfintstring")
    public JAXBElement<ArrayOfKeyValuePairOfintstring> createArrayOfKeyValuePairOfintstring(ArrayOfKeyValuePairOfintstring value) {
        return new JAXBElement<ArrayOfKeyValuePairOfintstring>(_ArrayOfKeyValuePairOfintstring_QNAME, ArrayOfKeyValuePairOfintstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "ArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_P")
    public JAXBElement<ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP> createArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP(ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP value) {
        return new JAXBElement<ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP>(_ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP_QNAME, ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP.class, null, value);
    }

}
