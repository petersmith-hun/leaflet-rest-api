package hu.psprog.leaflet.api.rest.request.file;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Request model for updating file meta information.
 *
 * @author Peter Smith
 */
public class UpdateFileMetaInfoRequestModel implements Serializable {

    @NotEmpty
    @Size(max = 255)
    private String originalFilename;

    @Size(max = 255)
    private String description;

    public String getOriginalFilename() {
        return originalFilename;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("originalFilename", originalFilename)
                .append("description", description)
                .toString();
    }
}
