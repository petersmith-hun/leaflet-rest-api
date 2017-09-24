package hu.psprog.leaflet.api.rest.response.entry;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.category.CategoryDataModel;
import hu.psprog.leaflet.api.rest.response.file.FileDataModel;
import hu.psprog.leaflet.api.rest.response.tag.TagDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Response data model for entry editor returning RAW_CONTENT instead of rendered content.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = EditEntryDataModel.EditEntryDataModelBuilder.class)
public class EditEntryDataModel extends EntryDataModel {

    private String rawContent;
    private boolean enabled;
    private String entryStatus;

    public String getRawContent() {
        return rawContent;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getEntryStatus() {
        return entryStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof EditEntryDataModel)) return false;

        EditEntryDataModel that = (EditEntryDataModel) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(enabled, that.enabled)
                .append(rawContent, that.rawContent)
                .append(entryStatus, that.entryStatus)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(rawContent)
                .append(enabled)
                .append(entryStatus)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("rawContent", rawContent)
                .append("enabled", enabled)
                .append("entryStatus", entryStatus)
                .append("id", id)
                .append("title", title)
                .append("link", link)
                .append("prologue", prologue)
                .append("user", user)
                .append("tags", tags)
                .append("category", category)
                .append("created", created)
                .append("lastModified", lastModified)
                .append("attachments", attachments)
                .append("locale", locale)
                .toString();
    }

    public static EditEntryDataModelBuilder getExtendedBuilder() {
        return new EditEntryDataModelBuilder();
    }

    public static final class EditEntryDataModelBuilder {
        private long id;
        private String title;
        private String link;
        private String prologue;
        private UserDataModel user;
        private List<TagDataModel> tags;
        private CategoryDataModel category;
        private String created;
        private String lastModified;
        private List<FileDataModel> attachments;
        private String rawContent;
        private boolean enabled;
        private String entryStatus;
        private String locale;

        private EditEntryDataModelBuilder() {
        }

        public EditEntryDataModelBuilder withRawContent(String rawContent) {
            this.rawContent = rawContent;
            return this;
        }

        public EditEntryDataModelBuilder withEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public EditEntryDataModelBuilder withEntryStatus(String entryStatus) {
            this.entryStatus = entryStatus;
            return this;
        }

        public EditEntryDataModelBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public EditEntryDataModelBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public EditEntryDataModelBuilder withLink(String link) {
            this.link = link;
            return this;
        }

        public EditEntryDataModelBuilder withPrologue(String prologue) {
            this.prologue = prologue;
            return this;
        }

        public EditEntryDataModelBuilder withUser(UserDataModel user) {
            this.user = user;
            return this;
        }

        public EditEntryDataModelBuilder withTags(List<TagDataModel> tags) {
            this.tags = tags;
            return this;
        }

        public EditEntryDataModelBuilder withCategory(CategoryDataModel category) {
            this.category = category;
            return this;
        }

        public EditEntryDataModelBuilder withCreated(String created) {
            this.created = created;
            return this;
        }

        public EditEntryDataModelBuilder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public EditEntryDataModelBuilder withAttachments(List<FileDataModel> attachments) {
            this.attachments = attachments;
            return this;
        }

        public EditEntryDataModelBuilder withLocale(String locale) {
            this.locale = locale;
            return this;
        }

        public EditEntryDataModel build() {
            EditEntryDataModel editEntryDataModel = new EditEntryDataModel();
            editEntryDataModel.link = this.link;
            editEntryDataModel.enabled = this.enabled;
            editEntryDataModel.prologue = this.prologue;
            editEntryDataModel.lastModified = this.lastModified;
            editEntryDataModel.rawContent = this.rawContent;
            editEntryDataModel.id = this.id;
            editEntryDataModel.user = this.user;
            editEntryDataModel.category = this.category;
            editEntryDataModel.title = this.title;
            editEntryDataModel.created = this.created;
            editEntryDataModel.attachments = this.attachments;
            editEntryDataModel.entryStatus = this.entryStatus;
            editEntryDataModel.tags = this.tags;
            editEntryDataModel.locale = this.locale;
            return editEntryDataModel;
        }
    }
}
