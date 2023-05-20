package hu.psprog.leaflet.api.rest.request.tag;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * Request model for tag creation.
 *
 * @author Peter Smith
 */
@Data
public class TagCreateRequestModel implements Serializable {

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String name;

}
