package hu.psprog.leaflet.api.rest.request.dcp;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * Request model for creating/updating DCP Store entries.
 *
 * @author Peter Smith
 */
@Data
public class DCPRequestModel implements Serializable {

    @NotNull
    @NotEmpty
    @Size(max = 32)
    private String key;
    private String value;

}
