package hu.psprog.leaflet.api.rest.request.attachment;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;

/**
 * Request model for attachment operations.
 *
 * @author Peter Smith
 */
public class AttachmentRequestModel implements Serializable {

    @NotNull
    @Min(1)
    private Long entryID;

    @NotNull
    private UUID pathUUID;

    public Long getEntryID() {
        return entryID;
    }

    public void setEntryID(Long entryID) {
        this.entryID = entryID;
    }

    public UUID getPathUUID() {
        return pathUUID;
    }

    public void setPathUUID(UUID pathUUID) {
        this.pathUUID = pathUUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        AttachmentRequestModel that = (AttachmentRequestModel) o;

        return new EqualsBuilder()
                .append(entryID, that.entryID)
                .append(pathUUID, that.pathUUID)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(entryID)
                .append(pathUUID)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("entryID", entryID)
                .append("pathUUID", pathUUID)
                .toString();
    }
}
