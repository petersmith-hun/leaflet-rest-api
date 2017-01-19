package hu.psprog.leaflet.api.rest.response.user;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

import java.util.LinkedList;
import java.util.List;

/**
 * Response model for list of users.
 *
 * @author Peter Smith
 */
public class UserListDataModel extends BaseBodyDataModel {

    private List<UserDataModel> users;

    public List<UserDataModel> getUsers() {
        return users;
    }

    public void setUsers(List<UserDataModel> users) {
        this.users = users;
    }

    public static final class Builder {
        private List<UserDataModel> users;

        public Builder() {
            users = new LinkedList<>();
        }

        public Builder withItem(UserDataModel user) {
            this.users.add(user);
            return this;
        }

        public UserListDataModel build() {
            UserListDataModel userListDataModel = new UserListDataModel();
            userListDataModel.setUsers(users);
            return userListDataModel;
        }
    }
}
