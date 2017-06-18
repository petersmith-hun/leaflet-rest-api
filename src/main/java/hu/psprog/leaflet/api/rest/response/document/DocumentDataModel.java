package hu.psprog.leaflet.api.rest.response.document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response data model for documents.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = DocumentDataModel.DocumentDataModelBuilder.class)
public class DocumentDataModel extends BaseBodyDataModel {

    protected long id;
    protected String title;
    protected String link;
    protected String content;
    protected UserDataModel user;
    protected String created;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getContent() {
        return content;
    }

    public UserDataModel getUser() {
        return user;
    }

    public String getCreated() {
        return created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof DocumentDataModel)) return false;

        DocumentDataModel that = (DocumentDataModel) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(title, that.title)
                .append(link, that.link)
                .append(content, that.content)
                .append(user, that.user)
                .append(created, that.created)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(title)
                .append(link)
                .append(content)
                .append(user)
                .append(created)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("title", title)
                .append("link", link)
                .append("content", content)
                .append("user", user)
                .append("created", created)
                .toString();
    }

    public static DocumentDataModelBuilder getBuilder() {
        return new DocumentDataModelBuilder();
    }

    public static final class DocumentDataModelBuilder {
        protected long id;
        protected String title;
        protected String link;
        protected String content;
        protected UserDataModel user;
        protected String created;

        private DocumentDataModelBuilder() {
        }

        public DocumentDataModelBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public DocumentDataModelBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public DocumentDataModelBuilder withLink(String link) {
            this.link = link;
            return this;
        }

        public DocumentDataModelBuilder withContent(String content) {
            this.content = content;
            return this;
        }

        public DocumentDataModelBuilder withUser(UserDataModel user) {
            this.user = user;
            return this;
        }

        public DocumentDataModelBuilder withCreated(String created) {
            this.created = created;
            return this;
        }

        public DocumentDataModel build() {
            DocumentDataModel documentDataModel = new DocumentDataModel();
            documentDataModel.link = this.link;
            documentDataModel.created = this.created;
            documentDataModel.content = this.content;
            documentDataModel.id = this.id;
            documentDataModel.title = this.title;
            documentDataModel.user = this.user;
            return documentDataModel;
        }
    }
}
