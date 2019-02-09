package hu.psprog.leaflet.api.rest.response.category;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.ZonedDateTime;

/**
 * Response model for categories.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = CategoryDataModel.CategoryDataModelBuilder.class)
public class CategoryDataModel extends BaseBodyDataModel {

    private long id;
    private String title;
    private String description;
    private ZonedDateTime created;
    private ZonedDateTime lastModified;
    private boolean enabled;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public ZonedDateTime getCreated() {
        return created;
    }

    public ZonedDateTime getLastModified() {
        return lastModified;
    }

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        CategoryDataModel that = (CategoryDataModel) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(enabled, that.enabled)
                .append(title, that.title)
                .append(description, that.description)
                .append(created, that.created)
                .append(lastModified, that.lastModified)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(title)
                .append(description)
                .append(created)
                .append(lastModified)
                .append(enabled)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("title", title)
                .append("description", description)
                .append("created", created)
                .append("lastModified", lastModified)
                .append("enabled", enabled)
                .toString();
    }

    public static CategoryDataModelBuilder getBuilder() {
        return new CategoryDataModelBuilder();
    }

    /**
     * Builder for {@link CategoryDataModel}.
     */
    public static final class CategoryDataModelBuilder {
        private long id;
        private String title;
        private String description;
        private ZonedDateTime created;
        private ZonedDateTime lastModified;
        private boolean enabled;

        private CategoryDataModelBuilder() {
        }

        public CategoryDataModelBuilder withID(long id) {
            this.id = id;
            return this;
        }

        public CategoryDataModelBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public CategoryDataModelBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public CategoryDataModelBuilder withCreated(ZonedDateTime created) {
            this.created = created;
            return this;
        }

        public CategoryDataModelBuilder withLastModified(ZonedDateTime lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public CategoryDataModelBuilder withEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public CategoryDataModel build() {
            CategoryDataModel categoryDataModel = new CategoryDataModel();
            categoryDataModel.lastModified = this.lastModified;
            categoryDataModel.enabled = this.enabled;
            categoryDataModel.description = this.description;
            categoryDataModel.title = this.title;
            categoryDataModel.id = this.id;
            categoryDataModel.created = this.created;
            return categoryDataModel;
        }
    }
}
