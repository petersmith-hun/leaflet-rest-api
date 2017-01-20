package hu.psprog.leaflet.api.rest.response.category;

/**
 * Extended response model for categories.
 *
 * @author Peter Smith
 */
public class ExtendedCategoryDataModel extends CategoryDataModel {

    private String description;
    private String created;
    private String lastModified;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getDescription() {
        return description;
    }

    public String getCreated() {
        return created;
    }

    public String getLastModified() {
        return lastModified;
    }

    public static final class Builder {
        private long id;
        private String title;
        private String description;
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

        public Builder withDescription(String description) {
            this.description = description;
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

        public ExtendedCategoryDataModel build() {
            ExtendedCategoryDataModel categoryDataModel = new ExtendedCategoryDataModel();
            categoryDataModel.title = this.title;
            categoryDataModel.id = this.id;
            categoryDataModel.description = this.description;
            categoryDataModel.created = this.created;
            categoryDataModel.lastModified = this.lastModified;
            return categoryDataModel;
        }
    }
}
