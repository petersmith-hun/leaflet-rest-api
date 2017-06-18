package hu.psprog.leaflet.api.rest.response.comment;

import hu.psprog.leaflet.api.rest.response.entry.EntryDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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

    public EntryDataModel getAssociatedEntry() {
        return associatedEntry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof ExtendedCommentDataModel)) return false;

        ExtendedCommentDataModel that = (ExtendedCommentDataModel) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(enabled, that.enabled)
                .append(associatedEntry, that.associatedEntry)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(enabled)
                .append(associatedEntry)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("enabled", enabled)
                .append("associatedEntry", associatedEntry)
                .append("id", getId())
                .append("owner", getOwner())
                .append("content", getContent())
                .append("created", getCreated())
                .append("lastModified", getLastModified())
                .append("deleted", isDeleted())
                .toString();
    }

    public static ExtendedCommentDataModelBuilder getExtendedBuilder() {
        return new ExtendedCommentDataModelBuilder();
    }

    public static final class ExtendedCommentDataModelBuilder {
        private boolean enabled;
        private EntryDataModel associatedEntry;
        private Long id;
        private UserDataModel owner;
        private String content;
        private String created;
        private String lastModified;
        private boolean deleted;

        private ExtendedCommentDataModelBuilder() {
        }

        public ExtendedCommentDataModelBuilder withEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public ExtendedCommentDataModelBuilder withAssociatedEntry(EntryDataModel associatedEntry) {
            this.associatedEntry = associatedEntry;
            return this;
        }

        public ExtendedCommentDataModelBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public ExtendedCommentDataModelBuilder withOwner(UserDataModel owner) {
            this.owner = owner;
            return this;
        }

        public ExtendedCommentDataModelBuilder withContent(String content) {
            this.content = content;
            return this;
        }

        public ExtendedCommentDataModelBuilder withCreated(String created) {
            this.created = created;
            return this;
        }

        public ExtendedCommentDataModelBuilder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public ExtendedCommentDataModelBuilder withDeleted(boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        public ExtendedCommentDataModel build() {
            ExtendedCommentDataModel extendedCommentDataModel = new ExtendedCommentDataModel();
            extendedCommentDataModel.setId(id);
            extendedCommentDataModel.setOwner(owner);
            extendedCommentDataModel.setContent(content);
            extendedCommentDataModel.setCreated(created);
            extendedCommentDataModel.setLastModified(lastModified);
            extendedCommentDataModel.setDeleted(deleted);
            extendedCommentDataModel.enabled = this.enabled;
            extendedCommentDataModel.associatedEntry = this.associatedEntry;
            return extendedCommentDataModel;
        }
    }
}
