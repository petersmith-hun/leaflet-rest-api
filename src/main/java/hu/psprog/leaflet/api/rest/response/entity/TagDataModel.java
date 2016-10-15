package hu.psprog.leaflet.api.rest.response.entity;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

/**
 * Response data model for tags.
 *
 * @author Peter Smith
 */
public class TagDataModel extends BaseBodyDataModel {

    private static final String TITLE = "title";

    public TagDataModel() {
        // prevent direct initialization
    }

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
