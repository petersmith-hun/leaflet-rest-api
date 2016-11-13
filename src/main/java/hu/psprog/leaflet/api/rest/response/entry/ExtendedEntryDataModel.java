package hu.psprog.leaflet.api.rest.response.entry;

/**
 * Extended response data model for entries.
 *
 * @author Peter Smith
 */
public class ExtendedEntryDataModel extends EntryDataModel {

    private static final String CONTENT = "content";
    private static final String LAST_MODIFIED = "lastModified";

    private ExtendedEntryDataModel() {
        // prevent direct initialization
    }

    public static class Builder extends EntryDataModel.Builder {

        public Builder withContent(String content) {
            entryDataModel.addSingleNode(CONTENT, content);
            return this;
        }

        public Builder withLastModified(String lastModified) {
            entryDataModel.addSingleNode(LAST_MODIFIED, lastModified);
            return this;
        }
    }
}
