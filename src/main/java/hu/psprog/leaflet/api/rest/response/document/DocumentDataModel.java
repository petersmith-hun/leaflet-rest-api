package hu.psprog.leaflet.api.rest.response.document;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;

/**
 * Response data model for documents.
 *
 * @author Peter Smith
 */
public class DocumentDataModel extends BaseBodyDataModel {

    long id;
    String title;
    String link;
    String content;
    UserDataModel user;
    String created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UserDataModel getUser() {
        return user;
    }

    public void setUser(UserDataModel user) {
        this.user = user;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public static final class Builder {
        private long id;
        private String title;
        private String link;
        private String content;
        private UserDataModel user;
        private String created;

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

        public DocumentDataModel build() {
            DocumentDataModel documentDataModel = new DocumentDataModel();
            documentDataModel.setId(id);
            documentDataModel.setTitle(title);
            documentDataModel.setLink(link);
            documentDataModel.setContent(content);
            documentDataModel.setUser(user);
            documentDataModel.setCreated(created);
            return documentDataModel;
        }
    }
}
