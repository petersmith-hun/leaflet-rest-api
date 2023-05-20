package hu.psprog.leaflet.api.rest.request.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Validator annotation for password confirmation checking.
 *
 * @author Peter Smith
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = PasswordConfirmationValidator.class)
public @interface PasswordConfirmCheck {

    String message() default "{validation.password.confirmation}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
