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
 * Extended response data model for entries.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = ExtendedEntryDataModel.ExtendedEntryDataModelBuilder.class)
public class ExtendedEntryDataModel extends EntryDataModel {

    private String content;

    public String getContent() {
        return content;
    }

    @Override
    public String getLastModified() {
        return lastModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof ExtendedEntryDataModel)) return false;

        ExtendedEntryDataModel that = (ExtendedEntryDataModel) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(content, that.content)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(content)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("content", content)
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
                .toString();
    }

    public static ExtendedEntryDataModelBuilder getExtendedBuilder() {
        return new ExtendedEntryDataModelBuilder();
    }

    public static final class ExtendedEntryDataModelBuilder {
        private long id;
        private String title;
        private String link;
        private String prologue;
        private UserDataModel user;
        private List<TagDataModel> tags;
        private CategoryDataModel category;
        private String created;
        private List<FileDataModel> attachments;
        private String content;
        private String lastModified;

        private ExtendedEntryDataModelBuilder() {
        }

        public ExtendedEntryDataModelBuilder withContent(String content) {
            this.content = content;
            return this;
        }

        public ExtendedEntryDataModelBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public ExtendedEntryDataModelBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public ExtendedEntryDataModelBuilder withLink(String link) {
            this.link = link;
            return this;
        }

        public ExtendedEntryDataModelBuilder withPrologue(String prologue) {
            this.prologue = prologue;
            return this;
        }

        public ExtendedEntryDataModelBuilder withUser(UserDataModel user) {
            this.user = user;
            return this;
        }

        public ExtendedEntryDataModelBuilder withTags(List<TagDataModel> tags) {
            this.tags = tags;
            return this;
        }

        public ExtendedEntryDataModelBuilder withCategory(CategoryDataModel category) {
            this.category = category;
            return this;
        }

        public ExtendedEntryDataModelBuilder withCreated(String created) {
            this.created = created;
            return this;
        }

        public ExtendedEntryDataModelBuilder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public ExtendedEntryDataModelBuilder withAttachments(List<FileDataModel> attachments) {
            this.attachments = attachments;
            return this;
        }

        public ExtendedEntryDataModel build() {
            ExtendedEntryDataModel extendedEntryDataModel = new ExtendedEntryDataModel();
            extendedEntryDataModel.link = this.link;
            extendedEntryDataModel.prologue = this.prologue;
            extendedEntryDataModel.lastModified = this.lastModified;
            extendedEntryDataModel.content = this.content;
            extendedEntryDataModel.id = this.id;
            extendedEntryDataModel.user = this.user;
            extendedEntryDataModel.category = this.category;
            extendedEntryDataModel.title = this.title;
            extendedEntryDataModel.created = this.created;
            extendedEntryDataModel.attachments = this.attachments;
            extendedEntryDataModel.tags = this.tags;
            return extendedEntryDataModel;
        }
    }
}
