package hu.psprog.leaflet.api.rest.response.category;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.LinkedList;
import java.util.List;

/**
 * Response model for list of categories.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = CategoryListDataModel.CategoryListDataModelBuilder.class)
public class CategoryListDataModel extends BaseBodyDataModel {

    private List<CategoryDataModel> categories;

    public List<CategoryDataModel> getCategories() {
        return categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof CategoryListDataModel)) return false;

        CategoryListDataModel that = (CategoryListDataModel) o;

        return new EqualsBuilder()
                .append(categories, that.categories)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(categories)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("categories", categories)
                .toString();
    }

    public static CategoryListDataModelBuilder getBuilder() {
        return new CategoryListDataModelBuilder();
    }

    /**
     * Builder for {@link CategoryListDataModel}.
     */
    public static final class CategoryListDataModelBuilder {
        private List<CategoryDataModel> categories;

        private CategoryListDataModelBuilder() {
            categories = new LinkedList<>();
        }

        public CategoryListDataModelBuilder withItem(CategoryDataModel category) {
            this.categories.add(category);
            return this;
        }

        public CategoryListDataModel build() {
            CategoryListDataModel categoryListDataModel = new CategoryListDataModel();
            categoryListDataModel.categories = categories;
            return categoryListDataModel;
        }
    }
}
