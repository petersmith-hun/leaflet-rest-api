package hu.psprog.leaflet.api.rest.request.entry;

import hu.psprog.leaflet.api.rest.request.common.SEOValuesRequestModel;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Locale;

/**
 * Request model for editing an existing entry.
 *
 * @author Peter Smith
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class EntryUpdateRequestModel extends SEOValuesRequestModel {

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String title;

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String link;

    @NotNull
    @NotEmpty
    private String prologue;

    @NotNull
    @NotEmpty
    private String rawContent;

    @NotNull
    @Min(1)
    private Long categoryID;

    @NotNull
    private Locale locale;

    @NotNull
    private boolean enabled;

    @NotNull
    private EntryInitialStatus status;

}
