package hu.psprog.leaflet.api.rest.response.file;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

import java.util.LinkedList;
import java.util.List;

/**
 * Response data model for list of files.
 *
 * @author Peter Smith
 */
public class FileListDataModel extends BaseBodyDataModel {

    private List<FileDataModel> files;

    public List<FileDataModel> getFiles() {
        return files;
    }

    public void setFiles(List<FileDataModel> files) {
        this.files = files;
    }

    /**
     * Builder for {@link FileListDataModel}.
     */
    public static final class Builder {
        private List<FileDataModel> files;

        private Builder() {
            files = new LinkedList<>();
        }

        public static Builder getBuilder() {
            return new Builder();
        }

        public Builder withItem(FileDataModel item) {
            this.files.add(item);
            return this;
        }

        public FileListDataModel build() {
            FileListDataModel fileListDataModel = new FileListDataModel();
            fileListDataModel.setFiles(files);
            return fileListDataModel;
        }
    }
}
