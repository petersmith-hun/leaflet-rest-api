package hu.psprog.leaflet.api.rest.request.file;

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
}
