package hu.psprog.leaflet.api.rest.response.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Wrapper model for error messages.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = ErrorMessageDataModel.ErrorMessageDataModelBuilder.class)
public class ErrorMessageDataModel extends BaseBodyDataModel {

    protected String message;

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof ErrorMessageDataModel)) return false;

        ErrorMessageDataModel that = (ErrorMessageDataModel) o;

        return new EqualsBuilder()
                .append(message, that.message)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(message)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("message", message)
                .toString();
    }

    public static ErrorMessageDataModelBuilder getBuilder() {
        return new ErrorMessageDataModelBuilder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class ErrorMessageDataModelBuilder {
        private String message;

        private ErrorMessageDataModelBuilder() {
        }

        public ErrorMessageDataModelBuilder withMessage(String message) {
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
