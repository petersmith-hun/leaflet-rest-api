package hu.psprog.leaflet.api.rest.response.entity;

import hu.psprog.leaflet.api.rest.common.BaseBodyDataModel;

/**
 * @author Peter Smith
 */
public final class EntryDataModel extends BaseBodyDataModel {

    private static final String TITLE = "title";
    private static final String USER = "user";
    private static final String TAGS = "tags";

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
