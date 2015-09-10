package com.openlm.userimport.api.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class represents...
 */
@XmlRootElement(name = "ULM")
@XmlAccessorType(XmlAccessType.FIELD)
public class ULM {
    @XmlElement(name = "MESSAGE")
    Message message;
    @XmlElement(name = "SESSION")
    Session session;

    @XmlElement(name = "PARAMETERS")
    Parameters parameters;

    @XmlElement(name = "PROJECTS")
    Projects projects;
    @XmlElement(name = "GROUPS")
    Groups groups;

    @XmlElement(name = "PAGING")
    Paging paging;
    @XmlElement(name = "SHOW_DISABLED")
    Boolean showDisabled;

    @XmlElement(name = "NAME")
    String name;
    @XmlElement(name = "PWD")
    String pwd;
    @XmlElement(name = "SESSIONID")
    String sessionId;
    @XmlElement(name = "USERNAME")
    String userName;
    @XmlElement(name = "USERID")
    String userId;

    public ULM() {
    }

    public ULM(String sessionId, Message.Method type) {
        this.message = new Message();
        this.message.type = type;
        this.session = new Session(sessionId);
    }

    public void printXml(OutputStream out) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(this, out);
    }

    public static ULM parse(InputStream in) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ULM.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (ULM) unmarshaller.unmarshal(in);
    }

    public ULM parameter(String name, String value) {
        if(this.parameters == null){
            this.parameters = new Parameters();
            this.parameters.list = new ArrayList<>();
        }
        if(value != null && !value.isEmpty()) {
            this.parameters.list.add(new Parameter(name, value));
        }
        return this;
    }

    public Optional<String> parameter(final String name) {
        Stream<Parameter> stream;
        //PARAMETER can be in both ULM and Message
        if(this.parameters != null){
            stream = this.parameters.list.stream();
        } else {
            //Filter out the Parameter because of the mixed content allowed there
            stream = this.message.content.stream().filter((o) -> o instanceof Parameter).map((o) -> (Parameter)o);
        }
        return stream
                .filter((p) -> name.equalsIgnoreCase(p.name))
                .map((p) -> p.value)
                .findAny();
    }

    public ULM projects(String defaultProject, List<String> projects) {
        this.projects = create(
                Projects::new,
                Project::new,
                defaultProject,
                projects);
        return this;
    }

    public ULM groups(String defaultGroup, List<String> groups) {
        this.groups = create(
                Groups::new,
                Group::new,
                defaultGroup,
                groups);
        return this;
    }

    //Projects and Groups are very similar.
    //But copy/paste here was easier to read
    private <T extends AbstractEntity, R extends AbstractEntityList<T>> R create(
            Supplier<R> listConstructor,
            Function<String, T> entityConstructor,
            String defaultId,
            List<String> projects) {
        if(defaultId == null && (projects == null || projects.isEmpty())) return null;
        R list = listConstructor.get();
        if(defaultId != null){
            list.defaultId = defaultId;
        }
        if(projects != null){
            list.list = projects.stream().map(entityConstructor).collect(Collectors.toList());
        }
        return list;
    }
}
