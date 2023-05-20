package hu.psprog.leaflet.api.rest.response.file;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

/**
 * Response data model for uploaded file meta records.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record FileDataModel(
        String originalFilename,
        String reference,
        String acceptedAs,
        String description,
        String path
) implements BaseBodyDataModel { }
