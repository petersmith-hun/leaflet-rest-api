package hu.psprog.leaflet.api.rest.response.dcp;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

/**
 * Response data model for DCP Store entries.
 *
 * @author Peter Smith
 */
public class DCPDataModel extends BaseBodyDataModel {

    private static final String KEY = "key";
    private static final String VALUE = "value";

    private DCPDataModel() {
        // prevent direct initialization
    }

    public static class Builder {

        private DCPDataModel dcpDataModel;

        public Builder() {
            dcpDataModel = new DCPDataModel();
        }

        public Builder withKey(String key) {
            dcpDataModel.addSingleNode(KEY, key);
            return this;
        }

        public Builder withValue(String value) {
            dcpDataModel.addSingleNode(VALUE, value);
            return this;
        }

        public DCPDataModel build() {
            return dcpDataModel;
        }
    }
}
