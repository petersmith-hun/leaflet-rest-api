package hu.psprog.leaflet.api.rest.response.file;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response data model for uploaded file meta records.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = FileDataModel.FileDataModelBuilder.class)
public class FileDataModel extends BaseBodyDataModel {

    private String originalFilename;
    private String reference;
    private String acceptedAs;
    private String description;

    public String getOriginalFilename() {
        return originalFilename;
    }

    public String getReference() {
        return reference;
    }

    public String getAcceptedAs() {
        return acceptedAs;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof FileDataModel)) return false;

        FileDataModel that = (FileDataModel) o;

        return new EqualsBuilder()
                .append(originalFilename, that.originalFilename)
                .append(reference, that.reference)
                .append(acceptedAs, that.acceptedAs)
                .append(description, that.description)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(originalFilename)
                .append(reference)
                .append(acceptedAs)
                .append(description)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("originalFilename", originalFilename)
                .append("reference", reference)
                .append("acceptedAs", acceptedAs)
                .append("description", description)
                .toString();
    }

    public static FileDataModelBuilder getBuilder() {
        return new FileDataModelBuilder();
    }

    /**
     * Builder for {@link FileDataModel}.
     */
    public static final class FileDataModelBuilder {
        private String originalFilename;
        private String reference;
        private String acceptedAs;
        private String description;

        private FileDataModelBuilder() {
        }

        public FileDataModelBuilder withOriginalFilename(String originalFilename) {
            this.originalFilename = originalFilename;
            return this;
        }

        public FileDataModelBuilder withReference(String reference) {
            this.reference = reference;
            return this;
        }

        public FileDataModelBuilder withAcceptedAs(String acceptedAs) {
            this.acceptedAs = acceptedAs;
            return this;
        }

        public FileDataModelBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public FileDataModel build() {
            FileDataModel fileDataModel = new FileDataModel();
            fileDataModel.originalFilename = originalFilename;
            fileDataModel.reference = reference;
            fileDataModel.acceptedAs = acceptedAs;
            fileDataModel.description = description;
            return fileDataModel;
        }
    }
}
