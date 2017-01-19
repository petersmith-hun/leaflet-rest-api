package hu.psprog.leaflet.api.rest.response.category;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

/**
 * Response model for categories.
 *
 * @author Peter Smith
 */
public class CategoryDataModel extends BaseBodyDataModel {

    long id;
    String title;

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public static final class Builder {
        private long id;
        private String title;

        public Builder withID(long id) {
            this.id = id;
            return this;
        }

        public Builder withTitle(String title) {
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
