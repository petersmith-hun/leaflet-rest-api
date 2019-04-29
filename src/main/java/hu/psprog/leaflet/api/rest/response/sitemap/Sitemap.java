package hu.psprog.leaflet.api.rest.response.sitemap;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.LinkedList;
import java.util.List;

/**
 * Sitemap model.
 * Compatible with Google search engine.
 * Generated model structure will be:
 * <urlset>
 *     <url>
 *         <loc>absolute URL</loc>
 *     </url>
 *     <url>
 *         <loc>absolute URL</loc>
 *     </url>
 *     ...
 *     <url>
 *         <loc>absolute URL</loc>
 *     </url>
 * </urlset>
 *
 * @see SitemapLocationItem
 * @author Peter Smith
 */
@JacksonXmlRootElement(localName = "urlset", namespace = Sitemap.SITEMAP_XML_NAMESPACE)
@JsonDeserialize(builder = Sitemap.SitemapBuilder.class)
public class Sitemap extends BaseBodyDataModel {

    static final String SITEMAP_XML_NAMESPACE = "http://www.sitemaps.org/schemas/sitemap/0.9";

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "url", namespace = SITEMAP_XML_NAMESPACE)
    private List<SitemapLocationItem> sitemapLocationItemList;

    public List<SitemapLocationItem> getSitemapLocationItemList() {
        return sitemapLocationItemList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Sitemap sitemap = (Sitemap) o;

        return new EqualsBuilder()
                .append(sitemapLocationItemList, sitemap.sitemapLocationItemList)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(sitemapLocationItemList)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("sitemapLocationItemList", sitemapLocationItemList)
                .toString();
    }

    public static SitemapBuilder getBuilder() {
        return new SitemapBuilder();
    }

    /**
     * Builder for {@link Sitemap}.
     */
    public static class SitemapBuilder {

        private Sitemap sitemap;

        private SitemapBuilder() {
            this.sitemap = new Sitemap();
            this.sitemap.sitemapLocationItemList = new LinkedList<>();
        }

        public SitemapBuilder withLocation(String location) {
            this.sitemap.sitemapLocationItemList.add(new SitemapLocationItem(location));
            return this;
        }

        public SitemapBuilder withSitemapLocationItemList(List<SitemapLocationItem> sitemapLocationItemList) {
            this.sitemap.sitemapLocationItemList = sitemapLocationItemList;
            return this;
        }

        public Sitemap build() {
            return this.sitemap;
        }
    }

}
