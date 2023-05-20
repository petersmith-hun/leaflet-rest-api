package hu.psprog.leaflet.api.rest.response.common;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

/**
 * Wrapper model for validation error messages.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record ValidationErrorMessageDataModel(
        String field,
        String message
) implements BaseBodyDataModel { }
