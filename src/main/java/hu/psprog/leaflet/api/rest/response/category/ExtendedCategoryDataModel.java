package hu.psprog.leaflet.api.rest.response.category;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Extended response model for categories.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = ExtendedCategoryDataModel.ExtendedCategoryDataModelBuilder.class)
public class ExtendedCategoryDataModel extends CategoryDataModel {

    private String description;
    private String created;
    private String lastModified;
    private boolean enabled;

    public String getDescription() {
        return description;
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

        if (!(o instanceof ExtendedCategoryDataModel)) return false;

        ExtendedCategoryDataModel that = (ExtendedCategoryDataModel) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(description, that.description)
                .append(created, that.created)
                .append(lastModified, that.lastModified)
                .append(enabled, that.enabled)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
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
                .append("id", getId())
                .append("description", description)
                .append("created", created)
                .append("title", getTitle())
                .append("lastModified", lastModified)
                .append("enabled", enabled)
                .toString();
    }

    public static ExtendedCategoryDataModelBuilder getExtendedBuilder() {
        return new ExtendedCategoryDataModelBuilder();
    }

    /**
     * Builder for {@link ExtendedCategoryDataModel}.
     */
    public static final class ExtendedCategoryDataModelBuilder {
        private long id;
        private String title;
        private String description;
        private String created;
        private String lastModified;
        private boolean enabled;

        private ExtendedCategoryDataModelBuilder() {
        }

        public ExtendedCategoryDataModelBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public ExtendedCategoryDataModelBuilder withCreated(String created) {
            this.created = created;
            return this;
        }

        public ExtendedCategoryDataModelBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public ExtendedCategoryDataModelBuilder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public ExtendedCategoryDataModelBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public ExtendedCategoryDataModelBuilder withEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public ExtendedCategoryDataModel build() {
            ExtendedCategoryDataModel extendedCategoryDataModel = new ExtendedCategoryDataModel();
            extendedCategoryDataModel.created = this.created;
            extendedCategoryDataModel.lastModified = this.lastModified;
            extendedCategoryDataModel.description = this.description;
            extendedCategoryDataModel.id = this.id;
            extendedCategoryDataModel.title = this.title;
            extendedCategoryDataModel.enabled = this.enabled;
            return extendedCategoryDataModel;
        }
    }
}
