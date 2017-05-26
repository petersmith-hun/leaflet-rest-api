package hu.psprog.leaflet.api.rest.request.tag;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Request model for tag creation.
 *
 * @author Peter Smith
 */
public class TagCreateRequestModel implements Serializable {

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String name;

    public TagCreateRequestModel() {
        // Serializable
    }

    public TagCreateRequestModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
