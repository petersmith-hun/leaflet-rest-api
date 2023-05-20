package hu.psprog.leaflet.api.rest.request.entry;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Request model for creating new entries.
 *
 * @author Peter Smith
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class EntryCreateRequestModel extends EntryUpdateRequestModel {

    @NotNull
    @Min(1)
    private Long userID;

}
