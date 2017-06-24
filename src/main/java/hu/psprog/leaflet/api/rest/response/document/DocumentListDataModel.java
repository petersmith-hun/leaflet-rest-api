package hu.psprog.leaflet.api.rest.response.document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.LinkedList;
import java.util.List;

/**
 * Response data model for list of documents.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = DocumentListDataModel.DocumentListDataModelBuilder.class)
public class DocumentListDataModel extends BaseBodyDataModel {

    private List<EditDocumentDataModel> documents;

    public List<EditDocumentDataModel> getDocuments() {
        return documents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof DocumentListDataModel)) return false;

        DocumentListDataModel that = (DocumentListDataModel) o;

        return new EqualsBuilder()
                .append(documents, that.documents)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(documents)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("documents", documents)
                .toString();
    }

    public static DocumentListDataModelBuilder getBuilder() {
        return new DocumentListDataModelBuilder();
    }

    public static final class DocumentListDataModelBuilder {
        private List<EditDocumentDataModel> documents;

        private DocumentListDataModelBuilder() {
            documents = new LinkedList<>();
        }

        public DocumentListDataModelBuilder withItem(EditDocumentDataModel document) {
            this.documents.add(document);
            return this;
        }

        public DocumentListDataModel build() {
            DocumentListDataModel documentListDataModel = new DocumentListDataModel();
            documentListDataModel.documents = documents;
            return documentListDataModel;
        }
    }
}
