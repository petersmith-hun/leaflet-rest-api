package hu.psprog.leaflet.api.rest.response.comment;

import hu.psprog.leaflet.api.rest.response.entry.EntryDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;

/**
 * Extended response data model for comments.
 *
 * @author Peter Smith
 */
public class ExtendedCommentDataModel extends CommentDataModel {

    private boolean enabled;
    private EntryDataModel associatedEntry;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public EntryDataModel getAssociatedEntry() {
        return associatedEntry;
    }

    public void setAssociatedEntry(EntryDataModel associatedEntry) {
        this.associatedEntry = associatedEntry;
    }

    public static final class Builder {
        private boolean enabled;
        private Long id;
        private EntryDataModel associatedEntry;
        private UserDataModel owner;
        private String content;
        private String created;
        private String lastModified;
        private boolean deleted;

        public Builder withEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withAssociatedEntry(EntryDataModel associatedEntry) {
            this.associatedEntry = associatedEntry;
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

        public ExtendedCommentDataModel build() {
            ExtendedCommentDataModel extendedCommentDataModel = new ExtendedCommentDataModel();
            extendedCommentDataModel.setEnabled(enabled);
            extendedCommentDataModel.setId(id);
            extendedCommentDataModel.setAssociatedEntry(associatedEntry);
            extendedCommentDataModel.setOwner(owner);
            extendedCommentDataModel.setContent(content);
            extendedCommentDataModel.setCreated(created);
            extendedCommentDataModel.setLastModified(lastModified);
            extendedCommentDataModel.setDeleted(deleted);
            return extendedCommentDataModel;
        }
    }
}
