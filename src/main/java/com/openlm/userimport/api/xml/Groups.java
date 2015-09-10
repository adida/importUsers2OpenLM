package com.openlm.userimport.api.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * This class represents...
 */
@XmlRootElement(name = "GROUPS")
public class Groups extends AbstractEntityList<Group>{
    @XmlElement(name = "GROUP")
    @Override
    public List<Group> getList() {
        return super.getList();
    }

    @XmlAttribute(name = "default_group_id")
    @Override
    public String getDefaultId() {
        return super.getDefaultId();
    }
}
