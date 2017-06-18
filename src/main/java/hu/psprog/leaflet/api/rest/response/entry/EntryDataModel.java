package hu.psprog.leaflet.api.rest.response.entry;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.category.CategoryDataModel;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import hu.psprog.leaflet.api.rest.response.file.FileDataModel;
import hu.psprog.leaflet.api.rest.response.tag.TagDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Response data model for entries.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = EntryDataModel.EntryDataModelBuilder.class)
public class EntryDataModel extends BaseBodyDataModel {

    protected long id;
    protected String title;
    protected String link;
    protected String prologue;
    protected UserDataModel user;
    protected List<TagDataModel> tags;
    protected CategoryDataModel category;
    protected String created;
    protected String lastModified;
    protected List<FileDataModel> attachments;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getPrologue() {
        return prologue;
    }

    public UserDataModel getUser() {
        return user;
    }

    public List<TagDataModel> getTags() {
        return tags;
    }

    public CategoryDataModel getCategory() {
        return category;
    }

    public String getCreated() {
        return created;
    }

    public String getLastModified() {
        return lastModified;
    }

    public List<FileDataModel> getAttachments() {
        return attachments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof EntryDataModel)) return false;

        EntryDataModel that = (EntryDataModel) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(title, that.title)
                .append(link, that.link)
                .append(prologue, that.prologue)
                .append(user, that.user)
                .append(tags, that.tags)
                .append(category, that.category)
                .append(created, that.created)
                .append(lastModified, that.lastModified)
                .append(attachments, that.attachments)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(title)
                .append(link)
                .append(prologue)
                .append(user)
                .append(tags)
                .append(category)
                .append(created)
                .append(lastModified)
                .append(attachments)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
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

    public static EntryDataModelBuilder getBuilder() {
        return new EntryDataModelBuilder();
    }

    public static final class EntryDataModelBuilder {
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

        private EntryDataModelBuilder() {
        }

        public EntryDataModelBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public EntryDataModelBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public EntryDataModelBuilder withLink(String link) {
            this.link = link;
            return this;
        }

        public EntryDataModelBuilder withPrologue(String prologue) {
            this.prologue = prologue;
            return this;
        }

        public EntryDataModelBuilder withUser(UserDataModel user) {
            this.user = user;
            return this;
        }

        public EntryDataModelBuilder withTags(List<TagDataModel> tags) {
            this.tags = tags;
            return this;
        }

        public EntryDataModelBuilder withCategory(CategoryDataModel category) {
            this.category = category;
            return this;
        }

        public EntryDataModelBuilder withCreated(String created) {
            this.created = created;
            return this;
        }

        public EntryDataModelBuilder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public EntryDataModelBuilder withAttachments(List<FileDataModel> attachments) {
            this.attachments = attachments;
            return this;
        }

        public EntryDataModel build() {
            EntryDataModel entryDataModel = new EntryDataModel();
            entryDataModel.link = this.link;
            entryDataModel.user = this.user;
            entryDataModel.prologue = this.prologue;
            entryDataModel.lastModified = this.lastModified;
            entryDataModel.category = this.category;
            entryDataModel.title = this.title;
            entryDataModel.created = this.created;
            entryDataModel.attachments = this.attachments;
            entryDataModel.id = this.id;
            entryDataModel.tags = this.tags;
            return entryDataModel;
        }
    }
}
