package hu.psprog.leaflet.api.rest.response.dcp;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

/**
 * Response data model for DCP Store entries.
 *
 * @author Peter Smith
 */
public class DCPDataModel extends BaseBodyDataModel {

    private String key;
    private String value;

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }


    public static final class Builder {
        private String key;
        private String value;

        public Builder withKey(String key) {
            this.key = key;
            return this;
        }

        public Builder withValue(String value) {
            this.value = value;
            return this;
        }

        public DCPDataModel build() {
            DCPDataModel dCPDataModel = new DCPDataModel();
            dCPDataModel.key = this.key;
            dCPDataModel.value = this.value;
            return dCPDataModel;
        }
    }
}
