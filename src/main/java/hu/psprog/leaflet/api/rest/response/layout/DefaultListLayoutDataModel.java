package hu.psprog.leaflet.api.rest.response.layout;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.ObjectUtils;

/**
 * Default data model for lists of any body data model objects.
 *
 * @author Peter Smith
 */
public class DefaultListLayoutDataModel extends BaseBodyDataModel {

    private static final String DEFAULT_NODE_NAME = "items";

    private DefaultListLayoutDataModel() {
        // prevent direct initialization
    }

    public static class Builder {

        private DefaultListLayoutDataModel defaultListLayoutDataModel;
        private String nodeName;

        public Builder() {
            defaultListLayoutDataModel = new DefaultListLayoutDataModel();
        }

        public Builder setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        public Builder withItem(BaseBodyDataModel item) {
            defaultListLayoutDataModel.addListItemNode(ObjectUtils.firstNonNull(nodeName, DEFAULT_NODE_NAME), item);
            return this;
        }

        public DefaultListLayoutDataModel build() {
            return defaultListLayoutDataModel;
        }
    }
}
