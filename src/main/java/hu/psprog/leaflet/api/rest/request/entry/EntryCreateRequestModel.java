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

    public EntryCreateRequestModel() {
        // Serializable
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }
}
