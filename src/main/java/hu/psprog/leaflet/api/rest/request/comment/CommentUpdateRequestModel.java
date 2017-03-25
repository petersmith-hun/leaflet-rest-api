package hu.psprog.leaflet.api.rest.request.comment;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Request model for updating az existing comment.
 *
 * @author Peter Smith
 */
public class CommentUpdateRequestModel implements Serializable {

    @NotNull
    @Size(max = 2000)
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
