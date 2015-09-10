
package org.datacontract.schemas._2004._07.openlm_server_dal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.openlm_server_dal package. 
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

    private final static QName _AgentStepKind_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.DAL.Domain", "AgentStepKind");
    private final static QName _AgentStepPrereq_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.DAL.Domain", "AgentStepPrereq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.openlm_server_dal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentStepKind }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.DAL.Domain", name = "AgentStepKind")
    public JAXBElement<AgentStepKind> createAgentStepKind(AgentStepKind value) {
        return new JAXBElement<AgentStepKind>(_AgentStepKind_QNAME, AgentStepKind.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentStepPrereq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.DAL.Domain", name = "AgentStepPrereq")
    public JAXBElement<AgentStepPrereq> createAgentStepPrereq(AgentStepPrereq value) {
        return new JAXBElement<AgentStepPrereq>(_AgentStepPrereq_QNAME, AgentStepPrereq.class, null, value);
    }

}
