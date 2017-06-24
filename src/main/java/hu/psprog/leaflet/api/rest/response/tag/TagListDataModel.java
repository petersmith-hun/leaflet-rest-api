package hu.psprog.leaflet.api.rest.response.tag;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.LinkedList;
import java.util.List;

/**
 * Response data model for list of tags.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = TagListDataModel.TagListDataModelBuilder.class)
public class TagListDataModel extends BaseBodyDataModel {

    private List<TagDataModel> tags;

    public List<TagDataModel> getTags() {
        return tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof TagListDataModel)) return false;

        TagListDataModel that = (TagListDataModel) o;

        return new EqualsBuilder()
                .append(tags, that.tags)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(tags)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("tags", tags)
                .toString();
    }

    public static TagListDataModelBuilder getBuilder() {
        return new TagListDataModelBuilder();
    }

    public static final class TagListDataModelBuilder {
        private List<TagDataModel> tags;

        private TagListDataModelBuilder() {
            this.tags = new LinkedList<>();
        }

        public TagListDataModelBuilder withItem(TagDataModel tag) {
            this.tags.add(tag);
            return this;
        }

        public TagListDataModel build() {
            TagListDataModel tagListDataModel = new TagListDataModel();
            tagListDataModel.tags = tags;
            return tagListDataModel;
        }
    }
}
