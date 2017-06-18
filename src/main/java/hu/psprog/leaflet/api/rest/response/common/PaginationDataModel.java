package hu.psprog.leaflet.api.rest.response.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Pagination parameter data model.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = PaginationDataModel.PaginationDataModelBuilder.class)
public class PaginationDataModel extends BaseBodyDataModel {

    private long entityCount;
    private int pageCount;
    private int pageNumber;
    private int entityCountOnPage;
    private boolean isFirst;
    private boolean isLast;
    private boolean hasNext;
    private boolean hasPrevious;

    public long getEntityCount() {
        return entityCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getEntityCountOnPage() {
        return entityCountOnPage;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public boolean isLast() {
        return isLast;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public boolean isHasPrevious() {
        return hasPrevious;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof PaginationDataModel)) return false;

        PaginationDataModel that = (PaginationDataModel) o;

        return new EqualsBuilder()
                .append(entityCount, that.entityCount)
                .append(pageCount, that.pageCount)
                .append(pageNumber, that.pageNumber)
                .append(entityCountOnPage, that.entityCountOnPage)
                .append(isFirst, that.isFirst)
                .append(isLast, that.isLast)
                .append(hasNext, that.hasNext)
                .append(hasPrevious, that.hasPrevious)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(entityCount)
                .append(pageCount)
                .append(pageNumber)
                .append(entityCountOnPage)
                .append(isFirst)
                .append(isLast)
                .append(hasNext)
                .append(hasPrevious)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("entityCount", entityCount)
                .append("pageCount", pageCount)
                .append("pageNumber", pageNumber)
                .append("entityCountOnPage", entityCountOnPage)
                .append("isFirst", isFirst)
                .append("isLast", isLast)
                .append("hasNext", hasNext)
                .append("hasPrevious", hasPrevious)
                .toString();
    }

    public static PaginationDataModelBuilder getBuilder() {
        return new PaginationDataModelBuilder();
    }

    public static final class PaginationDataModelBuilder {
        private long entityCount;
        private int pageCount;
        private int pageNumber;
        private int entityCountOnPage;
        private boolean isFirst;
        private boolean isLast;
        private boolean hasNext;
        private boolean hasPrevious;

        private PaginationDataModelBuilder() {
        }

        public PaginationDataModelBuilder withEntityCount(long entityCount) {
            this.entityCount = entityCount;
            return this;
        }

        public PaginationDataModelBuilder withPageCount(int pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        public PaginationDataModelBuilder withPageNumber(int pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        public PaginationDataModelBuilder withEntityCountOnPage(int entityCountOnPage) {
            this.entityCountOnPage = entityCountOnPage;
            return this;
        }

        public PaginationDataModelBuilder withIsFirst(boolean isFirst) {
            this.isFirst = isFirst;
            return this;
        }

        public PaginationDataModelBuilder withIsLast(boolean isLast) {
            this.isLast = isLast;
            return this;
        }

        public PaginationDataModelBuilder withHasNext(boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }

        public PaginationDataModelBuilder withHasPrevious(boolean hasPrevious) {
            this.hasPrevious = hasPrevious;
            return this;
        }

        public PaginationDataModel build() {
            PaginationDataModel paginationDataModel = new PaginationDataModel();
            paginationDataModel.pageCount = this.pageCount;
            paginationDataModel.isLast = this.isLast;
            paginationDataModel.isFirst = this.isFirst;
            paginationDataModel.hasPrevious = this.hasPrevious;
            paginationDataModel.entityCount = this.entityCount;
            paginationDataModel.entityCountOnPage = this.entityCountOnPage;
            paginationDataModel.pageNumber = this.pageNumber;
            paginationDataModel.hasNext = this.hasNext;
            return paginationDataModel;
        }
    }
}
