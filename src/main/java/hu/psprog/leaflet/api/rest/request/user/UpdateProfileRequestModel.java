package hu.psprog.leaflet.api.rest.request.user;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Locale;

/**
 * Request model for updating user profile fields.
 *
 * @author Peter Smith
 */
public class UpdateProfileRequestModel implements Serializable {

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
    private Locale defaultLocale;

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

    public Locale getDefaultLocale() {
        return defaultLocale;
    }

    public void setDefaultLocale(Locale defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        UpdateProfileRequestModel that = (UpdateProfileRequestModel) o;

        return new EqualsBuilder()
                .append(username, that.username)
                .append(email, that.email)
                .append(defaultLocale, that.defaultLocale)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(username)
                .append(email)
                .append(defaultLocale)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("username", username)
                .append("email", email)
                .append("defaultLocale", defaultLocale)
                .toString();
    }
}
