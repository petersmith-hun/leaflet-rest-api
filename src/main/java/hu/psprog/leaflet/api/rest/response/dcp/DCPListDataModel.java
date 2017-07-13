package hu.psprog.leaflet.api.rest.response.dcp;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.LinkedList;
import java.util.List;

/**
 * Response data model for list of DCP Store entries.
 *
 * @author Peter Smith
 */
public class DCPListDataModel extends BaseBodyDataModel {

    private List<DCPDataModel> dcpStore;

    public List<DCPDataModel> getDcpStore() {
        return dcpStore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof DCPListDataModel)) return false;

        DCPListDataModel that = (DCPListDataModel) o;

        return new EqualsBuilder()
                .append(dcpStore, that.dcpStore)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(dcpStore)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("dcpStore", dcpStore)
                .toString();
    }

    public static DCPListDataModelBuilder getBuilder() {
        return new DCPListDataModelBuilder();
    }

    public static final class DCPListDataModelBuilder {
        private List<DCPDataModel> dcpStore;

        private DCPListDataModelBuilder() {
            dcpStore = new LinkedList<>();
        }

        public DCPListDataModelBuilder withItem(DCPDataModel dcpStoreItem) {
            this.dcpStore.add(dcpStoreItem);
            return this;
        }

        public DCPListDataModelBuilder withDcpStore(List<DCPDataModel> dcpStore) {
            this.dcpStore = dcpStore;
            return this;
        }

        public DCPListDataModel build() {
            DCPListDataModel dCPListDataModel = new DCPListDataModel();
            dCPListDataModel.dcpStore = this.dcpStore;
            return dCPListDataModel;
        }
    }
}
