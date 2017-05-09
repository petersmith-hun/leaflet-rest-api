package hu.psprog.leaflet.api.rest.response.file;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

/**
 * Response data model for uploaded file meta records.
 *
 * @author Peter Smith
 */
public class FileDataModel extends BaseBodyDataModel {

    private String originalFilename;
    private String reference;
    private String acceptedAs;
    private String description;

    public String getOriginalFilename() {
        return originalFilename;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getAcceptedAs() {
        return acceptedAs;
    }

    public void setAcceptedAs(String acceptedAs) {
        this.acceptedAs = acceptedAs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Builder for {@link FileDataModel}.
     */
    public static final class Builder {
        private String originalFilename;
        private String reference;
        private String acceptedAs;
        private String description;

        private Builder() {
        }

        public static Builder getBuilder() {
            return new Builder();
        }

        public Builder withOriginalFilename(String originalFilename) {
            this.originalFilename = originalFilename;
            return this;
        }

        public Builder withReference(String reference) {
            this.reference = reference;
            return this;
        }

        public Builder withAcceptedAs(String acceptedAs) {
            this.acceptedAs = acceptedAs;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public FileDataModel build() {
            FileDataModel fileDataModel = new FileDataModel();
            fileDataModel.setOriginalFilename(originalFilename);
            fileDataModel.setReference(reference);
            fileDataModel.setAcceptedAs(acceptedAs);
            fileDataModel.setDescription(description);
            return fileDataModel;
        }
    }
}
