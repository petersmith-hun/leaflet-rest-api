package hu.psprog.leaflet.api.rest.response.routing;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

/**
 * Response data model for extended front-end route information.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record ExtendedFrontEndRouteDataModel(
        String routeId,
        String name,
        String url,
        String authRequirement,
        long id,
        int sequenceNumber,
        String type,
        ZonedDateTime created,
        ZonedDateTime lastModified,
        boolean enabled
) implements BaseBodyDataModel { }
