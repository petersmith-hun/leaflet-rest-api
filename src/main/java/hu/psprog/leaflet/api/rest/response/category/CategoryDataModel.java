package hu.psprog.leaflet.api.rest.response.category;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

/**
 * Response model for categories.
 *
 * @author Peter Smith
 */
public class CategoryDataModel extends BaseBodyDataModel {

    private static final String ID = "id";
    private static final String TITLE = "title";

    protected CategoryDataModel() {
        // prevent direct initialization
    }

    public static class Builder {

        protected CategoryDataModel categoryDataModel;

        public Builder() {
            categoryDataModel = new CategoryDataModel();
        }

        public Builder withID(Long id) {
            categoryDataModel.addSingleNode(ID, id);
            return this;
        }

        public Builder withTitle(String title) {
            categoryDataModel.addSingleNode(TITLE, title);
            return this;
        }

        public CategoryDataModel build() {
            return categoryDataModel;
        }
    }
}
