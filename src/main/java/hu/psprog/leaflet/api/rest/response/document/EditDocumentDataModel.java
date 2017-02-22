package hu.psprog.leaflet.api.rest.response.document;

import hu.psprog.leaflet.api.rest.response.user.UserDataModel;

/**
 * Response data model for document editor returning RAW_CONTENT instead of rendered content.
 *
 * @author Peter Smith
 */
public class EditDocumentDataModel extends DocumentDataModel {

    private String rawContent;
    private String lastModified;
    private boolean enabled;

    public String getRawContent() {
        return rawContent;
    }

    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public static final class Builder {
        private long id;
        private String title;
        private String link;
        private String content;
        private UserDataModel user;
        private String created;
        private String rawContent;
        private String lastModified;
        private boolean enabled;

        public Builder withRawContent(String rawContent) {
            this.rawContent = rawContent;
            return this;
        }

        public Builder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withLink(String link) {
            this.link = link;
            return this;
        }

        public Builder withContent(String content) {
            this.content = content;
            return this;
        }

        public Builder withUser(UserDataModel user) {
            this.user = user;
            return this;
        }

        public Builder withCreated(String created) {
            this.created = created;
            return this;
        }

        public Builder withEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public EditDocumentDataModel build() {
            EditDocumentDataModel editDocumentDataModel = new EditDocumentDataModel();
            editDocumentDataModel.setRawContent(rawContent);
            editDocumentDataModel.setLastModified(lastModified);
            editDocumentDataModel.setId(id);
            editDocumentDataModel.setTitle(title);
            editDocumentDataModel.setLink(link);
            editDocumentDataModel.setContent(content);
            editDocumentDataModel.setUser(user);
            editDocumentDataModel.setCreated(created);
            editDocumentDataModel.setEnabled(enabled);
            return editDocumentDataModel;
        }
    }
}
