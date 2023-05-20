package hu.psprog.leaflet.api.rest.response.comment;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import hu.psprog.leaflet.api.rest.response.entry.EntryDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

/**
 * Extended response data model for comments.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record ExtendedCommentDataModel(
        Long id,
        UserDataModel owner,
        String content,
        ZonedDateTime created,
        ZonedDateTime lastModified,
        boolean enabled,
        boolean deleted,
        EntryDataModel associatedEntry
) implements BaseBodyDataModel, CommentData { }
