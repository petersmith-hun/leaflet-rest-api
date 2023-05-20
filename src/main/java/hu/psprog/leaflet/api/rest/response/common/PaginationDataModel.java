package hu.psprog.leaflet.api.rest.response.common;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

/**
 * Pagination parameter data model.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record PaginationDataModel(
        long entityCount,
        int pageCount,
        int pageNumber,
        int entityCountOnPage,
        boolean first,
        boolean last,
        boolean hasNext,
        boolean hasPrevious
) implements BaseBodyDataModel { }
