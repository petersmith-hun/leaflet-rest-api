package hu.psprog.leaflet.api.rest.response.entry;

import hu.psprog.leaflet.api.rest.response.category.CategoryDataModel;
import hu.psprog.leaflet.api.rest.response.file.FileDataModel;
import hu.psprog.leaflet.api.rest.response.tag.TagDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * Interface backing the entry data model records.
 *
 * @author Peter Smith
 */
public interface EntryData {

    long id();
    String title();
    String link();
    String prologue();
    UserDataModel user();
    List<TagDataModel> tags();
    CategoryDataModel category();
    ZonedDateTime created();
    ZonedDateTime lastModified();
    List<FileDataModel> attachments();
    String locale();
    ZonedDateTime published();
}
