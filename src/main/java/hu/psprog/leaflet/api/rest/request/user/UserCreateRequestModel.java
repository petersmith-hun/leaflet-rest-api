package hu.psprog.leaflet.api.rest.request.user;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Request model for creating a new user with role explicitly specified.
 *
 * @author Peter Smith
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class UserCreateRequestModel extends UserInitializeRequestModel {

    @NotNull
    @NotEmpty
    private String role;

}
