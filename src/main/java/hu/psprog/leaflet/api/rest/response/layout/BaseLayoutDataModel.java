package hu.psprog.leaflet.api.rest.response.layout;

import hu.psprog.leaflet.api.rest.common.BaseBodyDataModel;

/**
 * @author Peter Smith
 */
public class BaseLayoutDataModel extends BaseBodyDataModel {

    private static final String HEADER = "header"; // for SEO, locale, timezone, etc.
    private static final String MENU = "menu";
    private static final String BODY = "body";
    private static final String ERROR = "errors"; // any validation error messages, exceptions, etc. (type VALIDATION/EXCEPTION + message maybe?)
    private static final String FOOTER = "footer"; // anything that should be in footer

    public static class Builder {

        protected BaseLayoutDataModel baseLayoutDataModel;

        public Builder() {
            baseLayoutDataModel = new BaseLayoutDataModel();
        }

        public Builder withMenu(String menuItem) {
            baseLayoutDataModel.addSingleNode(MENU, menuItem);
            return this;
        }

        public Builder withBody(BaseLayoutDataModel body) {
            baseLayoutDataModel.addSingleNode(BODY, body);
            return this;
        }

        public BaseLayoutDataModel build() {
            return baseLayoutDataModel;
        }
    }
}
