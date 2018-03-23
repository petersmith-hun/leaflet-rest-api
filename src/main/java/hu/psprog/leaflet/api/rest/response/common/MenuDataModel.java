package hu.psprog.leaflet.api.rest.response.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hu.psprog.leaflet.api.rest.response.routing.FrontEndRouteDataModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Response model for menus.
 *
 * @author Peter Smith
 */
@JsonDeserialize(builder = MenuDataModel.MenuDataModelBuilder.class)
public class MenuDataModel extends BaseBodyDataModel {

    private List<FrontEndRouteDataModel> header;
    private List<FrontEndRouteDataModel> footer;
    private List<FrontEndRouteDataModel> standalone;

    public List<FrontEndRouteDataModel> getHeader() {
        return header;
    }

    public List<FrontEndRouteDataModel> getFooter() {
        return footer;
    }

    public List<FrontEndRouteDataModel> getStandalone() {
        return standalone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        MenuDataModel that = (MenuDataModel) o;

        return new EqualsBuilder()
                .append(header, that.header)
                .append(footer, that.footer)
                .append(standalone, that.standalone)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(header)
                .append(footer)
                .append(standalone)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("header", header)
                .append("footer", footer)
                .append("standalone", standalone)
                .toString();
    }

    public static MenuDataModelBuilder getBuilder() {
        return new MenuDataModelBuilder();
    }

    /**
     * Builder for {@link MenuDataModel}.
     */
    public static final class MenuDataModelBuilder {
        private List<FrontEndRouteDataModel> header;
        private List<FrontEndRouteDataModel> footer;
        private List<FrontEndRouteDataModel> standalone;

        private MenuDataModelBuilder() {
        }

        public MenuDataModelBuilder withHeader(List<FrontEndRouteDataModel> header) {
            this.header = header;
            return this;
        }

        public MenuDataModelBuilder withFooter(List<FrontEndRouteDataModel> footer) {
            this.footer = footer;
            return this;
        }

        public MenuDataModelBuilder withStandalone(List<FrontEndRouteDataModel> standalone) {
            this.standalone = standalone;
            return this;
        }

        public MenuDataModel build() {
            MenuDataModel menuDataModel = new MenuDataModel();
            menuDataModel.header = this.header;
            menuDataModel.footer = this.footer;
            menuDataModel.standalone = this.standalone;
            return menuDataModel;
        }
    }
}
