package hu.psprog.leaflet.api.rest.request.file;

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
    public String toString() {
        return new ToStringBuilder(this)
                .append("parent", parent)
                .append("name", name)
                .toString();
    }
}
