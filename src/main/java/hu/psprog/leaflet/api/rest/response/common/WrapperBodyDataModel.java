package hu.psprog.leaflet.api.rest.response.common;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

/**
 * Body structure model for wrapped responses.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record WrapperBodyDataModel<T extends BaseBodyDataModel>(
        T body,
        PaginationDataModel pagination,
        SEODataModel seo,
        ErrorMessageDataModel error,
        MenuDataModel menu
) implements BaseBodyDataModel { }
