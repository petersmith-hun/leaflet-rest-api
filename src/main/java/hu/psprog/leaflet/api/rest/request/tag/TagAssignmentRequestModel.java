package hu.psprog.leaflet.api.rest.request.tag;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

/**
 * Request model to assign a tag to an entry.
 *
 * @author Peter Smith
 */
@Data
public class TagAssignmentRequestModel implements Serializable {

    @NotNull
    @Min(1)
    private Long entryID;

    @NotNull
    @Min(1)
    private Long tagID;

}
