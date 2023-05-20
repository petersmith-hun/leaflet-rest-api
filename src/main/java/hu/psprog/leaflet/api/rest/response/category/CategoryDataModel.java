package hu.psprog.leaflet.api.rest.response.category;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

/**
 * Response model for categories.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record CategoryDataModel(
        long id,
        String title,
        String description,
        ZonedDateTime created,
        ZonedDateTime lastModified,
        boolean enabled
) implements BaseBodyDataModel { }
