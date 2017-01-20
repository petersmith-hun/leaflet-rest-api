package hu.psprog.leaflet.api.rest.response.common;

/**
 * Pagination parameter data model.
 *
 * @author Peter Smith
 */
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

    public void setEntityCount(long entityCount) {
        this.entityCount = entityCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getEntityCountOnPage() {
        return entityCountOnPage;
    }

    public void setEntityCountOnPage(int entityCountOnPage) {
        this.entityCountOnPage = entityCountOnPage;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public void setFirst(boolean first) {
        isFirst = first;
    }

    public boolean isLast() {
        return isLast;
    }

    public void setLast(boolean last) {
        isLast = last;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public boolean isHasPrevious() {
        return hasPrevious;
    }

    public void setHasPrevious(boolean hasPrevious) {
        this.hasPrevious = hasPrevious;
    }

    public static final class Builder {
        private long entityCount;
        private int pageCount;
        private int pageNumber;
        private int entityCountOnPage;
        private boolean isFirst;
        private boolean isLast;
        private boolean hasNext;
        private boolean hasPrevious;

        public Builder withEntityCount(long entityCount) {
            this.entityCount = entityCount;
            return this;
        }

        public Builder withPageCount(int pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        public Builder withPageNumber(int pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        public Builder withEntityCountOnPage(int entityCountOnPage) {
            this.entityCountOnPage = entityCountOnPage;
            return this;
        }

        public Builder withIsFirst(boolean isFirst) {
            this.isFirst = isFirst;
            return this;
        }

        public Builder withIsLast(boolean isLast) {
            this.isLast = isLast;
            return this;
        }

        public Builder withHasNext(boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }

        public Builder withHasPrevious(boolean hasPrevious) {
            this.hasPrevious = hasPrevious;
            return this;
        }

        public PaginationDataModel build() {
            PaginationDataModel paginationDataModel = new PaginationDataModel();
            paginationDataModel.setEntityCount(entityCount);
            paginationDataModel.setPageCount(pageCount);
            paginationDataModel.setPageNumber(pageNumber);
            paginationDataModel.setEntityCountOnPage(entityCountOnPage);
            paginationDataModel.setHasNext(hasNext);
            paginationDataModel.setHasPrevious(hasPrevious);
            paginationDataModel.isFirst = this.isFirst;
            paginationDataModel.isLast = this.isLast;
            return paginationDataModel;
        }
    }
}
