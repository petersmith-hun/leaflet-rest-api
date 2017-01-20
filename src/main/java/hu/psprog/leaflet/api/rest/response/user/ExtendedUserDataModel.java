package hu.psprog.leaflet.api.rest.response.user;

/**
 * Extended user details data response model.
 *
 * @author Peter Smith
 */
public class ExtendedUserDataModel extends UserDataModel {

    private String email;
    private String role;
    private String locale;
    private String created;
    private String lastLogin;
    private String lastModified;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

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

    public static final class Builder {
        private long id;
        private String username;
        private String email;
        private String role;
        private String locale;
        private String created;
        private String lastLogin;
        private String lastModified;

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withRole(String role) {
            this.role = role;
            return this;
        }

        public Builder withID(long id) {
            this.id = id;
            return this;
        }

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }

        public Builder withUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder withCreated(String created) {
            this.created = created;
            return this;
        }

        public Builder withLastLogin(String lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }

        public Builder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public ExtendedUserDataModel build() {
            ExtendedUserDataModel extendedUserDataModel = new ExtendedUserDataModel();
            extendedUserDataModel.email = this.email;
            extendedUserDataModel.locale = this.locale;
            extendedUserDataModel.created = this.created;
            extendedUserDataModel.lastLogin = this.lastLogin;
            extendedUserDataModel.lastModified = this.lastModified;
            extendedUserDataModel.role = this.role;
            extendedUserDataModel.id = this.id;
            extendedUserDataModel.username = this.username;
            return extendedUserDataModel;
        }
    }
}
