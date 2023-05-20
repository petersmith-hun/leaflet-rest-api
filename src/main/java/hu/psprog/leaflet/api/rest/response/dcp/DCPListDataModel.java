package hu.psprog.leaflet.api.rest.response.dcp;

import hu.psprog.leaflet.api.rest.response.common.BaseBodyDataModel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

/**
 * Response data model for list of DCP Store entries.
 *
 * @author Peter Smith
 */
@Builder(setterPrefix = "with", builderMethodName = "getBuilder")
@Jacksonized
public record DCPListDataModel(
        List<DCPDataModel> dcpStore
) implements BaseBodyDataModel { }
