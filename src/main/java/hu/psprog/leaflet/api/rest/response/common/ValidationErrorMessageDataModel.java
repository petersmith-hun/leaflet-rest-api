package hu.psprog.leaflet.api.rest.response.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Wrapper model for validation error messages.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = ValidationErrorMessageDataModel.ValidationErrorMessageDataModelBuilder.class)
public class ValidationErrorMessageDataModel extends ErrorMessageDataModel {

    private String field;

    public String getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof ValidationErrorMessageDataModel)) return false;

        ValidationErrorMessageDataModel that = (ValidationErrorMessageDataModel) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(field, that.field)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(field)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("field", field)
                .append("message", message)
                .toString();
    }

    public static ValidationErrorMessageDataModelBuilder getExtendedBuilder() {
        return new ValidationErrorMessageDataModelBuilder();
    }

    public static final class ValidationErrorMessageDataModelBuilder {
        protected String message;
        private String field;

        private ValidationErrorMessageDataModelBuilder() {
        }

        public ValidationErrorMessageDataModelBuilder withMessage(String message) {
            this.message = message;
            return this;
        }

        public ValidationErrorMessageDataModelBuilder withField(String field) {
            this.field = field;
            return this;
        }

        public ValidationErrorMessageDataModel build() {
            ValidationErrorMessageDataModel validationErrorMessageDataModel = new ValidationErrorMessageDataModel();
            validationErrorMessageDataModel.field = this.field;
            validationErrorMessageDataModel.message = this.message;
            return validationErrorMessageDataModel;
        }
    }
}
