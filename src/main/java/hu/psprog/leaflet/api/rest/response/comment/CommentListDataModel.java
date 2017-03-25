package hu.psprog.leaflet.api.rest.response.comment;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

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

    public void setComments(List<CommentDataModel> comments) {
        this.comments = comments;
    }

    public static final class Builder {
        private List<CommentDataModel> comments;

        public Builder() {
            this.comments = new LinkedList<>();
        }

        public Builder withItem(CommentDataModel comment) {
            this.comments.add(comment);
            return this;
        }

        public CommentListDataModel build() {
            CommentListDataModel commentListDataModel = new CommentListDataModel();
            commentListDataModel.setComments(comments);
            return commentListDataModel;
        }
    }
}
