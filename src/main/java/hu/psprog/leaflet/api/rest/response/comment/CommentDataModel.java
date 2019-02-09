package hu.psprog.leaflet.api.rest.response.comment;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.ZonedDateTime;

/**
 * Response data model for comments.
 * 
 * @author Peter Smith
 */
public class CommentDataModel extends BaseBodyDataModel {

    private Long id;
    private UserDataModel owner;
    private String content;
    private ZonedDateTime created;
    private ZonedDateTime lastModified;
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

    public ZonedDateTime getCreated() {
        return created;
    }

    public void setCreated(ZonedDateTime created) {
        this.created = created;
    }

    public ZonedDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(ZonedDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof CommentDataModel)) return false;

        CommentDataModel that = (CommentDataModel) o;

        return new EqualsBuilder()
                .append(deleted, that.deleted)
                .append(id, that.id)
                .append(owner, that.owner)
                .append(content, that.content)
                .append(created, that.created)
                .append(lastModified, that.lastModified)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(owner)
                .append(content)
                .append(created)
                .append(lastModified)
                .append(deleted)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("owner", owner)
                .append("content", content)
                .append("created", created)
                .append("lastModified", lastModified)
                .append("deleted", deleted)
                .toString();
    }

    public static CommentDataModelBuilder getBuilder() {
        return new CommentDataModelBuilder();
    }

    public static final class CommentDataModelBuilder {
        private Long id;
        private UserDataModel owner;
        private String content;
        private ZonedDateTime created;
        private ZonedDateTime lastModified;
        private boolean deleted;

        private CommentDataModelBuilder() {
        }

        public CommentDataModelBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public CommentDataModelBuilder withOwner(UserDataModel owner) {
            this.owner = owner;
            return this;
        }

        public CommentDataModelBuilder withContent(String content) {
            this.content = content;
            return this;
        }

        public CommentDataModelBuilder withCreated(ZonedDateTime created) {
            this.created = created;
            return this;
        }

        public CommentDataModelBuilder withLastModified(ZonedDateTime lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public CommentDataModelBuilder withDeleted(boolean deleted) {
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
