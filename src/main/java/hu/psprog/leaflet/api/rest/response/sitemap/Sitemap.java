package hu.psprog.leaflet.api.rest.response.sitemap;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

/**
 * Sitemap model.
 * Compatible with Google search engine.
 * Generated model structure will be:
 * <urlset>
 * <url>
 * <loc>absolute URL</loc>
 * </url>
 * <url>
 * <loc>absolute URL</loc>
 * </url>
 * ...
 * <url>
 * <loc>absolute URL</loc>
 * </url>
 * </urlset>
 *
 * @author Peter Smith
 * @see SitemapLocationItem
 */
@JacksonXmlRootElement(localName = "urlset", namespace = Sitemap.SITEMAP_XML_NAMESPACE)
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record Sitemap(
        @JacksonXmlElementWrapper(useWrapping = false)
        @JacksonXmlProperty(localName = "url", namespace = SITEMAP_XML_NAMESPACE)
        List<SitemapLocationItem> sitemapLocationItemList
) implements BaseBodyDataModel {

    static final String SITEMAP_XML_NAMESPACE = "http://www.sitemaps.org/schemas/sitemap/0.9";
}
