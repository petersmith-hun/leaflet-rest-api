package hu.psprog.leaflet.api.rest.response.entry;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

import java.util.LinkedList;
import java.util.List;

/**
 * Response data model for list of entries.
 *
 * @author Peter Smith
 */
public class EntryListDataModel extends BaseBodyDataModel {

    private List<EntryDataModel> entries;

    public List<EntryDataModel> getEntries() {
        return entries;
    }

    public void setEntries(List<EntryDataModel> entries) {
        this.entries = entries;
    }

    public static final class Builder {
        private List<EntryDataModel> entries;

        public Builder() {
            entries = new LinkedList<>();
        }

        public Builder withItem(EntryDataModel entry) {
            this.entries.add(entry);
            return this;
        }

        public EntryListDataModel build() {
            EntryListDataModel entryListDataModel = new EntryListDataModel();
            entryListDataModel.setEntries(entries);
            return entryListDataModel;
        }
    }
}
