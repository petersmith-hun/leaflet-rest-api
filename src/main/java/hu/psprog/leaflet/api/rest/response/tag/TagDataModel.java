package hu.psprog.leaflet.api.rest.response.tag;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

/**
 * Response data model for tags.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record TagDataModel(
        long id,
        String name,
        ZonedDateTime created,
        ZonedDateTime lastModified,
        boolean enabled
) implements BaseBodyDataModel { }
