package hu.psprog.leaflet.api.rest.request.common;

import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * Common model for models containing custom SEO parameters.
 *
 * @author Peter Smith
 */
@Data
public class SEOValuesRequestModel implements Serializable {

    @Size(max = 255)
    private String metaTitle;

    @Size(max = 4095)
    private String metaDescription;

    @Size(max = 255)
    private String metaKeywords;

}
