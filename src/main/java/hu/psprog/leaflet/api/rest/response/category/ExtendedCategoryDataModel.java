package hu.psprog.leaflet.api.rest.response.category;

/**
 * Extended response model for categories.
 *
 * @author Peter Smith
 */
public class ExtendedCategoryDataModel extends CategoryDataModel {

    private static final String DESCRIPTION = "description";
    private static final String CREATED = "created";
    private static final String LAST_MODIFIED = "lastModified";

    private ExtendedCategoryDataModel() {
        // prevent direct initialization
    }

    public static class Builder extends CategoryDataModel.Builder {

        public Builder withDescription(String description) {
            categoryDataModel.addSingleNode(DESCRIPTION, description);
            return this;
        }

        public Builder withCreated(String created) {
            categoryDataModel.addSingleNode(CREATED, created);
            return this;
        }

        public Builder withLastModified(String lastModified) {
            categoryDataModel.addSingleNode(LAST_MODIFIED, lastModified);
            return this;
        }
    }
}
