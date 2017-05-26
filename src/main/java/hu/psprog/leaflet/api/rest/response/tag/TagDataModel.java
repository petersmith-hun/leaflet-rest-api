package hu.psprog.leaflet.api.rest.response.tag;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

/**
 * Response data model for tags.
 *
 * @author Peter Smith
 */
public class TagDataModel extends BaseBodyDataModel {

    private long id;
    private String name;
    private String created;
    private String lastModified;
    private boolean isEnabled;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }


    public static final class Builder {
        private long id;
        private String name;
        private String created;
        private String lastModified;
        private boolean isEnabled;

        private Builder() {
        }

        public static Builder getBuilder() {
            return new Builder();
        }

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
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

        public Builder withIsEnabled(boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public TagDataModel build() {
            TagDataModel tagDataModel = new TagDataModel();
            tagDataModel.setId(id);
            tagDataModel.setName(name);
            tagDataModel.setCreated(created);
            tagDataModel.setLastModified(lastModified);
            tagDataModel.isEnabled = this.isEnabled;
            return tagDataModel;
        }
    }
}
