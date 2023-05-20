package hu.psprog.leaflet.api.rest.response.document;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

/**
 * Response data model for document editor returning RAW_CONTENT instead of rendered content.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record EditDocumentDataModel(
        long id,
        String title,
        String link,
        String rawContent,
        UserDataModel user,
        ZonedDateTime created,
        String locale,
        ZonedDateTime lastModified,
        boolean enabled
) implements BaseBodyDataModel { }
