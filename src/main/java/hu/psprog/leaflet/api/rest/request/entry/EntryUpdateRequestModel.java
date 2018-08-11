package hu.psprog.leaflet.api.rest.request.entry;

import hu.psprog.leaflet.api.rest.request.common.SEOValuesRequestModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Locale;

/**
 * Request model for editing an existing entry.
 *
 * @author Peter Smith
 */
public class EntryUpdateRequestModel extends SEOValuesRequestModel {

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
    private String prologue;

    @NotNull
    @NotEmpty
    private String rawContent;

    @NotNull
    @Min(1)
    private Long categoryID;

    @NotNull
    private Locale locale;

    @NotNull
    private boolean enabled;

    @NotNull
    private EntryInitialStatus status;

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

    public String getPrologue() {
        return prologue;
    }

    public void setPrologue(String prologue) {
        this.prologue = prologue;
    }

    public String getRawContent() {
        return rawContent;
    }

    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
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

    public EntryInitialStatus getStatus() {
        return status;
    }

    public void setStatus(EntryInitialStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        EntryUpdateRequestModel that = (EntryUpdateRequestModel) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(enabled, that.enabled)
                .append(title, that.title)
                .append(link, that.link)
                .append(prologue, that.prologue)
                .append(rawContent, that.rawContent)
                .append(categoryID, that.categoryID)
                .append(locale, that.locale)
                .append(status, that.status)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(title)
                .append(link)
                .append(prologue)
                .append(rawContent)
                .append(categoryID)
                .append(locale)
                .append(enabled)
                .append(status)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("metaTitle", getMetaTitle())
                .append("title", title)
                .append("metaDescription", getMetaDescription())
                .append("link", link)
                .append("prologue", prologue)
                .append("metaKeywords", getMetaKeywords())
                .append("rawContent", rawContent)
                .append("categoryID", categoryID)
                .append("locale", locale)
                .append("enabled", enabled)
                .append("status", status)
                .toString();
    }
}
