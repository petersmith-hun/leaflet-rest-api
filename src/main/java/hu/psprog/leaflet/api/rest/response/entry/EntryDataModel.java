package hu.psprog.leaflet.api.rest.response.entry;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import hu.psprog.leaflet.api.rest.response.tag.TagDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;

/**
 * Response data model for entries.
 *
 * @author Peter Smith
 */
public class EntryDataModel extends BaseBodyDataModel {

    private static final String TITLE = "title";
    private static final String LINK = "link";
    private static final String PROLOGUE = "prologue";
    private static final String USER = "user";
    private static final String TAGS = "tags";
    private static final String CREATED = "created";

    protected EntryDataModel() {
        // prevent direct initialization
    }

    public static class Builder {

        protected EntryDataModel entryDataModel;

        public Builder() {
            this.entryDataModel = new EntryDataModel();
        }

        public Builder withTitle(String title) {
            entryDataModel.addSingleNode(TITLE, title);
            return this;
        }

        public Builder withLink(String link) {
            entryDataModel.addSingleNode(LINK, link);
            return this;
        }

        public Builder withPrologue(String prologue) {
            entryDataModel.addSingleNode(PROLOGUE, prologue);
            return this;
        }

        public Builder withOwner(UserDataModel owner) {
            entryDataModel.addSingleNode(USER, owner);
            return this;
        }

        public Builder withTag(TagDataModel tag) {
            entryDataModel.addListItemNode(TAGS, tag);
            return this;
        }

        public Builder withCreated(String created) {
            entryDataModel.addSingleNode(CREATED, created);
            return this;
        }

        public EntryDataModel build() {
            return entryDataModel;
        }
    }
}
