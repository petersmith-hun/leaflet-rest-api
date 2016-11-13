package hu.psprog.leaflet.api.rest.response.common;

/**
 * Response model for SEO parameters.
 *
 * @author Peter Smith
 */
public class SEODataModel extends BaseBodyDataModel {

    private static final String PAGE_TITLE = "pageTitle";
    private static final String META_TITLE = "metaTitle";
    private static final String META_DESCRIPTION = "metaDescription";
    private static final String META_KEYWORDS = "metaKeywords";

    private SEODataModel() {
        // prevent direct initialization
    }

    public static class Builder {

        private SEODataModel seoDataModel;

        public Builder() {
            seoDataModel = new SEODataModel();
        }

        public Builder withPageTitle(String pageTitle) {
            seoDataModel.addSingleNode(PAGE_TITLE, pageTitle);
            return this;
        }

        public Builder withMetaTitle(String metaTitle) {
            seoDataModel.addSingleNode(META_TITLE, metaTitle);
            return this;
        }

        public Builder withMetaDescription(String metaDescription) {
            seoDataModel.addSingleNode(META_DESCRIPTION, metaDescription);
            return this;
        }

        public Builder withMetaKeywords(String metaKeywords) {
            seoDataModel.addSingleNode(META_KEYWORDS, metaKeywords);
            return this;
        }

        public SEODataModel build() {
            return seoDataModel;
        }
    }
}
