package hu.psprog.leaflet.api.rest.request.user;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * Request model for creating a new user with role explicitly specified.
 *
 * @author Peter Smith
 */
public class UserCreateRequestModel extends UserInitializeRequestModel {

    @NotNull
    @NotEmpty
    private String role;

    public UserCreateRequestModel() {
        // Serializable
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
