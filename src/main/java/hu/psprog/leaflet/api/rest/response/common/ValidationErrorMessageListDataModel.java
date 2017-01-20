package hu.psprog.leaflet.api.rest.response.common;

import java.util.LinkedList;
import java.util.List;

/**
 * Wrapper model for list of validation error messages.
 *
 * @author Peter Smith
 */
public class ValidationErrorMessageListDataModel extends BaseBodyDataModel {

    private List<ValidationErrorMessageDataModel> validation;

    public List<ValidationErrorMessageDataModel> getValidation() {
        return validation;
    }

    public void setValidation(List<ValidationErrorMessageDataModel> validation) {
        this.validation = validation;
    }

    public static final class Builder {
        private List<ValidationErrorMessageDataModel> validation;

        public Builder() {
            validation = new LinkedList<>();
        }

        public Builder withItem(ValidationErrorMessageDataModel validationErrorMessageDataModel) {
            this.validation.add(validationErrorMessageDataModel);
            return this;
        }

        public ValidationErrorMessageListDataModel build() {
            ValidationErrorMessageListDataModel validationErrorMessageListDataModel = new ValidationErrorMessageListDataModel();
            validationErrorMessageListDataModel.setValidation(validation);
            return validationErrorMessageListDataModel;
        }
    }
}
