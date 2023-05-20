package hu.psprog.leaflet.api.rest.request.comment;

import hu.psprog.leaflet.api.rest.request.common.AuthenticatedRequestModel;
import hu.psprog.leaflet.api.rest.request.validator.CommentUserDataCheck;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Request model for creating a new comment.
 *
 * @author Peter Smith
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@CommentUserDataCheck
public class CommentCreateRequestModel extends CommentUpdateRequestModel implements AuthenticatedRequestModel {

    private Long authenticatedUserId;
    private String email;
    private String username;

    @NotNull
    @Min(1)
    private Long entryId;

}
