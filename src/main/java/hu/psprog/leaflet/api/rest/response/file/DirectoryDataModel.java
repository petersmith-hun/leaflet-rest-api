package hu.psprog.leaflet.api.rest.response.file;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Response data model for directory meta information.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = DirectoryDataModel.DirectoryDataModelBuilder.class)
public class DirectoryDataModel extends BaseBodyDataModel {

    private String id;
    private String root;
    private List<String> children;
    private List<String> acceptableMimeTypes;

    public String getId() {
        return id;
    }

    public String getRoot() {
        return root;
    }

    public List<String> getChildren() {
        return children;
    }

    public List<String> getAcceptableMimeTypes() {
        return acceptableMimeTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        DirectoryDataModel that = (DirectoryDataModel) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(root, that.root)
                .append(children, that.children)
                .append(acceptableMimeTypes, that.acceptableMimeTypes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(root)
                .append(children)
                .append(acceptableMimeTypes)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("root", root)
                .append("children", children)
                .append("acceptableMimeTypes", acceptableMimeTypes)
                .toString();
    }

    public static DirectoryDataModelBuilder getBuilder() {
        return new DirectoryDataModelBuilder();
    }

    /**
     * Builder for {@link DirectoryDataModel}.
     */
    public static final class DirectoryDataModelBuilder {
        private String id;
        private String root;
        private List<String> children;
        private List<String> acceptableMimeTypes;

        private DirectoryDataModelBuilder() {
        }

        public DirectoryDataModelBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public DirectoryDataModelBuilder withRoot(String root) {
            this.root = root;
            return this;
        }

        public DirectoryDataModelBuilder withChildren(List<String> children) {
            this.children = children;
            return this;
        }

        public DirectoryDataModelBuilder withAcceptableMimeTypes(List<String> acceptableMimeTypes) {
            this.acceptableMimeTypes = acceptableMimeTypes;
            return this;
        }

        public DirectoryDataModel build() {
            DirectoryDataModel directoryDataModel = new DirectoryDataModel();
            directoryDataModel.children = this.children;
            directoryDataModel.id = this.id;
            directoryDataModel.root = this.root;
            directoryDataModel.acceptableMimeTypes = this.acceptableMimeTypes;
            return directoryDataModel;
        }
    }
}
