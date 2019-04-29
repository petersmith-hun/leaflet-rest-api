package hu.psprog.leaflet.api.rest.response.sitemap;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import static hu.psprog.leaflet.api.rest.response.sitemap.Sitemap.SITEMAP_XML_NAMESPACE;

/**
 * Sitemap location item model.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = SitemapLocationItem.SitemapLocationItemBuilder.class)
public class SitemapLocationItem {

    @JacksonXmlProperty(localName = "loc", namespace = SITEMAP_XML_NAMESPACE)
    @JsonProperty("location")
    private String location;

    @JsonCreator
    public SitemapLocationItem(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        SitemapLocationItem that = (SitemapLocationItem) o;

        return new EqualsBuilder()
                .append(location, that.location)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(location)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("location", location)
                .toString();
    }

    public static SitemapLocationItemBuilder getBuilder() {
        return new SitemapLocationItemBuilder();
    }

    /**
     * Builder for {@link SitemapLocationItem}.
     */
    public static final class SitemapLocationItemBuilder {
        private String location;

        private SitemapLocationItemBuilder() {
        }

        public SitemapLocationItemBuilder withLocation(String location) {
            this.location = location;
            return this;
        }

        public SitemapLocationItem build() {
            return new SitemapLocationItem(location);
        }
    }
}
