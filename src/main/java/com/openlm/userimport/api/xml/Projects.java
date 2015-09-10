package com.openlm.userimport.api.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * This class represents...
 */
@XmlRootElement(name="PROJECTS")
public class Projects extends AbstractEntityList<Project>{
    @XmlElement(name = "PROJECT")
    @Override
    public List<Project> getList() {
        return super.getList();
    }

    @XmlAttribute(name = "default_project_id")
    @Override
    public String getDefaultId() {
        return super.getDefaultId();
    }
}
