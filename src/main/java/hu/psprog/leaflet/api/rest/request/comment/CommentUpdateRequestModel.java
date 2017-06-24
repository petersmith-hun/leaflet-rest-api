package hu.psprog.leaflet.api.rest.request.comment;

import org.apache.commons.lang3.builder.ToStringBuilder;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("content", content)
                .toString();
    }
}
