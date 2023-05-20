package hu.psprog.leaflet.api.rest.request.attachment;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

/**
 * Request model for attachment operations.
 *
 * @author Peter Smith
 */
@Data
public class AttachmentRequestModel implements Serializable {

    @NotNull
    @Min(1)
    private Long entryID;

    @NotNull
    private UUID pathUUID;

}
