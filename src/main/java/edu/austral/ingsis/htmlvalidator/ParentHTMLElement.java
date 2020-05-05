package edu.austral.ingsis.htmlvalidator;


import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ParentHTMLElement implements HTMLElement {
    private List<HTMLElement> children;
    private Map<String, String> attributes;
    private Map<String, String> style;
    private HTMLElementModel model;
    private String innerHTML = ""; // todo: maybe an optional is better

    public ParentHTMLElement(HTMLElementModel model, List<HTMLElement> children, Map<String, String> attributes, Map<String, String> style, String innerHTML) {
        this.children = children;
        this.attributes = attributes;
        this.style = style;
        this.innerHTML = innerHTML;
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

    @Override
    public String getInnerHTML() {
        return null;
    }
}
