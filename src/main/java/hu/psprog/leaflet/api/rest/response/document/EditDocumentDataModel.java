package hu.psprog.leaflet.api.rest.response.document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.ZonedDateTime;

/**
 * Response data model for document editor returning RAW_CONTENT instead of rendered content.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = EditDocumentDataModel.EditDocumentDataModelBuilder.class)
public class EditDocumentDataModel extends DocumentDataModel {

    private ZonedDateTime lastModified;
    private boolean enabled;

    public ZonedDateTime getLastModified() {
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
                .append(lastModified, that.lastModified)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
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
                .append("user", user)
                .append("created", created)
                .append("locale", locale)
                .toString();
    }

    public static EditDocumentDataModelBuilder getExtendedBuilder() {
        return new EditDocumentDataModelBuilder();
    }

    public static final class EditDocumentDataModelBuilder {
        protected long id;
        protected String title;
        protected String link;
        protected UserDataModel user;
        protected ZonedDateTime created;
        protected String locale;
        private String rawContent;
        private ZonedDateTime lastModified;
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

        public EditDocumentDataModelBuilder withLastModified(ZonedDateTime lastModified) {
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

        public EditDocumentDataModelBuilder withUser(UserDataModel user) {
            this.user = user;
            return this;
        }

        public EditDocumentDataModelBuilder withCreated(ZonedDateTime created) {
            this.created = created;
            return this;
        }

        public EditDocumentDataModelBuilder withLocale(String locale) {
            this.locale = locale;
            return this;
        }

        public EditDocumentDataModel build() {
            EditDocumentDataModel editDocumentDataModel = new EditDocumentDataModel();
            editDocumentDataModel.enabled = this.enabled;
            editDocumentDataModel.rawContent = this.rawContent;
            editDocumentDataModel.link = this.link;
            editDocumentDataModel.created = this.created;
            editDocumentDataModel.lastModified = this.lastModified;
            editDocumentDataModel.id = this.id;
            editDocumentDataModel.title = this.title;
            editDocumentDataModel.user = this.user;
            editDocumentDataModel.locale = this.locale;
            return editDocumentDataModel;
        }
    }
}
