module leaflet.rest.api {
    requires java.validation;
    requires com.fasterxml.jackson.databind;
    requires jackson.annotations;
    requires org.apache.commons.lang3;
    requires org.hibernate.validator;
    requires spring.web;

    exports hu.psprog.leaflet.api.rest.request.attachment;
    exports hu.psprog.leaflet.api.rest.request.category;
    exports hu.psprog.leaflet.api.rest.request.comment;
    exports hu.psprog.leaflet.api.rest.request.common;
    exports hu.psprog.leaflet.api.rest.request.dcp;
    exports hu.psprog.leaflet.api.rest.request.document;
    exports hu.psprog.leaflet.api.rest.request.entry;
    exports hu.psprog.leaflet.api.rest.request.file;
    exports hu.psprog.leaflet.api.rest.request.routing;
    exports hu.psprog.leaflet.api.rest.request.tag;
    exports hu.psprog.leaflet.api.rest.request.user;
    exports hu.psprog.leaflet.api.rest.request.validator;

    exports hu.psprog.leaflet.api.rest.response.category;
    exports hu.psprog.leaflet.api.rest.response.comment;
    exports hu.psprog.leaflet.api.rest.response.common;
    exports hu.psprog.leaflet.api.rest.response.dcp;
    exports hu.psprog.leaflet.api.rest.response.document;
    exports hu.psprog.leaflet.api.rest.response.entry;
    exports hu.psprog.leaflet.api.rest.response.file;
    exports hu.psprog.leaflet.api.rest.response.routing;
    exports hu.psprog.leaflet.api.rest.response.tag;
    exports hu.psprog.leaflet.api.rest.response.user;
}