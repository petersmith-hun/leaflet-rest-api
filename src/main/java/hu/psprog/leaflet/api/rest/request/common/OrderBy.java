package hu.psprog.leaflet.api.rest.request.common;

/**
 * Enum collection for supported sort fields.
 *
 * @author Peter Smith
 */
public interface OrderBy {

    /**
     * Supported sort fields for entries.
     */
    enum Entry {

        ID,
        TITLE,
        CREATED,
        PUBLISHED
    }

    /**
     * Supported sort fields for comments.
     */
    enum Comment {

        ID,
        CREATED
    }
}
