package hu.psprog.leaflet.api.rest.response.tag;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

/**
 * Response data model for tags.
 *
 * @author Peter Smith
 */
public class TagDataModel extends BaseBodyDataModel {

    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static final class Builder {
        private String title;

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public TagDataModel build() {
            TagDataModel tagDataModel = new TagDataModel();
            tagDataModel.title = this.title;
            return tagDataModel;
        }
    }
}
