package hu.psprog.leaflet.api.rest.request.user;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * Request model for password change requests.
 *
 * @author Peter Smith
 */
public class PasswordChangeRequestModel extends UserPasswordRequestModel {

    @NotNull
    @NotEmpty
    private String currentPassword;

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        PasswordChangeRequestModel that = (PasswordChangeRequestModel) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(currentPassword, that.currentPassword)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(currentPassword)
                .toHashCode();
    }
}
