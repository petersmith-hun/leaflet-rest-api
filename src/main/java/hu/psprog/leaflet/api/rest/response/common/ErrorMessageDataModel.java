package hu.psprog.leaflet.api.rest.response.common;

/**
 * Wrapper model for error messages.
 *
 * @author Peter Smith
 */
public class ErrorMessageDataModel extends BaseBodyDataModel {

    String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static final class Builder {
        private String message;

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }

        public ErrorMessageDataModel build() {
            ErrorMessageDataModel errorMessageDataModel = new ErrorMessageDataModel();
            errorMessageDataModel.message = this.message;
            return errorMessageDataModel;
        }
    }
}
