package hu.psprog.leaflet.api.rest.response.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

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

        public ValidationErrorMessageListDataModel build() {
            ValidationErrorMessageListDataModel validationErrorMessageListDataModel = new ValidationErrorMessageListDataModel();
            validationErrorMessageListDataModel.validation = validation;
            return validationErrorMessageListDataModel;
        }
    }
}
