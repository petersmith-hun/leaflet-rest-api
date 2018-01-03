package hu.psprog.leaflet.api.rest.request.user;

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
}
