package hu.psprog.leaflet.api.rest.response.routing;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

/**
 * Response data model for list of front-end route items containing basic information.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record ExtendedFrontEndRouteListDataModel(
        List<ExtendedFrontEndRouteDataModel> routes
) implements BaseBodyDataModel { }
