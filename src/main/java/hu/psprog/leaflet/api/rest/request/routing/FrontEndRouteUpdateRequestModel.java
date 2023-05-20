package hu.psprog.leaflet.api.rest.request.routing;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.io.Serializable;

/**
 * Request model for creating new front end route entry.
 *
 * @author Peter Smith
 */
@Data
public class FrontEndRouteUpdateRequestModel implements Serializable {

    @NotEmpty
    private String routeId;

    @NotEmpty
    private String name;

    @NotEmpty
    private String url;

    @Min(0)
    private int sequenceNumber;

    @NotEmpty
    private String type;

    @NotEmpty
    private String authRequirement;

}
