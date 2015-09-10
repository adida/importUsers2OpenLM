package com.openlm.userimport.api.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class represents...
 */
@XmlRootElement(name = "GROUP")
public class Group extends AbstractEntity {

    public Group() {
    }

    public Group(String id) {
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
