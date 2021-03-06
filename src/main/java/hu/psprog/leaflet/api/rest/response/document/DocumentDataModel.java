package hu.psprog.leaflet.api.rest.response.document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import hu.psprog.leaflet.api.rest.response.user.UserDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.ZonedDateTime;

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
    protected String rawContent;
    protected UserDataModel user;
    protected ZonedDateTime created;
    protected String locale;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getRawContent() {
        return rawContent;
    }

    public UserDataModel getUser() {
        return user;
    }

    public ZonedDateTime getCreated() {
        return created;
    }

    public String getLocale() {
        return locale;
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
                .append(rawContent, that.rawContent)
                .append(user, that.user)
                .append(created, that.created)
                .append(locale, that.locale)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(title)
                .append(link)
                .append(rawContent)
                .append(user)
                .append(created)
                .append(locale)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("title", title)
                .append("link", link)
                .append("rawContent", rawContent)
                .append("user", user)
                .append("created", created)
                .append("locale", locale)
                .toString();
    }

    public static DocumentDataModelBuilder getBuilder() {
        return new DocumentDataModelBuilder();
    }

    public static final class DocumentDataModelBuilder {
        protected long id;
        protected String title;
        protected String link;
        protected String rawContent;
        protected UserDataModel user;
        protected ZonedDateTime created;
        protected String locale;

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

        public DocumentDataModelBuilder withRawContent(String rawContent) {
            this.rawContent = rawContent;
            return this;
        }

        public DocumentDataModelBuilder withUser(UserDataModel user) {
            this.user = user;
            return this;
        }

        public DocumentDataModelBuilder withCreated(ZonedDateTime created) {
            this.created = created;
            return this;
        }

        public DocumentDataModelBuilder withLocale(String locale) {
            this.locale = locale;
            return this;
        }

        public DocumentDataModel build() {
            DocumentDataModel documentDataModel = new DocumentDataModel();
            documentDataModel.link = this.link;
            documentDataModel.created = this.created;
            documentDataModel.rawContent = this.rawContent;
            documentDataModel.id = this.id;
            documentDataModel.title = this.title;
            documentDataModel.user = this.user;
            documentDataModel.locale = this.locale;
            return documentDataModel;
        }
    }
}
