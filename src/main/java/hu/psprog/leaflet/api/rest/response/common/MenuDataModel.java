package hu.psprog.leaflet.api.rest.response.common;

import hu.psprog.leaflet.api.rest.response.routing.FrontEndRouteDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

/**
 * Response model for menus.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record MenuDataModel(
        List<FrontEndRouteDataModel> header,
        List<FrontEndRouteDataModel> footer,
        List<FrontEndRouteDataModel> standalone
) implements BaseBodyDataModel { }
