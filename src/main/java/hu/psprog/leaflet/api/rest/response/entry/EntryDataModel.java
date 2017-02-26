package hu.psprog.leaflet.api.rest.response.entry;

import hu.psprog.leaflet.api.rest.response.category.CategoryDataModel;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import hu.psprog.leaflet.api.rest.response.tag.TagDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;

import java.util.List;

/**
 * Response data model for entries.
 *
 * @author Peter Smith
 */
public class EntryDataModel extends BaseBodyDataModel {

    long id;
    String title;
    String link;
    String prologue;
    UserDataModel user;
    List<TagDataModel> tags;
    CategoryDataModel category;
    String created;
    String lastModified;

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setPrologue(String prologue) {
        this.prologue = prologue;
    }

    public void setUser(UserDataModel user) {
        this.user = user;
    }

    public void setTags(List<TagDataModel> tags) {
        this.tags = tags;
    }

    public void setCategory(CategoryDataModel category) {
        this.category = category;
    }

    public void setCreated(String created) {
        this.created = created;
    }

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

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
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

        public Builder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public EntryDataModel build() {
            EntryDataModel entryDataModel = new EntryDataModel();
            entryDataModel.prologue = this.prologue;
            entryDataModel.id = this.id;
            entryDataModel.created = this.created;
            entryDataModel.lastModified = this.lastModified;
            entryDataModel.title = this.title;
            entryDataModel.tags = this.tags;
            entryDataModel.link = this.link;
            entryDataModel.category = this.category;
            entryDataModel.user = this.user;
            return entryDataModel;
        }
    }
}
