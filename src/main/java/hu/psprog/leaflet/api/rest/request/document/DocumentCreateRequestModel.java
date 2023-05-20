package hu.psprog.leaflet.api.rest.request.document;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Request model for creating new documents.
 *
 * @author Peter Smith
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DocumentCreateRequestModel extends DocumentUpdateRequestModel {

    @NotNull
    @Min(1)
    private Long userID;

}
