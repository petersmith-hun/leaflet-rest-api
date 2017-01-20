package hu.psprog.leaflet.api.rest.response.user;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

/**
 * Response model for a user.
 *
 * @author Peter Smith
 */
public class UserDataModel extends BaseBodyDataModel {

    long id;
    String username;

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public static final class Builder {
        private long id;
        private String username;

        public Builder withID(long id) {
            this.id = id;
            return this;
        }

        public Builder withUsername(String username) {
            this.username = username;
            return this;
        }

        public UserDataModel build() {
            UserDataModel userDataModel = new UserDataModel();
            userDataModel.id = this.id;
            userDataModel.username = this.username;
            return userDataModel;
        }
    }
}
