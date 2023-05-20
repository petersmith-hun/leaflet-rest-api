package hu.psprog.leaflet.api.rest.request.validator;

import hu.psprog.leaflet.api.rest.request.user.UserPasswordRequestModel;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * Checks is password for new user and its confirmation is the same.
 *
 * @author Peter Smith
 */
public class PasswordConfirmationValidator implements ConstraintValidator<PasswordConfirmCheck, UserPasswordRequestModel> {

    @Override
    public void initialize(PasswordConfirmCheck constraintAnnotation) {
        // do nothing
    }

    @Override
    public boolean isValid(UserPasswordRequestModel value, ConstraintValidatorContext context) {

        return value.getPassword().equals(value.getPasswordConfirmation());
    }
}
