package hu.psprog.leaflet.api.rest.request.comment;

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
public class CommentCreateRequestModel extends CommentUpdateRequestModel {

    @NotNull
    @Min(1)
    private Long entryId;

}
