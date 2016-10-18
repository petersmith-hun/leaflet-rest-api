package hu.psprog.leaflet.api.rest.request.user;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Request model for updating user role.
 *
 * @author Peter Smith
 */
public class UpdateRoleRequestModel implements Serializable {

    @NotNull
    @NotEmpty
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
