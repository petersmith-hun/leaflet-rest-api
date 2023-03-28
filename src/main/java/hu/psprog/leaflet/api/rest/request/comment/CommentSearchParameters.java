package hu.psprog.leaflet.api.rest.request.comment;

import hu.psprog.leaflet.api.rest.request.common.OrderBy;
import hu.psprog.leaflet.api.rest.request.common.OrderDirection;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Optional;

/**
 * Request model class for comment search operation.
 *
 * @author Peter Smith
 */
public class CommentSearchParameters {

    private Optional<Boolean> enabled = Optional.empty();
    private Optional<Boolean> deleted = Optional.empty();
    private Optional<String> content = Optional.empty();

    private Optional<OrderBy.Comment> orderBy = Optional.empty();
    private Optional<OrderDirection> orderDirection = Optional.empty();
    private Optional<Integer> limit = Optional.empty();
    private Integer page = 1;

    public Optional<Boolean> getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = Optional.ofNullable(enabled);
    }

    public Optional<Boolean> getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = Optional.ofNullable(deleted);
    }

    public Optional<String> getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = Optional.ofNullable(content);
    }

    public Optional<OrderBy.Comment> getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderBy.Comment orderBy) {
        this.orderBy = Optional.ofNullable(orderBy);
    }

    public Optional<OrderDirection> getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(OrderDirection orderDirection) {
        this.orderDirection = Optional.ofNullable(orderDirection);
    }

    public Optional<Integer> getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = Optional.ofNullable(limit);
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CommentSearchParameters that = (CommentSearchParameters) o;

        return new EqualsBuilder()
                .append(enabled, that.enabled)
                .append(deleted, that.deleted)
                .append(content, that.content)
                .append(orderBy, that.orderBy)
                .append(orderDirection, that.orderDirection)
                .append(limit, that.limit)
                .append(page, that.page)
                .isEquals();
    }

    @Override
    public int hashCode() {

        return new HashCodeBuilder(17, 37)
                .append(enabled)
                .append(deleted)
                .append(content)
                .append(orderBy)
                .append(orderDirection)
                .append(limit)
                .append(page)
                .toHashCode();
    }

    @Override
    public String toString() {

        return new ToStringBuilder(this)
                .append("enabled", enabled)
                .append("deleted", deleted)
                .append("content", content)
                .append("orderBy", orderBy)
                .append("orderDirection", orderDirection)
                .append("limit", limit)
                .append("page", page)
                .toString();
    }
}
