package hu.psprog.leaflet.api.rest.response.entity;

/**
 * Extended user details data response model.
 *
 * @author Peter Smith
 */
public class ExtendedUserDataModel extends UserDataModel {

    private static final String EMAIL = "email";
    private static final String ROLE = "role";
    private static final String LOCALE = "locale";
    private static final String CREATED = "created";
    private static final String LAST_LOGIN = "lastLogin";

    public ExtendedUserDataModel() {
        // prevent direct initialization
    }

    public static class Builder extends UserDataModel.Builder {

        public Builder withEmail(String email) {
            userDataModel.addSingleNode(EMAIL, email);
            return this;
        }

        public Builder withRole(String role) {
            userDataModel.addSingleNode(ROLE, role);
            return this;
        }

        public Builder withLocale(String locale) {
            userDataModel.addSingleNode(LOCALE, locale);
            return this;
        }

        public Builder withCreated(String created) {
            userDataModel.addSingleNode(CREATED, created);
            return this;
        }

        public Builder withLastLogin(String lastLogin) {
            userDataModel.addSingleNode(LAST_LOGIN, lastLogin);
            return this;
        }
    }
}
