package hu.psprog.leaflet.api.rest.request.document;

import hu.psprog.leaflet.api.rest.request.common.SEOValuesRequestModel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Locale;

/**
 * Request model for editing an existing document.
 *
 * @author Peter Smith
 */
public class DocumentUpdateRequestModel extends SEOValuesRequestModel {

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String title;

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String link;

    @NotNull
    @NotEmpty
    private String content;

    @NotNull
    @NotEmpty
    private String rawContent;

    @NotNull
    private Locale locale;

    @NotNull
    private boolean enabled;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRawContent() {
        return rawContent;
    }

    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("metaTitle", getMetaTitle())
                .append("title", title)
                .append("metaDescription", getMetaDescription())
                .append("link", link)
                .append("content", content)
                .append("rawContent", rawContent)
                .append("locale", locale)
                .append("metaKeywords", getMetaKeywords())
                .append("enabled", enabled)
                .toString();
    }
}
