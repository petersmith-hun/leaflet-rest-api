package hu.psprog.leaflet.api.rest.response.comment;

import hu.psprog.leaflet.api.rest.response.user.UserDataModel;

import java.time.ZonedDateTime;

/**
 * Interface backing the comment data model records.
 *
 * @author Peter Smith
 */
public interface CommentData {

    Long id();
    UserDataModel owner();
    String content();
    ZonedDateTime created();
    ZonedDateTime lastModified();
    boolean enabled();
    boolean deleted();
}
