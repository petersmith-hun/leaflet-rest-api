package hu.psprog.leaflet.api.rest.response.entity;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

/**
 * Login response data model.
 *
 * @author Peter Smith
 */
public class LoginResponseDataModel extends BaseBodyDataModel {

    private static final String STATUS = "status";
    private static final String TOKEN = "token";

    private LoginResponseDataModel() {
        // prevent direct initialization
    }

    public static class Builder {

        private LoginResponseDataModel loginResponseDataModel;

        public Builder() {
            loginResponseDataModel = new LoginResponseDataModel();
        }

        public Builder withStatus(String status) {
            loginResponseDataModel.addSingleNode(STATUS, status);
            return this;
        }

        public Builder withToken(String token) {
            loginResponseDataModel.addSingleNode(TOKEN, token);
            return this;
        }

        public LoginResponseDataModel build() {
            return loginResponseDataModel;
        }
    }
}
