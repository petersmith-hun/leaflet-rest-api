package hu.psprog.leaflet.api.rest.response.entity;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

/**
 * Response data model for entries.
 *
 * @author Peter Smith
 */
public class EntryDataModel extends BaseBodyDataModel {

    private static final String TITLE = "title";
    private static final String USER = "user";
    private static final String TAGS = "tags";

    private EntryDataModel() {
        // prevent direct initialization
    }

    public static class Builder {

        private EntryDataModel entryDataModel;

        public Builder() {
            this.entryDataModel = new EntryDataModel();
        }

        public Builder withTag(TagDataModel tag) {
            entryDataModel.addListItemNode(TAGS, tag);
            return this;
        }

        public Builder withTitle(String title) {
            entryDataModel.addSingleNode(TITLE, title);
            return this;
        }

        public Builder withOwner(UserDataModel owner) {
            entryDataModel.addSingleNode(USER, owner);
            return this;
        }

        public EntryDataModel build() {
            return entryDataModel;
        }
    }
}
