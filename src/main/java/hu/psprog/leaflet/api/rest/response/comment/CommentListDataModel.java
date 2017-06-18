package hu.psprog.leaflet.api.rest.response.comment;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.LinkedList;
import java.util.List;

/**
 * Response data model for list of comments.
 *
 * @author Peter Smith
 */
public class CommentListDataModel extends BaseBodyDataModel {

    private List<CommentDataModel> comments;

    public List<CommentDataModel> getComments() {
        return comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof CommentListDataModel)) return false;

        CommentListDataModel that = (CommentListDataModel) o;

        return new EqualsBuilder()
                .append(comments, that.comments)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(comments)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("comments", comments)
                .toString();
    }

    public static CommentListDataModelBuilder getBuilder() {
        return new CommentListDataModelBuilder();
    }

    public static final class CommentListDataModelBuilder {
        private List<CommentDataModel> comments;

        private CommentListDataModelBuilder() {
            this.comments = new LinkedList<>();
        }

        public CommentListDataModelBuilder withItem(CommentDataModel comment) {
            this.comments.add(comment);
            return this;
        }

        public CommentListDataModel build() {
            CommentListDataModel commentListDataModel = new CommentListDataModel();
            commentListDataModel.comments = comments;
            return commentListDataModel;
        }
    }
}
