package hu.psprog.leaflet.api.rest.response.category;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

/**
 * Response model for list of categories.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record CategoryListDataModel(
        List<CategoryDataModel> categories
) implements BaseBodyDataModel { }
