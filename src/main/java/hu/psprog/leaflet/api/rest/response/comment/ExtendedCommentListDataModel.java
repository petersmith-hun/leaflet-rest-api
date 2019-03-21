package hu.psprog.leaflet.api.rest.response.comment;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.LinkedList;
import java.util.List;

/**
 * Response data model for list of comments with extended data.
 *
 * @author Peter Smith
 */
public class ExtendedCommentListDataModel extends BaseBodyDataModel {

    private List<ExtendedCommentDataModel> comments;

    public List<ExtendedCommentDataModel> getComments() {
        return comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ExtendedCommentListDataModel that = (ExtendedCommentListDataModel) o;

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

    public static ExtendedCommentListDataModelBuilder getBuilder() {
        return new ExtendedCommentListDataModelBuilder();
    }

    /**
     * Builder for {@link ExtendedCommentListDataModel}.
     */
    public static final class ExtendedCommentListDataModelBuilder {
        private List<ExtendedCommentDataModel> comments;

        private ExtendedCommentListDataModelBuilder() {
            this.comments = new LinkedList<>();
        }

        public ExtendedCommentListDataModelBuilder withItem(ExtendedCommentDataModel comment) {
            this.comments.add(comment);
            return this;
        }

        public ExtendedCommentListDataModelBuilder withComments(List<ExtendedCommentDataModel> comments) {
            this.comments = comments;
            return this;
        }

        public ExtendedCommentListDataModel build() {
            ExtendedCommentListDataModel extendedCommentListDataModel = new ExtendedCommentListDataModel();
            extendedCommentListDataModel.comments = this.comments;
            return extendedCommentListDataModel;
        }
    }
}
