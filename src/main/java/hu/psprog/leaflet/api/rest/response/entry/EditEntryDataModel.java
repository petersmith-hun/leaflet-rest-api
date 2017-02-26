package hu.psprog.leaflet.api.rest.response.entry;

import hu.psprog.leaflet.api.rest.response.category.CategoryDataModel;
import hu.psprog.leaflet.api.rest.response.tag.TagDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;

import java.util.List;

/**
 * Response data model for entry editor returning RAW_CONTENT instead of rendered content.
 *
 * @author Peter Smith
 */
public class EditEntryDataModel extends EntryDataModel {

    private String rawContent;
    private boolean enabled;
    private String entryStatus;

    public String getRawContent() {
        return rawContent;
    }

    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getEntryStatus() {
        return entryStatus;
    }

    public void setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus;
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
        private String rawContent;
        private String lastModified;
        private boolean enabled;
        private String entryStatus;

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

        public Builder withRawContent(String rawContent) {
            this.rawContent = rawContent;
            return this;
        }

        public Builder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public Builder withEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder withEntryStatus(String entryStatus) {
            this.entryStatus = entryStatus;
            return this;
        }

        public EditEntryDataModel build() {
            EditEntryDataModel entryDataModel = new EditEntryDataModel();
            entryDataModel.prologue = this.prologue;
            entryDataModel.id = this.id;
            entryDataModel.created = this.created;
            entryDataModel.title = this.title;
            entryDataModel.tags = this.tags;
            entryDataModel.link = this.link;
            entryDataModel.category = this.category;
            entryDataModel.user = this.user;
            entryDataModel.rawContent = this.rawContent;
            entryDataModel.lastModified = this.lastModified;
            entryDataModel.enabled = this.enabled;
            entryDataModel.entryStatus = this.entryStatus;
            return entryDataModel;
        }
    }
}
