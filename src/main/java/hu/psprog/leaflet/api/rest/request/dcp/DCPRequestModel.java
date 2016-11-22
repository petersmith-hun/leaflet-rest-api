package hu.psprog.leaflet.api.rest.request.dcp;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Request model for creating/updating DCP Store entries.
 *
 * @author Peter Smith
 */
public class DCPRequestModel implements Serializable {

    @NotNull
    @NotEmpty
    @Size(max = 32)
    private String key;
    private String value;

    public DCPRequestModel() {
        // Serializable
    }

    public DCPRequestModel(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
