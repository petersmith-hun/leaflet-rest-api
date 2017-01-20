package hu.psprog.leaflet.api.rest.response.common;

/**
 * Wrapper model for validation error messages.
 *
 * @author Peter Smith
 */
public class ValidationErrorMessageDataModel extends ErrorMessageDataModel {

    private String field;

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public static final class Builder {
        private String message;
        private String field;

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder withField(String field) {
            this.field = field;
            return this;
        }

        public ValidationErrorMessageDataModel build() {
            ValidationErrorMessageDataModel errorMessageDataModel = new ValidationErrorMessageDataModel();
            errorMessageDataModel.message = this.message;
            errorMessageDataModel.field = this.field;
            return errorMessageDataModel;
        }
    }
}
