package hu.psprog.leaflet.api.rest.request.validator;

import hu.psprog.leaflet.api.rest.request.comment.CommentCreateRequestModel;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

/**
 * Validates provided user data in {@link CommentCreateRequestModel}
 * User data is considered valid in the following two cases:
 *  - authenticatedUserId is provided: email and username will be ignored aside from they are provided or not
 *  - authenticatedUserId is not provided, though email and username are (anonymous commenting)
 *
 * @author Peter Smith
 */

public class CommentUserDataValidator implements ConstraintValidator<CommentUserDataCheck, CommentCreateRequestModel> {

    @Override
    public void initialize(CommentUserDataCheck constraintAnnotation) {
        // do nothing
    }

    @Override
    public boolean isValid(CommentCreateRequestModel value, ConstraintValidatorContext context) {
        return isAuthenticatedUserIdProvided(value) || isAnonymousCommenting(value);
    }

    private boolean isAuthenticatedUserIdProvided(CommentCreateRequestModel commentCreateRequestModel) {
        return Objects.nonNull(commentCreateRequestModel.getAuthenticatedUserId())
                && commentCreateRequestModel.getAuthenticatedUserId() > 0;
    }

    private boolean isAnonymousCommenting(CommentCreateRequestModel commentCreateRequestModel) {
        return Objects.isNull(commentCreateRequestModel.getAuthenticatedUserId())
                && StringUtils.isNoneBlank(commentCreateRequestModel.getEmail(), commentCreateRequestModel.getUsername());
    }
}
