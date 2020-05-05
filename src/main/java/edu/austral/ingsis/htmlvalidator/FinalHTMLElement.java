package edu.austral.ingsis.htmlvalidator;

import edu.austral.ingsis.htmlvalidator.renderer.HTMLRenderer;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FinalHTMLElement implements HTMLElement{

    private Map<String, String> attributes;
    private Map<String, String> style;
    private HTMLElementModel model;
    private String innerHTML = ""; // todo: maybe an optional is better

    public FinalHTMLElement(Map<String, String> attributes, Map<String, String> style, HTMLElementModel model, String innerHTML) {
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
        return Optional.empty();
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
        return innerHTML;
    }

    @Override
    public String render(HTMLRenderer renderer) {
        return renderer.render(this);
    }
}
