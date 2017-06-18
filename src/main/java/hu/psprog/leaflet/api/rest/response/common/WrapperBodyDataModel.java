package hu.psprog.leaflet.api.rest.response.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Body structure model for wrapped responses.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = WrapperBodyDataModel.WrapperBodyDataModelBuilder.class)
public class WrapperBodyDataModel<T extends BaseBodyDataModel> extends BaseBodyDataModel {

    private T body;
    private PaginationDataModel pagination;
    private SEODataModel seo;
    private ErrorMessageDataModel error;

    public T getBody() {
        return body;
    }

    public PaginationDataModel getPagination() {
        return pagination;
    }

    public SEODataModel getSeo() {
        return seo;
    }

    public ErrorMessageDataModel getError() {
        return error;
    }

    public static <T extends BaseBodyDataModel> WrapperBodyDataModelBuilder<T> getBuilder() {
        return new WrapperBodyDataModelBuilder<>();
    }

    /**
     * Builder for {@link WrapperBodyDataModel}.
     */
    public static final class WrapperBodyDataModelBuilder<T extends BaseBodyDataModel> {
        private T body;
        private PaginationDataModel pagination;
        private SEODataModel seo;
        private ErrorMessageDataModel error;

        private WrapperBodyDataModelBuilder() {
        }

        public WrapperBodyDataModelBuilder withBody(T body) {
            this.body = body;
            return this;
        }

        public WrapperBodyDataModelBuilder withPagination(PaginationDataModel pagination) {
            this.pagination = pagination;
            return this;
        }

        public WrapperBodyDataModelBuilder withSeo(SEODataModel seo) {
            this.seo = seo;
            return this;
        }

        public WrapperBodyDataModelBuilder withError(ErrorMessageDataModel error) {
            this.error = error;
            return this;
        }

        public WrapperBodyDataModel build() {
            WrapperBodyDataModel wrapperBodyDataModel = new WrapperBodyDataModel();
            wrapperBodyDataModel.body = body;
            wrapperBodyDataModel.pagination = pagination;
            wrapperBodyDataModel.seo = seo;
            wrapperBodyDataModel.error = error;
            return wrapperBodyDataModel;
        }
    }
}
