package hu.psprog.leaflet.api.rest.response.dcp;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response data model for DCP Store entries.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = DCPDataModel.DCPDataModelBuilder.class)
public class DCPDataModel extends BaseBodyDataModel {

    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof DCPDataModel)) return false;

        DCPDataModel that = (DCPDataModel) o;

        return new EqualsBuilder()
                .append(key, that.key)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(key)
                .append(value)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("key", key)
                .append("value", value)
                .toString();
    }

    public static DCPDataModelBuilder getBuilder() {
        return new DCPDataModelBuilder();
    }

    public static final class DCPDataModelBuilder {
        private String key;
        private String value;

        private DCPDataModelBuilder() {
        }

        public DCPDataModelBuilder withKey(String key) {
            this.key = key;
            return this;
        }

        public DCPDataModelBuilder withValue(String value) {
            this.value = value;
            return this;
        }

        public DCPDataModel build() {
            DCPDataModel dCPDataModel = new DCPDataModel();
            dCPDataModel.value = this.value;
            dCPDataModel.key = this.key;
            return dCPDataModel;
        }
    }
}
