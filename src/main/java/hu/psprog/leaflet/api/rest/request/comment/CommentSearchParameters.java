package hu.psprog.leaflet.api.rest.request.comment;

import hu.psprog.leaflet.api.rest.request.common.OrderBy;
import hu.psprog.leaflet.api.rest.request.common.OrderDirection;
import lombok.Data;

import java.util.Optional;

/**
 * Request model class for comment search operation.
 *
 * @author Peter Smith
 */
@Data
public class CommentSearchParameters {

    private Optional<Boolean> enabled = Optional.empty();
    private Optional<Boolean> deleted = Optional.empty();
    private Optional<String> content = Optional.empty();

    private Optional<OrderBy.Comment> orderBy = Optional.empty();
    private Optional<OrderDirection> orderDirection = Optional.empty();
    private Optional<Integer> limit = Optional.empty();
    private Integer page = 1;

    public void setEnabled(Boolean enabled) {
        this.enabled = Optional.ofNullable(enabled);
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = Optional.ofNullable(deleted);
    }

    public void setContent(String content) {
        this.content = Optional.ofNullable(content);
    }

    public void setOrderBy(OrderBy.Comment orderBy) {
        this.orderBy = Optional.ofNullable(orderBy);
    }

    public void setOrderDirection(OrderDirection orderDirection) {
        this.orderDirection = Optional.ofNullable(orderDirection);
    }

    public void setLimit(Integer limit) {
        this.limit = Optional.ofNullable(limit);
    }

}
