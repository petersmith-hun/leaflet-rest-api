package hu.psprog.leaflet.api.rest.request.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates to check if given user data parameters are provided in the correct form during commenting.
 *
 * @author Peter Smith
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = CommentUserDataValidator.class)
public @interface CommentUserDataCheck {

    String message() default "{validation.commenting.user.info}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
