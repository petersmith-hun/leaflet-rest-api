package hu.psprog.leaflet.api.rest.response.file;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.LinkedList;
import java.util.List;

/**
 * Response data model for list of files.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = FileListDataModel.FileListDataModelBuilder.class)
public class FileListDataModel extends BaseBodyDataModel {

    private List<FileDataModel> files;

    public List<FileDataModel> getFiles() {
        return files;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof FileListDataModel)) return false;

        FileListDataModel that = (FileListDataModel) o;

        return new EqualsBuilder()
                .append(files, that.files)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(files)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("files", files)
                .toString();
    }

    public static FileListDataModelBuilder getBuilder() {
        return new FileListDataModelBuilder();
    }

    /**
     * Builder for {@link FileListDataModel}.
     */
    public static final class FileListDataModelBuilder {
        private List<FileDataModel> files;

        private FileListDataModelBuilder() {
            files = new LinkedList<>();
        }

        public FileListDataModelBuilder withItem(FileDataModel item) {
            this.files.add(item);
            return this;
        }

        public FileListDataModel build() {
            FileListDataModel fileListDataModel = new FileListDataModel();
            fileListDataModel.files = files;
            return fileListDataModel;
        }
    }
}
