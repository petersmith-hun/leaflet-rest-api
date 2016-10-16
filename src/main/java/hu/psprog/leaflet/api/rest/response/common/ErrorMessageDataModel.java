package hu.psprog.leaflet.api.rest.response.common;

/**
 * Wrapper model for error messages.
 *
 * @author Peter Smith
 */
public class ErrorMessageDataModel extends BaseBodyDataModel {

    private static final String MESSAGE = "message";

    protected ErrorMessageDataModel() {
        // prevent direct initialization
    }

    public static class Builder {

        protected ErrorMessageDataModel errorMessageDataModel;

        public Builder() {
            errorMessageDataModel = new ErrorMessageDataModel();
        }

        public Builder withMessage(String message) {
            errorMessageDataModel.addSingleNode(MESSAGE, message);
            return this;
        }

        public ErrorMessageDataModel build() {
            return errorMessageDataModel;
        }
    }
}
