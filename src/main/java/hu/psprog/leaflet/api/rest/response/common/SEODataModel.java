package hu.psprog.leaflet.api.rest.response.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response model for SEO parameters.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = SEODataModel.SEODataModelBuilder.class)
public class SEODataModel extends BaseBodyDataModel {

    private String pageTitle;
    private String metaTitle;
    private String metaDescription;
    private String metaKeywords;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof SEODataModel)) return false;

        SEODataModel that = (SEODataModel) o;

        return new EqualsBuilder()
                .append(pageTitle, that.pageTitle)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(pageTitle)
                .append(metaTitle)
                .append(metaDescription)
                .append(metaKeywords)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("pageTitle", pageTitle)
                .append("metaTitle", metaTitle)
                .append("metaDescription", metaDescription)
                .append("metaKeywords", metaKeywords)
                .toString();
    }

    public static SEODataModelBuilder getBuilder() {
        return new SEODataModelBuilder();
    }

    public static final class SEODataModelBuilder {
        private String pageTitle;
        private String metaTitle;
        private String metaDescription;
        private String metaKeywords;

        private SEODataModelBuilder() {
        }

        public SEODataModelBuilder withPageTitle(String pageTitle) {
            this.pageTitle = pageTitle;
            return this;
        }

        public SEODataModelBuilder withMetaTitle(String metaTitle) {
            this.metaTitle = metaTitle;
            return this;
        }

        public SEODataModelBuilder withMetaDescription(String metaDescription) {
            this.metaDescription = metaDescription;
            return this;
        }

        public SEODataModelBuilder withMetaKeywords(String metaKeywords) {
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
