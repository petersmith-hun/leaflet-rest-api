package hu.psprog.leaflet.api.rest.response.user;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

/**
 * Response model for a user.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record UserDataModel(
        long id,
        String username
) implements BaseBodyDataModel { }
