package hu.psprog.leaflet.api.rest.response.common;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Body structure model for wrapped responses.
 *
 * @author Peter Smith
 */
public class WrapperBodyDataModel<T extends BaseBodyDataModel> extends BaseBodyDataModel {

    private T body;
    private PaginationDataModel pagination;
    private SEODataModel seo;
    private ErrorMessageDataModel error;
    private MenuDataModel menu;

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

    public void setBody(T body) {
        this.body = body;
    }

    public void setPagination(PaginationDataModel pagination) {
        this.pagination = pagination;
    }

    public void setSeo(SEODataModel seo) {
        this.seo = seo;
    }

    public void setError(ErrorMessageDataModel error) {
        this.error = error;
    }

    public MenuDataModel getMenu() {
        return menu;
    }

    public void setMenu(MenuDataModel menu) {
        this.menu = menu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof WrapperBodyDataModel)) return false;

        WrapperBodyDataModel<?> that = (WrapperBodyDataModel<?>) o;

        return new EqualsBuilder()
                .append(body, that.body)
                .append(pagination, that.pagination)
                .append(seo, that.seo)
                .append(error, that.error)
                .append(menu, that.menu)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(body)
                .append(pagination)
                .append(seo)
                .append(error)
                .append(menu)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("body", body)
                .append("pagination", pagination)
                .append("seo", seo)
                .append("error", error)
                .append("menu", menu)
                .toString();
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
        private MenuDataModel menu;

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

        public WrapperBodyDataModelBuilder withMenu(MenuDataModel menu) {
            this.menu = menu;
            return this;
        }

        public WrapperBodyDataModel build() {
            WrapperBodyDataModel wrapperBodyDataModel = new WrapperBodyDataModel();
            wrapperBodyDataModel.body = body;
            wrapperBodyDataModel.pagination = pagination;
            wrapperBodyDataModel.seo = seo;
            wrapperBodyDataModel.error = error;
            wrapperBodyDataModel.menu = menu;
            return wrapperBodyDataModel;
        }
    }
}
