package hu.psprog.leaflet.api.rest.request.user;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Request model for login (token) request.
 *
 * @author Peter Smith
 */
public class LoginRequestModel implements Serializable {

    @NotNull
    @Email
    private String email;

    @NotNull
    @NotEmpty
    private String password;

    public LoginRequestModel() {
        // Serializable
    }

    public LoginRequestModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
