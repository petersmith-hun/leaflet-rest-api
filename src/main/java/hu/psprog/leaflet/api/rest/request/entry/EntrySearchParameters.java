package hu.psprog.leaflet.api.rest.request.entry;

import hu.psprog.leaflet.api.rest.request.common.OrderBy;
import hu.psprog.leaflet.api.rest.request.common.OrderDirection;
import lombok.Data;

import java.util.Optional;

/**
 * Request model class for entry search operation.
 *
 * @author Peter Smith
 */
@Data
public class EntrySearchParameters {

    private Optional<Long> categoryID = Optional.empty();
    private Optional<Boolean> enabled = Optional.empty();
    private Optional<EntryInitialStatus> status = Optional.empty();
    private Optional<String> content = Optional.empty();

    private Optional<OrderBy.Entry> orderBy = Optional.empty();
    private Optional<OrderDirection> orderDirection = Optional.empty();
    private Optional<Integer> limit = Optional.empty();
    private Integer page = 1;

    public void setCategoryID(Long categoryID) {
        this.categoryID = Optional.ofNullable(categoryID);
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = Optional.ofNullable(enabled);
    }

    public void setStatus(EntryInitialStatus status) {
        this.status = Optional.ofNullable(status);
    }

    public void setContent(String content) {
        this.content = Optional.ofNullable(content);
    }

    public void setOrderBy(OrderBy.Entry orderBy) {
        this.orderBy = Optional.ofNullable(orderBy);
    }

    public void setOrderDirection(OrderDirection orderDirection) {
        this.orderDirection = Optional.ofNullable(orderDirection);
    }

    public void setLimit(Integer limit) {
        this.limit = Optional.ofNullable(limit);
    }
}
