package hu.psprog.leaflet.api.rest.response.entry;

import com.fasterxml.jackson.annotation.JsonInclude;
import hu.psprog.leaflet.api.rest.response.category.CategoryDataModel;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import hu.psprog.leaflet.api.rest.response.file.FileDataModel;
import hu.psprog.leaflet.api.rest.response.tag.TagDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * Extended response data model for entries.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record ExtendedEntryDataModel(
        long id,
        String title,
        String link,
        String prologue,
        UserDataModel user,
        List<TagDataModel> tags,
        CategoryDataModel category,
        ZonedDateTime created,
        ZonedDateTime lastModified,
        List<FileDataModel> attachments,
        String locale,
        @JsonInclude(JsonInclude.Include.NON_NULL) ZonedDateTime published,
        String rawContent
) implements BaseBodyDataModel, EntryData { }
