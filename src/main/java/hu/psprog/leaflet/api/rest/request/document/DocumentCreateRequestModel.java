package hu.psprog.leaflet.api.rest.request.document;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Request model for creating new documents.
 *
 * @author Peter Smith
 */
public class DocumentCreateRequestModel extends DocumentUpdateRequestModel {

    @NotNull
    @Min(1)
    private Long userID;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("userID", userID)
                .append("metaTitle", getMetaTitle())
                .append("metaDescription", getMetaDescription())
                .append("metaKeywords", getMetaKeywords())
                .append("title", getTitle())
                .append("link", getLink())
                .append("content", getContent())
                .append("rawContent", getRawContent())
                .append("locale", getLocale())
                .append("enabled", isEnabled())
                .toString();
    }
}
