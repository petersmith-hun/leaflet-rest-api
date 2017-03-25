package hu.psprog.leaflet.api.rest.response.comment;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;

/**
 * Response data model for comments.
 * 
 * @author Peter Smith
 */
public class CommentDataModel extends BaseBodyDataModel {

    private Long id;
    private UserDataModel owner;
    private String content;
    private String created;
    private String lastModified;
    private boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDataModel getOwner() {
        return owner;
    }

    public void setOwner(UserDataModel owner) {
        this.owner = owner;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public static final class Builder {
        private Long id;
        private UserDataModel owner;
        private String content;
        private String created;
        private String lastModified;
        private boolean deleted;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withOwner(UserDataModel owner) {
            this.owner = owner;
            return this;
        }

        public Builder withContent(String content) {
            this.content = content;
            return this;
        }

        public Builder withCreated(String created) {
            this.created = created;
            return this;
        }

        public Builder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public Builder withDeleted(boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        public CommentDataModel build() {
            CommentDataModel commentDataModel = new CommentDataModel();
            commentDataModel.setId(id);
            commentDataModel.setOwner(owner);
            commentDataModel.setContent(content);
            commentDataModel.setCreated(created);
            commentDataModel.setLastModified(lastModified);
            commentDataModel.setDeleted(deleted);
            return commentDataModel;
        }
    }
}
