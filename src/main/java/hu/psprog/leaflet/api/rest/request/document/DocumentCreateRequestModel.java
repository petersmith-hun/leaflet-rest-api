package hu.psprog.leaflet.api.rest.request.document;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Request model for creating new documents.
 *
 * @author Peter Smith
 */
public class DocumentCreateRequestModel extends DocumentUpdateRequestModel {

    @NotNull
    @Min(1)
    private Long userID;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }
}
