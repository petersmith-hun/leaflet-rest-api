package hu.psprog.leaflet.api.rest.response.routing;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.LinkedList;
import java.util.List;

/**
 * Response data model for list of front-end route items containing basic information.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = FrontEndRouteListDataModel.FrontEndRouteListDataModelBuilder.class)
public class FrontEndRouteListDataModel extends BaseBodyDataModel {

    protected List<? extends FrontEndRouteDataModel> routes;

    public List<? extends FrontEndRouteDataModel> getRoutes() {
        return routes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        FrontEndRouteListDataModel that = (FrontEndRouteListDataModel) o;

        return new EqualsBuilder()
                .append(routes, that.routes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(routes)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("routes", routes)
                .toString();
    }

    public static FrontEndRouteListDataModelBuilder getBuilder() {
        return new FrontEndRouteListDataModelBuilder();
    }

    public static final class FrontEndRouteListDataModelBuilder {
        private List<FrontEndRouteDataModel> routes;

        private FrontEndRouteListDataModelBuilder() {
            routes = new LinkedList<>();
        }

        public FrontEndRouteListDataModel.FrontEndRouteListDataModelBuilder withItem(FrontEndRouteDataModel route) {
            this.routes.add(route);
            return this;
        }

        public FrontEndRouteListDataModelBuilder withRoutes(List<FrontEndRouteDataModel> routes) {
            this.routes = routes;
            return this;
        }

        public FrontEndRouteListDataModel build() {
            FrontEndRouteListDataModel frontEndRouteListDataModel = new FrontEndRouteListDataModel();
            frontEndRouteListDataModel.routes = this.routes;
            return frontEndRouteListDataModel;
        }
    }
}
