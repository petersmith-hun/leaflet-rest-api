package hu.psprog.leaflet.api.rest.response.common;

/**
 * Pagination parameter data model.
 *
 * @author Peter Smith
 */
public class PaginationDataModel extends BaseBodyDataModel {

    private static final String ENTITY_COUNT = "entityCount";
    private static final String PAGE_COUNT = "pageCount";
    private static final String PAGE_NUMBER = "pageNumber";
    private static final String ENTITY_COUNT_ON_PAGE = "entityCountOnPage";
    private static final String IS_FIRST = "isFirst";
    private static final String IS_LAST = "isLast";
    private static final String HAS_NEXT = "hasNext";
    private static final String HAS_PREVIOUS = "hasPrevious";

    private PaginationDataModel() {
        // prevent direct initialization
    }

    public static class Builder {

        private PaginationDataModel paginationDataModel;

        public Builder() {
            paginationDataModel = new PaginationDataModel();
        }

        public Builder withEntityCount(long entityCount) {
            paginationDataModel.addSingleNode(ENTITY_COUNT, entityCount);
            return this;
        }

        public Builder withPageCount(int pageCount) {
            paginationDataModel.addSingleNode(PAGE_COUNT, pageCount);
            return this;
        }

        public Builder withPageNumber(int pageNumber) {
            paginationDataModel.addSingleNode(PAGE_NUMBER, pageNumber);
            return this;
        }

        public Builder withEntityCountOnPage(int entityCountOnPage) {
            paginationDataModel.addSingleNode(ENTITY_COUNT_ON_PAGE, entityCountOnPage);
            return this;
        }

        public Builder withIsFirst(boolean isFirst) {
            paginationDataModel.addSingleNode(IS_FIRST, isFirst);
            return this;
        }

        public Builder withIsLast(boolean isLast) {
            paginationDataModel.addSingleNode(IS_LAST, isLast);
            return this;
        }

        public Builder withHasNext(boolean hasNext) {
            paginationDataModel.addSingleNode(HAS_NEXT, hasNext);
            return this;
        }

        public Builder withHasPrevious(boolean hasPrevious) {
            paginationDataModel.addSingleNode(HAS_PREVIOUS, hasPrevious);
            return this;
        }

        public PaginationDataModel build() {
            return paginationDataModel;
        }
    }
}
