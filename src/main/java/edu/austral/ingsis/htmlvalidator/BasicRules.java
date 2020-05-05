package edu.austral.ingsis.htmlvalidator;

public interface BasicRules {
    /**
     * Dont use XML attributes inside HTML tags. Ex: xml:lang="ja"
     */
    String DONT_USE_XML_ATTRIBUTES = "DONT_USE_XML_ATTRIBUTES";

    /**
     * HTML element "html" must have "lang" attribute
     */
    String LANG_IN_HTML = "LANG_IN_HTML";

    /**
     * "link" element must have "type" attribute
     */
    String TYPE_IN_LINK_ELEMENTS = "TYPE_IN_LINK_ELEMENTS";
}
