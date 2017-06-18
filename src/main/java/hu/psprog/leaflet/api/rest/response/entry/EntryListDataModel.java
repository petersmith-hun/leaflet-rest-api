package hu.psprog.leaflet.api.rest.response.entry;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.LinkedList;
import java.util.List;

/**
 * Response data model for list of entries.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = EntryListDataModel.EntryListDataModelBuilder.class)
public class EntryListDataModel extends BaseBodyDataModel {

    private List<EntryDataModel> entries;

    public List<EntryDataModel> getEntries() {
        return entries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof EntryListDataModel)) return false;

        EntryListDataModel that = (EntryListDataModel) o;

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

    public static EntryListDataModelBuilder getBuilder() {
        return new EntryListDataModelBuilder();
    }

    public static final class EntryListDataModelBuilder {
        private List<EntryDataModel> entries;

        private EntryListDataModelBuilder() {
            entries = new LinkedList<>();
        }

        public EntryListDataModelBuilder withItem(EntryDataModel entry) {
            this.entries.add(entry);
            return this;
        }

        public EntryListDataModel build() {
            EntryListDataModel entryListDataModel = new EntryListDataModel();
            entryListDataModel.entries = entries;
            return entryListDataModel;
        }
    }
}
