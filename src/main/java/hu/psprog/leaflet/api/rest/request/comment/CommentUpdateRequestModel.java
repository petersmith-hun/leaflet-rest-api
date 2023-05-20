package hu.psprog.leaflet.api.rest.request.comment;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * Request model for updating az existing comment.
 *
 * @author Peter Smith
 */
@Data
public class CommentUpdateRequestModel implements Serializable {

    @NotNull
    @Size(max = 2000)
    private String content;

}
