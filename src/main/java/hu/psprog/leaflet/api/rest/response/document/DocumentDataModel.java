package hu.psprog.leaflet.api.rest.response.document;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

/**
 * Response data model for documents.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record DocumentDataModel(
        long id,
        String title,
        String link,
        String rawContent,
        UserDataModel user,
        ZonedDateTime created,
        String locale
) implements BaseBodyDataModel { }
