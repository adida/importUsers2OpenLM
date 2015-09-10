package com.openlm.userimport.api.xml;

import javax.xml.bind.annotation.XmlTransient;

/**
 * This class represents...
 */
public class AbstractEntity {
    String id;
    String name;
    Boolean enabled;

    public AbstractEntity() {
    }

    public AbstractEntity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    @XmlTransient
    public void setId(String id) {
        this.id = id;
    }

    @XmlTransient
    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
