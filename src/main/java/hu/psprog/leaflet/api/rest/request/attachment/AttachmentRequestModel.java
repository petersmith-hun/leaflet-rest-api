package hu.psprog.leaflet.api.rest.request.attachment;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;

/**
 * Request model for attachment operations.
 *
 * @author Peter Smith
 */
public class AttachmentRequestModel implements Serializable {

    @NotNull
    @Min(1)
    private Long entryID;

    @NotNull
    private UUID pathUUID;

    public Long getEntryID() {
        return entryID;
    }

    public void setEntryID(Long entryID) {
        this.entryID = entryID;
    }

    public UUID getPathUUID() {
        return pathUUID;
    }

    public void setPathUUID(UUID pathUUID) {
        this.pathUUID = pathUUID;
    }
}
