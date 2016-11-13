package hu.psprog.leaflet.api.rest.request.entry;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Request model for creating new entries.
 *
 * @author Peter Smith
 */
public class EntryCreateRequestModel extends EntryUpdateRequestModel {

    @NotNull
    @Min(1)
    private Long userID;

    @NotNull
    private EntryInitialStatus status;

    public EntryCreateRequestModel() {
        // Serializable
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public EntryInitialStatus getStatus() {
        return status;
    }

    public void setStatus(EntryInitialStatus status) {
        this.status = status;
    }
}
