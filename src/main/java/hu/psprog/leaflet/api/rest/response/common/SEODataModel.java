package hu.psprog.leaflet.api.rest.response.common;

/**
 * Response model for SEO parameters.
 *
 * @author Peter Smith
 */
public class SEODataModel extends BaseBodyDataModel {

    private String pageTitle;
    private String metaTitle;
    private String metaDescription;
    private String metaKeywords;

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public static final class Builder {
        private String pageTitle;
        private String metaTitle;
        private String metaDescription;
        private String metaKeywords;

        public Builder withPageTitle(String pageTitle) {
            this.pageTitle = pageTitle;
            return this;
        }

        public Builder withMetaTitle(String metaTitle) {
            this.metaTitle = metaTitle;
            return this;
        }

        public Builder withMetaDescription(String metaDescription) {
            this.metaDescription = metaDescription;
            return this;
        }

        public Builder withMetaKeywords(String metaKeywords) {
            this.metaKeywords = metaKeywords;
            return this;
        }

        public SEODataModel build() {
            SEODataModel sEODataModel = new SEODataModel();
            sEODataModel.metaDescription = this.metaDescription;
            sEODataModel.metaTitle = this.metaTitle;
            sEODataModel.metaKeywords = this.metaKeywords;
            sEODataModel.pageTitle = this.pageTitle;
            return sEODataModel;
        }
    }
}
