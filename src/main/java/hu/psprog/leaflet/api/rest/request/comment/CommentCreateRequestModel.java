package hu.psprog.leaflet.api.rest.request.comment;

import hu.psprog.leaflet.api.rest.request.common.AuthenticatedRequestModel;
import hu.psprog.leaflet.api.rest.request.validator.CommentUserDataCheck;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Request model for creating a new comment.
 *
 * @author Peter Smith
 */
@CommentUserDataCheck
public class CommentCreateRequestModel extends CommentUpdateRequestModel implements AuthenticatedRequestModel {

    private Long authenticatedUserId;
    private String email;
    private String username;

    @NotNull
    @Min(1)
    private Long entryId;

    @Override
    public Long getAuthenticatedUserId() {
        return authenticatedUserId;
    }

    public void setAuthenticatedUserId(Long authenticatedUserId) {
        this.authenticatedUserId = authenticatedUserId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getEntryId() {
        return entryId;
    }

    public void setEntryId(Long entryId) {
        this.entryId = entryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        CommentCreateRequestModel that = (CommentCreateRequestModel) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(authenticatedUserId, that.authenticatedUserId)
                .append(email, that.email)
                .append(username, that.username)
                .append(entryId, that.entryId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(authenticatedUserId)
                .append(email)
                .append(username)
                .append(entryId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("content", getContent())
                .append("authenticatedUserId", authenticatedUserId)
                .append("email", email)
                .append("username", username)
                .append("entryId", entryId)
                .toString();
    }
}
