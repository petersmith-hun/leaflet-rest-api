package hu.psprog.leaflet.api.rest.request.user;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Request model for password change requests.
 *
 * @author Peter Smith
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PasswordChangeRequestModel extends UserPasswordRequestModel {

    @NotNull
    @NotEmpty
    @ToString.Exclude
    private String currentPassword;

}
