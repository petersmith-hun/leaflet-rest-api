package hu.psprog.leaflet.api.rest.response.layout;

import hu.psprog.leaflet.api.rest.response.entity.EntryDataModel;

/**
 * Layout for entry listing with every other necessary fields.
 *
 * @author Peter Smith
 */
public class EntryListLayoutDataModel extends BaseLayoutDataModel {

    private static final String ENTRIES = "entries";
    private static final String CATEGORIES = "categories";

    public EntryListLayoutDataModel() {
        // prevent direct initialization
    }

    public static class Builder extends BaseLayoutDataModel.Builder {

        private BaseLayoutDataModel entryListLayoutDataModel;

        public Builder() {
            super();
            entryListLayoutDataModel = new BaseLayoutDataModel();
            super.withBody(entryListLayoutDataModel);
        }

        public Builder withEntry(EntryDataModel entry) {
            entryListLayoutDataModel.addListItemNode(ENTRIES, entry);
            return this;
        }
    }
}
