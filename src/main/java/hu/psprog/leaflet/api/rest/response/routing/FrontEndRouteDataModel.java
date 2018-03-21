package hu.psprog.leaflet.api.rest.response.routing;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response data model for basic front-end route information.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = FrontEndRouteDataModel.FrontEndRouteDataModelBuilder.class)
public class FrontEndRouteDataModel extends BaseBodyDataModel {

    protected String routeId;
    protected String name;
    protected String url;

    public String getRouteId() {
        return routeId;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        FrontEndRouteDataModel that = (FrontEndRouteDataModel) o;

        return new EqualsBuilder()
                .append(routeId, that.routeId)
                .append(name, that.name)
                .append(url, that.url)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(routeId)
                .append(name)
                .append(url)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("routeId", routeId)
                .append("name", name)
                .append("url", url)
                .toString();
    }

    public static FrontEndRouteDataModelBuilder getBuilder() {
        return new FrontEndRouteDataModelBuilder();
    }

    /**
     * Builder for {@link FrontEndRouteDataModel}.
     */
    public static final class FrontEndRouteDataModelBuilder {
        private String routeId;
        private String name;
        private String url;

        private FrontEndRouteDataModelBuilder() {
        }

        public FrontEndRouteDataModelBuilder withRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }

        public FrontEndRouteDataModelBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public FrontEndRouteDataModelBuilder withUrl(String url) {
            this.url = url;
            return this;
        }

        public FrontEndRouteDataModel build() {
            FrontEndRouteDataModel frontEndRouteDataModel = new FrontEndRouteDataModel();
            frontEndRouteDataModel.routeId = this.routeId;
            frontEndRouteDataModel.name = this.name;
            frontEndRouteDataModel.url = this.url;
            return frontEndRouteDataModel;
        }
    }
}
