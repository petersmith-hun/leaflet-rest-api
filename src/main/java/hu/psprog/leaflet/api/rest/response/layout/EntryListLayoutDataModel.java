package hu.psprog.leaflet.api.rest.response.layout;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import hu.psprog.leaflet.api.rest.response.entry.EntryDataModel;

/**
 * Layout for entry listing with every other necessary fields.
 *
 * @author Peter Smith
 */
public class EntryListLayoutDataModel extends BaseBodyDataModel{

    private static final String ENTRIES = "entries";
    private static final String CATEGORIES = "categories";

    private EntryListLayoutDataModel() {
        // prevent direct initialization
    }

    public static class Builder {

        private EntryListLayoutDataModel entryListLayoutDataModel;

        public Builder() {
            entryListLayoutDataModel = new EntryListLayoutDataModel();
        }

        public Builder withEntry(EntryDataModel entry) {
            entryListLayoutDataModel.addListItemNode(ENTRIES, entry);
            return this;
        }

        public Builder withCategory(BaseBodyDataModel category) {
            entryListLayoutDataModel.addListItemNode(CATEGORIES, category);
            return this;
        }

        public BaseBodyDataModel build() {
            return entryListLayoutDataModel;
        }
    }
}
