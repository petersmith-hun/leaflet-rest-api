package hu.psprog.leaflet.api.rest.request.user;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * Request model for creating a new user with role explicitly specified.
 *
 * @author Peter Smith
 */
public class UserCreateRequestModel extends UserInitializeRequestModel {

    @NotNull
    @NotEmpty
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        UserCreateRequestModel that = (UserCreateRequestModel) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(role, that.role)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(role)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("role", role)
                .append("password", "[hidden]")
                .append("username", getUsername())
                .append("passwordConfirmation", "[hidden]")
                .append("email", getEmail())
                .append("defaultLocale", getDefaultLocale())
                .toString();
    }
}
