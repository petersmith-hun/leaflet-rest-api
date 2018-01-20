package hu.psprog.leaflet.api.rest.response.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.LinkedList;
import java.util.List;

/**
 * Wrapper model for list of validation error messages.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = ValidationErrorMessageListDataModel.ValidationErrorMessageListDataModelBuilder.class)
public class ValidationErrorMessageListDataModel extends BaseBodyDataModel {

    private List<ValidationErrorMessageDataModel> validation;

    public List<ValidationErrorMessageDataModel> getValidation() {
        return validation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ValidationErrorMessageListDataModel that = (ValidationErrorMessageListDataModel) o;

        return new EqualsBuilder()
                .append(validation, that.validation)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(validation)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("validation", validation)
                .toString();
    }

    public static ValidationErrorMessageListDataModelBuilder getBuilder() {
        return new ValidationErrorMessageListDataModelBuilder();
    }

    public static final class ValidationErrorMessageListDataModelBuilder {
        private List<ValidationErrorMessageDataModel> validation;

        private ValidationErrorMessageListDataModelBuilder() {
            validation = new LinkedList<>();
        }

        public ValidationErrorMessageListDataModelBuilder withItem(ValidationErrorMessageDataModel validationErrorMessageDataModel) {
            this.validation.add(validationErrorMessageDataModel);
            return this;
        }

        public ValidationErrorMessageListDataModelBuilder withValidation(List<ValidationErrorMessageDataModel> validation) {
            this.validation = validation;
            return this;
        }

        public ValidationErrorMessageListDataModel build() {
            ValidationErrorMessageListDataModel validationErrorMessageListDataModel = new ValidationErrorMessageListDataModel();
            validationErrorMessageListDataModel.validation = validation;
            return validationErrorMessageListDataModel;
        }
    }
}
