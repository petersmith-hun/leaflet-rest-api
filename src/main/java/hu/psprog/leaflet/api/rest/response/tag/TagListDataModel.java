package hu.psprog.leaflet.api.rest.response.tag;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

/**
 * Response data model for list of tags.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record TagListDataModel(
        List<TagDataModel> tags
) implements BaseBodyDataModel { }
