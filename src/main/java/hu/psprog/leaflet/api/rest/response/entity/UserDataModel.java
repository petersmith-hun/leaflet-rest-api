package hu.psprog.leaflet.api.rest.response.entity;

import hu.psprog.leaflet.api.rest.common.BaseBodyDataModel;

/**
 * Basic user data response model.
 *
 * @author Peter Smith
 */
public class UserDataModel extends BaseBodyDataModel {

    private static final String ID = "id";
    private static final String USERNAME = "username";

    public static class Builder {

        protected UserDataModel userDataModel;

        public Builder() {
            this.userDataModel = new UserDataModel();
        }

        public Builder withID(Long id) {
            userDataModel.addSingleNode(ID, id);
            return this;
        }

        public Builder withUsername(String username) {
            userDataModel.addSingleNode(USERNAME, username);
            return this;
        }

        public UserDataModel build() {
            return userDataModel;
        }
    }
}
