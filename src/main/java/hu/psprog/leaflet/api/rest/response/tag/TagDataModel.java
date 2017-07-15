package hu.psprog.leaflet.api.rest.response.tag;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response data model for tags.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = TagDataModel.TagDataModelBuilder.class)
public class TagDataModel extends BaseBodyDataModel {

    private long id;
    private String name;
    private String created;
    private String lastModified;
    private boolean enabled;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCreated() {
        return created;
    }

    public String getLastModified() {
        return lastModified;
    }

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof TagDataModel)) return false;

        TagDataModel that = (TagDataModel) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(enabled, that.enabled)
                .append(name, that.name)
                .append(created, that.created)
                .append(lastModified, that.lastModified)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(name)
                .append(created)
                .append(lastModified)
                .append(enabled)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("created", created)
                .append("lastModified", lastModified)
                .append("isEnabled", enabled)
                .toString();
    }

    public static TagDataModelBuilder getBuilder() {
        return new TagDataModelBuilder();
    }

    public static final class TagDataModelBuilder {
        private long id;
        private String name;
        private String created;
        private String lastModified;
        private boolean enabled;

        private TagDataModelBuilder() {
        }

        public TagDataModelBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public TagDataModelBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public TagDataModelBuilder withCreated(String created) {
            this.created = created;
            return this;
        }

        public TagDataModelBuilder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public TagDataModelBuilder withEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public TagDataModel build() {
            TagDataModel tagDataModel = new TagDataModel();
            tagDataModel.id = this.id;
            tagDataModel.enabled = this.enabled;
            tagDataModel.name = this.name;
            tagDataModel.lastModified = this.lastModified;
            tagDataModel.created = this.created;
            return tagDataModel;
        }
    }
}
