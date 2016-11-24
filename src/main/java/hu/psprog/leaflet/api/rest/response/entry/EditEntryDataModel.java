package hu.psprog.leaflet.api.rest.response.entry;

/**
 * Response data model for entry editor returning RAW_CONTENT instead of rendered content.
 *
 * @author Peter Smith
 */
public class EditEntryDataModel extends EntryDataModel {

    private static final String RAW_CONTENT = "rawContent";
    private static final String LAST_MODIFIED = "lastModified";

    private EditEntryDataModel() {
        // prevent direct initialization
    }

    public static class Builder extends EntryDataModel.Builder {

        public Builder withRawContent(String rawContent) {
            entryDataModel.addSingleNode(RAW_CONTENT, rawContent);
            return this;
        }

        public Builder withLastModified(String lastModified) {
            entryDataModel.addSingleNode(LAST_MODIFIED, lastModified);
            return this;
        }
    }
}
