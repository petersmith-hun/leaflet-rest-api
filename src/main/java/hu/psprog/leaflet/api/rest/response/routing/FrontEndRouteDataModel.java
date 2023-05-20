package hu.psprog.leaflet.api.rest.response.routing;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

/**
 * Response data model for basic front-end route information.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record FrontEndRouteDataModel(
        String routeId,
        String name,
        String url,
        String authRequirement
) implements BaseBodyDataModel { }
