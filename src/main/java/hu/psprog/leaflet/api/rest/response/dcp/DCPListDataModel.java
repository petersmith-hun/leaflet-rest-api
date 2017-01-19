package hu.psprog.leaflet.api.rest.response.dcp;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

import java.util.LinkedList;
import java.util.List;

/**
 * Response data model for list of DCP Store entries.
 *
 * @author Peter Smith
 */
public class DCPListDataModel extends BaseBodyDataModel {

    private List<DCPDataModel> dcpStore;

    private DCPListDataModel() {
        // prevent
    }

    public void setDcpStore(List<DCPDataModel> dcpStore) {
        this.dcpStore = dcpStore;
    }

    public List<DCPDataModel> getDcpStore() {
        return dcpStore;
    }


    public static final class Builder {
        private List<DCPDataModel> dcpStore;

        public Builder() {
            dcpStore = new LinkedList<>();
        }

        public Builder withItem(DCPDataModel dcpStoreItem) {
            this.dcpStore.add(dcpStoreItem);
            return this;
        }

        public DCPListDataModel build() {
            DCPListDataModel dCPListDataModel = new DCPListDataModel();
            dCPListDataModel.dcpStore = this.dcpStore;
            return dCPListDataModel;
        }
    }
}
