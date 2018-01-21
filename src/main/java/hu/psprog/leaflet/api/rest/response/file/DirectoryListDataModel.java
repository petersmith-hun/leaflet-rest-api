package hu.psprog.leaflet.api.rest.response.file;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.LinkedList;
import java.util.List;

/**
 * Response data model for list of directories.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = DirectoryListDataModel.DirectoryListDataModelBuilder.class)
public class DirectoryListDataModel extends BaseBodyDataModel {

    private List<DirectoryDataModel> acceptors;

    public List<DirectoryDataModel> getAcceptors() {
        return acceptors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        DirectoryListDataModel that = (DirectoryListDataModel) o;

        return new EqualsBuilder()
                .append(acceptors, that.acceptors)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(acceptors)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("acceptors", acceptors)
                .toString();
    }

    public static DirectoryListDataModelBuilder getBuilder() {
        return new DirectoryListDataModelBuilder();
    }

    /**
     * Builder for {@link DirectoryListDataModel}.
     */
    public static final class DirectoryListDataModelBuilder {
        private List<DirectoryDataModel> acceptors;

        private DirectoryListDataModelBuilder() {
            acceptors = new LinkedList<>();
        }

        public DirectoryListDataModelBuilder withAcceptors(List<DirectoryDataModel> acceptors) {
            this.acceptors = acceptors;
            return this;
        }

        public DirectoryListDataModelBuilder withItem(DirectoryDataModel item) {
            acceptors.add(item);
            return this;
        }

        public DirectoryListDataModel build() {
            DirectoryListDataModel directoryListDataModel = new DirectoryListDataModel();
            directoryListDataModel.acceptors = this.acceptors;
            return directoryListDataModel;
        }
    }
}
