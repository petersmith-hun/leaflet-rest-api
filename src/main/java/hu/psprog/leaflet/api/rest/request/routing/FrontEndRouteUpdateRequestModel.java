package hu.psprog.leaflet.api.rest.request.routing;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * Request model for creating new front end route entry.
 *
 * @author Peter Smith
 */
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

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        FrontEndRouteUpdateRequestModel that = (FrontEndRouteUpdateRequestModel) o;

        return new EqualsBuilder()
                .append(routeId, that.routeId)
                .append(sequenceNumber, that.sequenceNumber)
                .append(name, that.name)
                .append(url, that.url)
                .append(type, that.type)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(routeId)
                .append(name)
                .append(url)
                .append(sequenceNumber)
                .append(type)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("routeId", routeId)
                .append("name", name)
                .append("url", url)
                .append("sequenceNumber", sequenceNumber)
                .append("type", type)
                .toString();
    }
}
