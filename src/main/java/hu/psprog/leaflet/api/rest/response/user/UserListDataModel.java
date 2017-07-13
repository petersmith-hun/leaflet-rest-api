package hu.psprog.leaflet.api.rest.response.user;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.LinkedList;
import java.util.List;

/**
 * Response model for list of users.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = UserListDataModel.UserListDataModelBuilder.class)
public class UserListDataModel extends BaseBodyDataModel {

    private List<UserDataModel> users;

    public List<UserDataModel> getUsers() {
        return users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof UserListDataModel)) return false;

        UserListDataModel that = (UserListDataModel) o;

        return new EqualsBuilder()
                .append(users, that.users)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(users)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("users", users)
                .toString();
    }

    public static UserListDataModelBuilder getBuilder() {
        return new UserListDataModelBuilder();
    }

    public static final class UserListDataModelBuilder {
        private List<UserDataModel> users;

        private UserListDataModelBuilder() {
            users = new LinkedList<>();
        }

        public UserListDataModelBuilder withItem(UserDataModel user) {
            this.users.add(user);
            return this;
        }

        public UserListDataModelBuilder withUsers(List<UserDataModel> users) {
            this.users = users;
            return this;
        }

        public UserListDataModel build() {
            UserListDataModel userListDataModel = new UserListDataModel();
            userListDataModel.users = users;
            return userListDataModel;
        }
    }
}
