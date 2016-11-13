package hu.psprog.leaflet.api.rest.request.common;

import java.io.Serializable;

/**
 * Common model for models containing custom SEO parameters.
 *
 * @author Peter Smith
 */
public class SEOValuesRequestModel implements Serializable {

    private String metaTitle;
    private String metaDescription;
    private String metaKeywords;

    public SEOValuesRequestModel() {
        // Serializable
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }
}
