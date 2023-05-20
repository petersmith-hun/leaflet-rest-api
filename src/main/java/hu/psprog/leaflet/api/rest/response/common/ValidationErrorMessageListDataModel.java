package hu.psprog.leaflet.api.rest.response.common;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

/**
 * Wrapper model for list of validation error messages.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record ValidationErrorMessageListDataModel(
        List<ValidationErrorMessageDataModel> validation
) implements BaseBodyDataModel { }
