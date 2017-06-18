package hu.psprog.leaflet.api.rest.request.tag;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Request model to assign a tag to an entry.
 *
 * @author Peter Smith
 */
public class TagAssignmentRequestModel implements Serializable {

    @NotNull
    @Min(1)
    private Long entryID;

    @NotNull
    @Min(1)
    private Long tagID;

    public Long getEntryID() {
        return entryID;
    }

    public void setEntryID(Long entryID) {
        this.entryID = entryID;
    }

    public Long getTagID() {
        return tagID;
    }

    public void setTagID(Long tagID) {
        this.tagID = tagID;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("entryID", entryID)
                .append("tagID", tagID)
                .toString();
    }
}
