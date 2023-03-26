package hu.psprog.leaflet.api.rest.request.entry;

import hu.psprog.leaflet.api.rest.request.common.OrderBy;
import hu.psprog.leaflet.api.rest.request.common.OrderDirection;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Optional;

/**
 * Request model class for entry search operation.
 *
 * @author Peter Smith
 */
public class EntrySearchParameters {

    private Optional<Long> categoryID = Optional.empty();
    private Optional<Boolean> enabled = Optional.empty();
    private Optional<EntryInitialStatus> status = Optional.empty();
    private Optional<String> content = Optional.empty();

    private Optional<OrderBy.Entry> orderBy = Optional.empty();
    private Optional<OrderDirection> orderDirection = Optional.empty();
    private Optional<Integer> limit = Optional.empty();
    private Integer page = 1;

    public Optional<Long> getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = Optional.ofNullable(categoryID);
    }

    public Optional<Boolean> getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = Optional.ofNullable(enabled);
    }

    public Optional<EntryInitialStatus> getStatus() {
        return status;
    }

    public void setStatus(EntryInitialStatus status) {
        this.status = Optional.ofNullable(status);
    }

    public Optional<String> getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = Optional.ofNullable(content);
    }

    public Optional<OrderBy.Entry> getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderBy.Entry orderBy) {
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

        EntrySearchParameters that = (EntrySearchParameters) o;

        return new EqualsBuilder()
                .append(categoryID, that.categoryID)
                .append(enabled, that.enabled)
                .append(status, that.status)
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
                .append(categoryID)
                .append(enabled)
                .append(status)
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
                .append("categoryID", categoryID)
                .append("enabled", enabled)
                .append("status", status)
                .append("content", content)
                .append("orderBy", orderBy)
                .append("orderDirection", orderDirection)
                .append("limit", limit)
                .append("page", page)
                .toString();
    }
}
