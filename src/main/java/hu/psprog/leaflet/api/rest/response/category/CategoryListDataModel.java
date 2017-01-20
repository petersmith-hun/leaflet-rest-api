package hu.psprog.leaflet.api.rest.response.category;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

import java.util.LinkedList;
import java.util.List;

/**
 * Response model for list of categories.
 *
 * @author Peter Smith
 */
public class CategoryListDataModel extends BaseBodyDataModel {

    private List<CategoryDataModel> categories;

    public List<CategoryDataModel> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryDataModel> categories) {
        this.categories = categories;
    }

    public static final class Builder {
        private List<CategoryDataModel> categories;

        public Builder() {
            categories = new LinkedList<>();
        }

        public Builder withItem(CategoryDataModel category) {
            this.categories.add(category);
            return this;
        }

        public CategoryListDataModel build() {
            CategoryListDataModel categoryListDataModel = new CategoryListDataModel();
            categoryListDataModel.setCategories(categories);
            return categoryListDataModel;
        }
    }
}
