package hu.psprog.leaflet.api.rest.request.user;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;

/**
 * Request model for password reset confirmation.
 *
 * @author Peter Smith
 */
public class PasswordResetConfirmationRequestModel extends UserPasswordRequestModel {

    @NotNull
    @Email
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("email", email)
                .toString();
    }
}
