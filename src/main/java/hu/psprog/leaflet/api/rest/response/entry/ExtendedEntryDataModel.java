package hu.psprog.leaflet.api.rest.response.entry;

import hu.psprog.leaflet.api.rest.response.category.CategoryDataModel;
import hu.psprog.leaflet.api.rest.response.tag.TagDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;

import java.util.List;

/**
 * Extended response data model for entries.
 *
 * @author Peter Smith
 */
public class ExtendedEntryDataModel extends EntryDataModel {

    private String content;
    private String lastModified;

    public void setContent(String content) {
        this.content = content;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getContent() {
        return content;
    }

    public String getLastModified() {
        return lastModified;
    }

    public static final class Builder {
        private long id;
        private String title;
        private String link;
        private String prologue;
        private UserDataModel user;
        private List<TagDataModel> tags;
        private CategoryDataModel category;
        private String created;
        private String content;
        private String lastModified;

        public Builder withID(long id) {
            this.id = id;
            return this;
        }

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withLink(String link) {
            this.link = link;
            return this;
        }

        public Builder withPrologue(String prologue) {
            this.prologue = prologue;
            return this;
        }

        public Builder withOwner(UserDataModel user) {
            this.user = user;
            return this;
        }

        public Builder withTags(List<TagDataModel> tags) {
            this.tags = tags;
            return this;
        }

        public Builder withCategory(CategoryDataModel category) {
            this.category = category;
            return this;
        }

        public Builder withCreated(String created) {
            this.created = created;
            return this;
        }

        public Builder withContent(String content) {
            this.content = content;
            return this;
        }

        public Builder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public ExtendedEntryDataModel build() {
            ExtendedEntryDataModel entryDataModel = new ExtendedEntryDataModel();
            entryDataModel.prologue = this.prologue;
            entryDataModel.id = this.id;
            entryDataModel.created = this.created;
            entryDataModel.title = this.title;
            entryDataModel.tags = this.tags;
            entryDataModel.link = this.link;
            entryDataModel.category = this.category;
            entryDataModel.user = this.user;
            entryDataModel.content = this.content;
            entryDataModel.lastModified = this.lastModified;
            return entryDataModel;
        }
    }
}
