package hu.psprog.leaflet.api.rest.response.routing;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.ZonedDateTime;

/**
 * Response data model for extended front-end route information.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = ExtendedFrontEndRouteDataModel.ExtendedFrontEndRouteDataModelBuilder.class)
public class ExtendedFrontEndRouteDataModel extends FrontEndRouteDataModel {

    private long id;
    private int sequenceNumber;
    private String type;
    private ZonedDateTime created;
    private ZonedDateTime lastModified;
    private boolean enabled;

    public long getId() {
        return id;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public String getType() {
        return type;
    }

    public ZonedDateTime getCreated() {
        return created;
    }

    public ZonedDateTime getLastModified() {
        return lastModified;
    }

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ExtendedFrontEndRouteDataModel that = (ExtendedFrontEndRouteDataModel) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(id, that.id)
                .append(sequenceNumber, that.sequenceNumber)
                .append(enabled, that.enabled)
                .append(type, that.type)
                .append(created, that.created)
                .append(lastModified, that.lastModified)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(id)
                .append(sequenceNumber)
                .append(type)
                .append(created)
                .append(lastModified)
                .append(enabled)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("sequenceNumber", sequenceNumber)
                .append("type", type)
                .append("created", created)
                .append("lastModified", lastModified)
                .append("enabled", enabled)
                .append("name", name)
                .append("url", url)
                .append("routeId", routeId)
                .toString();
    }

    public static ExtendedFrontEndRouteDataModelBuilder getExtendedBuilder() {
        return new ExtendedFrontEndRouteDataModelBuilder();
    }

    /**
     * Builder for {@link ExtendedFrontEndRouteDataModel}.
     */
    public static final class ExtendedFrontEndRouteDataModelBuilder {
        private String routeId;
        private String name;
        private String url;
        private long id;
        private int sequenceNumber;
        private String type;
        private ZonedDateTime created;
        private ZonedDateTime lastModified;
        private boolean enabled;

        private ExtendedFrontEndRouteDataModelBuilder() {
        }

        public ExtendedFrontEndRouteDataModelBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public ExtendedFrontEndRouteDataModelBuilder withSequenceNumber(int sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
            return this;
        }

        public ExtendedFrontEndRouteDataModelBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public ExtendedFrontEndRouteDataModelBuilder withCreated(ZonedDateTime created) {
            this.created = created;
            return this;
        }

        public ExtendedFrontEndRouteDataModelBuilder withLastModified(ZonedDateTime lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public ExtendedFrontEndRouteDataModelBuilder withEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public ExtendedFrontEndRouteDataModelBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ExtendedFrontEndRouteDataModelBuilder withUrl(String url) {
            this.url = url;
            return this;
        }

        public ExtendedFrontEndRouteDataModelBuilder withRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }

        public ExtendedFrontEndRouteDataModel build() {
            ExtendedFrontEndRouteDataModel extendedFrontEndRouteDataModel = new ExtendedFrontEndRouteDataModel();
            extendedFrontEndRouteDataModel.routeId = this.routeId;
            extendedFrontEndRouteDataModel.name = this.name;
            extendedFrontEndRouteDataModel.lastModified = this.lastModified;
            extendedFrontEndRouteDataModel.url = this.url;
            extendedFrontEndRouteDataModel.id = this.id;
            extendedFrontEndRouteDataModel.type = this.type;
            extendedFrontEndRouteDataModel.sequenceNumber = this.sequenceNumber;
            extendedFrontEndRouteDataModel.created = this.created;
            extendedFrontEndRouteDataModel.enabled = this.enabled;
            return extendedFrontEndRouteDataModel;
        }
    }
}
