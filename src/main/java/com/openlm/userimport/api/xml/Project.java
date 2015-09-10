package com.openlm.userimport.api.xml;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * This class represents...
 */
public class Project extends AbstractEntity{

    public Project() {
    }

    public Project(String id) {
        super(id);
    }

    @XmlAttribute
    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @XmlAttribute
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @XmlAttribute
    @Override
    public void setEnabled(Boolean enabled) {
        super.setEnabled(enabled);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Boolean isEnabled() {
        return super.isEnabled();
    }
}
