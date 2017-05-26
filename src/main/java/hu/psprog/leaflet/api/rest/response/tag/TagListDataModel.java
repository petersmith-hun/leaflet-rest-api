package hu.psprog.leaflet.api.rest.response.tag;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

import java.util.LinkedList;
import java.util.List;

/**
 * Response data model for list of tags.
 *
 * @author Peter Smith
 */
public class TagListDataModel extends BaseBodyDataModel {

    private List<TagDataModel> tags;

    public List<TagDataModel> getTags() {
        return tags;
    }

    public void setTags(List<TagDataModel> tags) {
        this.tags = tags;
    }


    public static final class Builder {
        private List<TagDataModel> tags;

        private Builder() {
            this.tags = new LinkedList<>();
        }

        public static Builder getBuilder() {
            return new Builder();
        }

        public Builder withItem(TagDataModel tag) {
            this.tags.add(tag);
            return this;
        }

        public TagListDataModel build() {
            TagListDataModel tagListDataModel = new TagListDataModel();
            tagListDataModel.setTags(tags);
            return tagListDataModel;
        }
    }
}
