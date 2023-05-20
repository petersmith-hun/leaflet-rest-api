package hu.psprog.leaflet.api.rest.response.user;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

/**
 * Response model for list of users.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record UserListDataModel(
        List<ExtendedUserDataModel> users
) implements BaseBodyDataModel { }
