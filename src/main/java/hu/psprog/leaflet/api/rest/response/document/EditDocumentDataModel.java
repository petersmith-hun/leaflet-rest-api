package hu.psprog.leaflet.api.rest.response.document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response data model for document editor returning RAW_CONTENT instead of rendered content.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = EditDocumentDataModel.EditDocumentDataModelBuilder.class)
public class EditDocumentDataModel extends DocumentDataModel {

    private String rawContent;
    private String lastModified;
    private boolean enabled;

    public String getRawContent() {
        return rawContent;
    }

    public String getLastModified() {
        return lastModified;
    }

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof EditDocumentDataModel)) return false;

        EditDocumentDataModel that = (EditDocumentDataModel) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(enabled, that.enabled)
                .append(rawContent, that.rawContent)
                .append(lastModified, that.lastModified)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(rawContent)
                .append(lastModified)
                .append(enabled)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("rawContent", rawContent)
                .append("lastModified", lastModified)
                .append("enabled", enabled)
                .append("id", id)
                .append("title", title)
                .append("link", link)
                .append("content", content)
                .append("user", user)
                .append("created", created)
                .toString();
    }

    public static EditDocumentDataModelBuilder getExtendedBuilder() {
        return new EditDocumentDataModelBuilder();
    }

    public static final class EditDocumentDataModelBuilder {
        protected long id;
        protected String title;
        protected String link;
        protected String content;
        protected UserDataModel user;
        protected String created;
        private String rawContent;
        private String lastModified;
        private boolean enabled;

        private EditDocumentDataModelBuilder() {
        }

        public EditDocumentDataModelBuilder withRawContent(String rawContent) {
            this.rawContent = rawContent;
            return this;
        }

        public EditDocumentDataModelBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public EditDocumentDataModelBuilder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public EditDocumentDataModelBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public EditDocumentDataModelBuilder withLink(String link) {
            this.link = link;
            return this;
        }

        public EditDocumentDataModelBuilder withEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public EditDocumentDataModelBuilder withContent(String content) {
            this.content = content;
            return this;
        }

        public EditDocumentDataModelBuilder withUser(UserDataModel user) {
            this.user = user;
            return this;
        }

        public EditDocumentDataModelBuilder withCreated(String created) {
            this.created = created;
            return this;
        }

        public EditDocumentDataModel build() {
            EditDocumentDataModel editDocumentDataModel = new EditDocumentDataModel();
            editDocumentDataModel.enabled = this.enabled;
            editDocumentDataModel.rawContent = this.rawContent;
            editDocumentDataModel.link = this.link;
            editDocumentDataModel.created = this.created;
            editDocumentDataModel.content = this.content;
            editDocumentDataModel.lastModified = this.lastModified;
            editDocumentDataModel.id = this.id;
            editDocumentDataModel.title = this.title;
            editDocumentDataModel.user = this.user;
            return editDocumentDataModel;
        }
    }
}
