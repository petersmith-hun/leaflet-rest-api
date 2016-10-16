package hu.psprog.leaflet.api.rest.request.user;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Locale;

/**
 * Request model for initializing user database with the first (admin) account.
 *
 * @author Peter Smith
 */
public class UserInitializeRequestModel implements Serializable {

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String username;

    @NotNull
    @Email
    @NotEmpty
    @Size(max = 255)
    private String email;

    @NotNull
    @NotEmpty
    private String password;

    @NotNull
    private Locale defaultLocale;

    public UserInitializeRequestModel() {
        // Serializable
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Locale getDefaultLocale() {
        return defaultLocale;
    }

    public void setDefaultLocale(Locale defaultLocale) {
        this.defaultLocale = defaultLocale;
    }
}
