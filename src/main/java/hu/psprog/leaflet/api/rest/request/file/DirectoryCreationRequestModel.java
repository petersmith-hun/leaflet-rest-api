package hu.psprog.leaflet.api.rest.request.file;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Request model for creating a new directory.
 *
 * @author Peter Smith
 */
public class DirectoryCreationRequestModel implements Serializable {

    @NotEmpty
    @Size(max = 255)
    private String parent;

    @NotEmpty
    @Size(max = 255)
    private String name;

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        DirectoryCreationRequestModel that = (DirectoryCreationRequestModel) o;

        return new EqualsBuilder()
                .append(parent, that.parent)
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(parent)
                .append(name)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("parent", parent)
                .append("name", name)
                .toString();
    }
}
