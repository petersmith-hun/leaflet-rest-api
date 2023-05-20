package hu.psprog.leaflet.api.rest.request.user;

import hu.psprog.leaflet.api.rest.request.validator.PasswordConfirmCheck;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Request model holding user password and its confirmation for re-usability.
 *
 * @author Peter Smith
 */
@Data
@PasswordConfirmCheck
public class UserPasswordRequestModel implements Serializable {

    @NotNull
    @NotEmpty
    @ToString.Exclude
    private String password;

    @NotNull
    @NotEmpty
    @ToString.Exclude
    private String passwordConfirmation;

}
