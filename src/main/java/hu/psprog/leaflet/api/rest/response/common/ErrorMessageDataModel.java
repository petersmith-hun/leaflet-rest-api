package hu.psprog.leaflet.api.rest.response.common;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

/**
 * Wrapper model for error messages.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record ErrorMessageDataModel(
        String message
) implements BaseBodyDataModel { }
