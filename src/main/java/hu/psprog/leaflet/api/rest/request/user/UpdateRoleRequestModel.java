package hu.psprog.leaflet.api.rest.request.user;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

/**
 * Request model for updating user role.
 *
 * @author Peter Smith
 */
@Data
public class UpdateRoleRequestModel implements Serializable {

    @NotNull
    @NotEmpty
    private String role;

}
