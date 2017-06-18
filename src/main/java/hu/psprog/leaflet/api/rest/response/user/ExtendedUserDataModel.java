package hu.psprog.leaflet.api.rest.response.user;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Extended user details data response model.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = ExtendedUserDataModel.ExtendedUserDataModelBuilder.class)
public class ExtendedUserDataModel extends UserDataModel {

    private String email;
    private String role;
    private String locale;
    private String created;
    private String lastLogin;
    private String lastModified;

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public String getLocale() {
        return locale;
    }

    public String getCreated() {
        return created;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public String getLastModified() {
        return lastModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof ExtendedUserDataModel)) return false;

        ExtendedUserDataModel that = (ExtendedUserDataModel) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(email, that.email)
                .append(role, that.role)
                .append(locale, that.locale)
                .append(created, that.created)
                .append(lastLogin, that.lastLogin)
                .append(lastModified, that.lastModified)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(email)
                .append(role)
                .append(locale)
                .append(created)
                .append(lastLogin)
                .append(lastModified)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("email", email)
                .append("role", role)
                .append("locale", locale)
                .append("created", created)
                .append("lastLogin", lastLogin)
                .append("id", id)
                .append("username", username)
                .append("lastModified", lastModified)
                .toString();
    }

    public static ExtendedUserDataModelBuilder getExtendedBuilder() {
        return new ExtendedUserDataModelBuilder();
    }

    public static final class ExtendedUserDataModelBuilder {
        private long id;
        private String username;
        private String email;
        private String role;
        private String locale;
        private String created;
        private String lastLogin;
        private String lastModified;

        private ExtendedUserDataModelBuilder() {
        }

        public ExtendedUserDataModelBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public ExtendedUserDataModelBuilder withRole(String role) {
            this.role = role;
            return this;
        }

        public ExtendedUserDataModelBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public ExtendedUserDataModelBuilder withLocale(String locale) {
            this.locale = locale;
            return this;
        }

        public ExtendedUserDataModelBuilder withUsername(String username) {
            this.username = username;
            return this;
        }

        public ExtendedUserDataModelBuilder withCreated(String created) {
            this.created = created;
            return this;
        }

        public ExtendedUserDataModelBuilder withLastLogin(String lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }

        public ExtendedUserDataModelBuilder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public ExtendedUserDataModel build() {
            ExtendedUserDataModel extendedUserDataModel = new ExtendedUserDataModel();
            extendedUserDataModel.created = this.created;
            extendedUserDataModel.lastModified = this.lastModified;
            extendedUserDataModel.id = this.id;
            extendedUserDataModel.locale = this.locale;
            extendedUserDataModel.lastLogin = this.lastLogin;
            extendedUserDataModel.role = this.role;
            extendedUserDataModel.email = this.email;
            extendedUserDataModel.username = this.username;
            return extendedUserDataModel;
        }
    }
}
