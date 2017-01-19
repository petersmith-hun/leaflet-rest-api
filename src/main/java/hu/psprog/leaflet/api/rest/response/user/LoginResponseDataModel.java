package hu.psprog.leaflet.api.rest.response.user;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

/**
 * Login response data model.
 *
 * @author Peter Smith
 */
public class LoginResponseDataModel extends BaseBodyDataModel {

    public enum AuthenticationResult {
        AUTH_SUCCESS,
        INVALID_CREDENTIALS
    }

    private AuthenticationResult status;
    private String token;

    public void setStatus(AuthenticationResult status) {
        this.status = status;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AuthenticationResult getStatus() {
        return status;
    }

    public String getToken() {
        return token;
    }

    public static final class Builder {
        private AuthenticationResult status;
        private String token;

        public Builder withStatus(AuthenticationResult status) {
            this.status = status;
            return this;
        }

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }

        public LoginResponseDataModel build() {
            LoginResponseDataModel loginResponseDataModel = new LoginResponseDataModel();
            loginResponseDataModel.status = this.status;
            loginResponseDataModel.token = this.token;
            return loginResponseDataModel;
        }
    }
}
