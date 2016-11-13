package hu.psprog.leaflet.api.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import hu.psprog.leaflet.api.rest.response.entry.EntryDataModel;
import hu.psprog.leaflet.api.rest.response.tag.TagDataModel;
import hu.psprog.leaflet.api.rest.response.layout.EntryListLayoutDataModel;
import hu.psprog.leaflet.api.rest.response.user.ExtendedUserDataModel;
import org.junit.Test;

/**
 * Unit tests for model building.
 *
 * @author Peter Smith
 */
public class ModelBuildTest {

    @Test
    public void testModelBuild() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        EntryDataModel entryDataModel = new EntryDataModel.Builder()
                .withTitle("teszt bejegyzes")
                .withTag(new TagDataModel.Builder()
                        .withTitle("teszt tag 1")
                        .build())
                .withTag(new TagDataModel.Builder()
                        .withTitle("teszt tag 2")
                        .build())
                .withOwner(new ExtendedUserDataModel.Builder()
                        .withCreated("2016-10-11")
                        .withLastLogin("2016-10-12")
                        .withEmail("teszt@teszt.com")
                        .withLocale("EN")
                        .withRole("USER")
                        .withID(1L)
                        .withUsername("Tesztnyuzer")
                        .build())
                .build();

        BaseBodyDataModel entryListLayoutDataModel = new EntryListLayoutDataModel.Builder()
                .withEntry(entryDataModel)
                .build();

        String result = objectMapper.writeValueAsString(entryListLayoutDataModel);
        System.out.println(result);
    }
}
