package hu.psprog.leaflet.api.rest.response.entity;

import hu.psprog.leaflet.api.rest.common.BaseBodyDataModel;

/**
 * @author Peter Smith
 */
public final class TagDataModel extends BaseBodyDataModel {

    private static final String TITLE = "title";

    public static class Builder {

        private TagDataModel tagDataModel;

        public Builder() {
            this.tagDataModel = new TagDataModel();
        }

        public Builder withTitle(String title) {
            tagDataModel.addSingleNode(TITLE, title);
            return this;
        }

        public TagDataModel build() {
            return tagDataModel;
        }
    }
}
