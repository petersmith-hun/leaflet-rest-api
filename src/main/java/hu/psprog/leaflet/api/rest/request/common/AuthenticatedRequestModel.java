package hu.psprog.leaflet.api.rest.request.common;

/**
 * Models requesting user authentication should implement this interface.
 *
 * @author Peter Smith
 */
public interface AuthenticatedRequestModel {

    /**
     * Returns authenticated user ID.
     *
     * @return authenticated user ID as {@link Long}
     */
    Long getAuthenticatedUserId();
}
