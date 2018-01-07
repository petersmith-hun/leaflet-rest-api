package hu.psprog.leaflet.api.rest.request.file;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Request model for file uploads.
 *
 * @author Peter Smith
 */
public class FileUploadRequestModel implements Serializable {

    @NotNull
    private MultipartFile inputFile;

    @Size(max = 255)
    private String subFolder;

    @Size(max = 255)
    private String description;

    public MultipartFile getInputFile() {
        return inputFile;
    }

    public void setInputFile(MultipartFile inputFile) {
        this.inputFile = inputFile;
    }

    public String getSubFolder() {
        return subFolder;
    }

    public void setSubFolder(String subFolder) {
        this.subFolder = subFolder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        FileUploadRequestModel that = (FileUploadRequestModel) o;

        return new EqualsBuilder()
                .append(inputFile, that.inputFile)
                .append(subFolder, that.subFolder)
                .append(description, that.description)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(inputFile)
                .append(subFolder)
                .append(description)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("inputFile", inputFile)
                .append("subFolder", subFolder)
                .append("description", description)
                .toString();
    }
}
