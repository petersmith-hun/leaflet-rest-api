package hu.psprog.leaflet.api.rest.response.document;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

/**
 * Response data model for list of documents.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record DocumentListDataModel(
        List<EditDocumentDataModel> documents
) implements BaseBodyDataModel { }
