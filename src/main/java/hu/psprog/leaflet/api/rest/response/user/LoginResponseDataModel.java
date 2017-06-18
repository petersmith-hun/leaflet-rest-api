package hu.psprog.leaflet.api.rest.response.user;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Login response data model.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = LoginResponseDataModel.LoginResponseDataModelBuilder.class)
public class LoginResponseDataModel extends BaseBodyDataModel {

    public enum AuthenticationResult {
        AUTH_SUCCESS,
        INVALID_CREDENTIALS
    }

    private AuthenticationResult status;
    private String token;

    public AuthenticationResult getStatus() {
        return status;
    }

    public String getToken() {
        return token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof LoginResponseDataModel)) return false;

        LoginResponseDataModel that = (LoginResponseDataModel) o;

        return new EqualsBuilder()
                .append(status, that.status)
                .append(token, that.token)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(status)
                .append(token)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("status", status)
                .append("token", token)
                .toString();
    }

    public static LoginResponseDataModelBuilder getBuilder() {
        return new LoginResponseDataModelBuilder();
    }

    public static final class LoginResponseDataModelBuilder {
        private AuthenticationResult status;
        private String token;

        private LoginResponseDataModelBuilder() {
        }

        public LoginResponseDataModelBuilder withStatus(AuthenticationResult status) {
            this.status = status;
            return this;
        }

        public LoginResponseDataModelBuilder withToken(String token) {
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
