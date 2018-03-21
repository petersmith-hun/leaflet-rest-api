package hu.psprog.leaflet.api.rest.response.routing;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.LinkedList;
import java.util.List;

/**
 * Response data model for list of front-end route items containing basic information.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = ExtendedFrontEndRouteListDataModel.ExtendedFrontEndRouteListDataModelBuilder.class)
public class ExtendedFrontEndRouteListDataModel extends FrontEndRouteListDataModel {

    public static ExtendedFrontEndRouteListDataModel.ExtendedFrontEndRouteListDataModelBuilder getExtendedBuilder() {
        return new ExtendedFrontEndRouteListDataModel.ExtendedFrontEndRouteListDataModelBuilder();
    }

    public static final class ExtendedFrontEndRouteListDataModelBuilder {
        private List<ExtendedFrontEndRouteDataModel> routes;

        private ExtendedFrontEndRouteListDataModelBuilder() {
            routes = new LinkedList<>();
        }

        public ExtendedFrontEndRouteListDataModel.ExtendedFrontEndRouteListDataModelBuilder withItem(ExtendedFrontEndRouteDataModel route) {
            this.routes.add(route);
            return this;
        }

        public ExtendedFrontEndRouteListDataModel.ExtendedFrontEndRouteListDataModelBuilder withRoutes(List<ExtendedFrontEndRouteDataModel> routes) {
            this.routes = routes;
            return this;
        }

        public ExtendedFrontEndRouteListDataModel build() {
            ExtendedFrontEndRouteListDataModel frontEndRouteListDataModel = new ExtendedFrontEndRouteListDataModel();
            frontEndRouteListDataModel.routes = this.routes;
            return frontEndRouteListDataModel;
        }
    }
}
