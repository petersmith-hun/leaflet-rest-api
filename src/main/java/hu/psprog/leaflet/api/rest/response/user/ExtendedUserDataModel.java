package hu.psprog.leaflet.api.rest.response.user;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

/**
 * Extended user details data response model.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record ExtendedUserDataModel(
        long id,
        String username,
        String email,
        String role,
        String locale,
        ZonedDateTime created,
        ZonedDateTime lastLogin,
        ZonedDateTime lastModified
) implements BaseBodyDataModel { }
