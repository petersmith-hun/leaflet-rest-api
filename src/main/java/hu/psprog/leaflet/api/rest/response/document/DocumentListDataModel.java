package hu.psprog.leaflet.api.rest.response.document;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;

import java.util.LinkedList;
import java.util.List;

/**
 * Response data model for list of documents.
 *
 * @author Peter Smith
 */
public class DocumentListDataModel extends BaseBodyDataModel {

    private List<EditDocumentDataModel> documents;

    public List<EditDocumentDataModel> getDocuments() {
        return documents;
    }

    public void setDocuments(List<EditDocumentDataModel> documents) {
        this.documents = documents;
    }

    public static final class Builder {
        private List<EditDocumentDataModel> documents;

        public Builder() {
            documents = new LinkedList<>();
        }

        public Builder withItem(EditDocumentDataModel document) {
            this.documents.add(document);
            return this;
        }

        public DocumentListDataModel build() {
            DocumentListDataModel documentListDataModel = new DocumentListDataModel();
            documentListDataModel.setDocuments(documents);
            return documentListDataModel;
        }
    }
}
