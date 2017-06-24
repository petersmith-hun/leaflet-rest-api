package hu.psprog.leaflet.api.rest.response.user;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response model for a user.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = UserDataModel.UserDataModelBuilder.class)
public class UserDataModel extends BaseBodyDataModel {

    protected long id;
    protected String username;

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof UserDataModel)) return false;

        UserDataModel that = (UserDataModel) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(username, that.username)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(username)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("username", username)
                .toString();
    }

    public static UserDataModelBuilder getBuilder() {
        return new UserDataModelBuilder();
    }

    public static final class UserDataModelBuilder {
        private long id;
        private String username;

        private UserDataModelBuilder() {
        }

        public UserDataModelBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public UserDataModelBuilder withUsername(String username) {
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
