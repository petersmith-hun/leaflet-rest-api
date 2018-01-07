package hu.psprog.leaflet.api.rest.request.user;

import hu.psprog.leaflet.api.rest.request.validator.PasswordConfirmCheck;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        UserPasswordRequestModel that = (UserPasswordRequestModel) o;

        return new EqualsBuilder()
                .append(password, that.password)
                .append(passwordConfirmation, that.passwordConfirmation)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(password)
                .append(passwordConfirmation)
                .toHashCode();
    }
}
