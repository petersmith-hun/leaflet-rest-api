package hu.psprog.leaflet.api.rest.response.entry;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Response data model for list of entries for a search request.
 * Instead of the simple entry data model, it contains a list of {@link EditEntryDataModel} objects, containing
 * more information about each entry.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = EntrySearchResultDataModel.EntrySearchResultDataModelBuilder.class)
public class EntrySearchResultDataModel extends BaseBodyDataModel {

    private List<EditEntryDataModel> entries;

    public List<EditEntryDataModel> getEntries() {
        return entries;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EntrySearchResultDataModel that = (EntrySearchResultDataModel) o;

        return new EqualsBuilder()
                .append(entries, that.entries)
                .isEquals();
    }

    @Override
    public int hashCode() {

        return new HashCodeBuilder(17, 37)
                .append(entries)
                .toHashCode();
    }

    @Override
    public String toString() {

        return new ToStringBuilder(this)
                .append("entries", entries)
                .toString();
    }

    public static EntrySearchResultDataModelBuilder getBuilder() {
        return new EntrySearchResultDataModelBuilder();
    }

    public static final class EntrySearchResultDataModelBuilder {

        private List<EditEntryDataModel> entries;

        private EntrySearchResultDataModelBuilder() {
        }

        public EntrySearchResultDataModelBuilder withEntries(List<EditEntryDataModel> entries) {
            this.entries = entries;
            return this;
        }

        public EntrySearchResultDataModel build() {
            EntrySearchResultDataModel entrySearchResultDataModel = new EntrySearchResultDataModel();
            entrySearchResultDataModel.entries = this.entries;
            return entrySearchResultDataModel;
        }
    }
}
