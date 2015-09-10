package com.openlm.userimport.api.xml;

import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;
import java.util.List;

/**
 * This class allows to create common code for Projects and Groups.
 * It's a good example when copy-pase of Group/Project related code would be easier to read and understand
 * than the generic code for those two entities
 */
public class AbstractEntityList<T> {
    List<T> list = new ArrayList<>();
    String defaultId;

    public List<T> getList() {
        return list;
    }

    @XmlTransient
    public void setList(List<T> list) {
        this.list = list;
    }

    public String getDefaultId() {
        return defaultId;
    }

    @XmlTransient
    public void setDefaultId(String defaultId) {
        this.defaultId = defaultId;
    }
}
