package edu.austral.ingsis.htmlvalidator;


import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ParentHTMLElement implements HTMLElement {
    List<HTMLElement> children;
    Map<String, String> attributes;
    Map<String, String> style;
    HTMLElementModel model;

    public ParentHTMLElement(HTMLElementModel model, List<HTMLElement> children, Map<String, String> attributes, Map<String, String> style) {
        this.children = children;
        this.attributes = attributes;
        this.style = style;
        this.model = model;
    }

    @Override
    public String getTAG() {
        return model.getTAG();
    }

    @Override
    public Optional<List<HTMLElement>> getChildren() {
        return Optional.of(children);
    }

    @Override
    public Map<String, String> getAttributes() {
        return attributes;
    }

    @Override
    public Map<String, String> getStyle() {
        return style;
    }

    @Override
    public HTMLElementModel getModel() {
        return model;
    }
}
