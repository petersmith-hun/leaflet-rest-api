package hu.psprog.leaflet.api.rest.request.category;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * Request model for creating a category.
 *
 * @author Peter Smith
 */
@Data
public class CategoryCreateRequestModel implements Serializable {

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String title;

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String description;

}
