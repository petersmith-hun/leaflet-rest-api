package hu.psprog.leaflet.api.rest.response.sitemap;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import static hu.psprog.leaflet.api.rest.response.sitemap.Sitemap.SITEMAP_XML_NAMESPACE;

/**
 * Sitemap location item model.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record SitemapLocationItem(
        @JacksonXmlProperty(localName = "loc", namespace = SITEMAP_XML_NAMESPACE)
        @JsonProperty("location")
        String location
) { }
