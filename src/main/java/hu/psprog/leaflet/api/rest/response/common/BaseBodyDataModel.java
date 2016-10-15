package hu.psprog.leaflet.api.rest.response.common;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Base data model class for every specific REST response data models.
 *
 * @author Peter Smith
 */
public abstract class BaseBodyDataModel extends HashMap<String, Object> {

    public void addSingleNode(String key, String value) {
        this.put(key, value);
    }

    public void addSingleNode(String key, Integer value) {
        this.put(key, value);
    }

    public void addSingleNode(String key, Long value) {
        this.put(key, value);
    }

    public void addSingleNode(String key, Boolean value) {
        this.put(key, value);
    }

    public void addSingleNode(String key, BaseBodyDataModel node) {
        this.put(key, node);
    }

    public void addListItemNode(String key, BaseBodyDataModel node) {

        if (!(containsKey(key) && get(key) instanceof List)) {
            this.put(key, new LinkedList<BaseBodyDataModel>());
        }
        ((List<BaseBodyDataModel>) this.get(key)).add(node);
    }
}
