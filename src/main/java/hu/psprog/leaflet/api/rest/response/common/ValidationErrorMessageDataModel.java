package hu.psprog.leaflet.api.rest.response.common;

/**
 * Wrapper model for validation error messages.
 *
 * @author Peter Smith
 */
public class ValidationErrorMessageDataModel extends ErrorMessageDataModel {

    private static final String FIELD = "field";

    private ValidationErrorMessageDataModel() {
        // prevent direct initialization
    }

    public static class Builder extends ErrorMessageDataModel.Builder {

        public Builder withField(String field) {
            errorMessageDataModel.addSingleNode(FIELD, field);
            return this;
        }
    }
}
