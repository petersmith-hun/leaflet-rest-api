package hu.psprog.leaflet.api.rest.request.user;

import hu.psprog.leaflet.api.rest.request.validator.PasswordConfirmCheck;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Request model holding user password and its confirmation for re-usability.
 *
 * @author Peter Smith
 */
@PasswordConfirmCheck
public class UserPasswordRequestModel implements Serializable {

    @NotNull
    @NotEmpty
    private String password;

    @NotNull
    @NotEmpty
    private String passwordConfirmation;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }
}
