package hu.psprog.leaflet.api.rest.response.entry;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

/**
 * Response data model for list of entries for a search request.
 * Instead of the simple entry data model, it contains a list of {@link EditEntryDataModel} objects, containing
 * more information about each entry.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record EntrySearchResultDataModel(
        List<EditEntryDataModel> entries
) implements BaseBodyDataModel { }
