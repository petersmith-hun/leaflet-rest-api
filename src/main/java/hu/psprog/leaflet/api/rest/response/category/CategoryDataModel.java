package hu.psprog.leaflet.api.rest.response.category;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response model for categories.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = CategoryDataModel.CategoryDataModelBuilder.class)
public class CategoryDataModel extends BaseBodyDataModel {

    protected long id;
    protected String title;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof CategoryDataModel)) return false;

        CategoryDataModel that = (CategoryDataModel) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(title, that.title)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(title)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("title", title)
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

        public CategoryDataModel build() {
            CategoryDataModel categoryDataModel = new CategoryDataModel();
            categoryDataModel.title = this.title;
            categoryDataModel.id = this.id;
            return categoryDataModel;
        }
    }
}
