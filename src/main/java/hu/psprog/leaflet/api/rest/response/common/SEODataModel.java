package hu.psprog.leaflet.api.rest.response.common;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

/**
 * Response model for SEO parameters.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record SEODataModel(
        String pageTitle,
        String metaTitle,
        String metaDescription,
        String metaKeywords
) implements BaseBodyDataModel { }
