package edu.austral.ingsis.htmlvalidator;

import edu.austral.ingsis.htmlvalidator.renderer.HTMLRenderer;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface HTMLElement {

    String getTAG();
    Optional<List<HTMLElement>> getChildren();
    Map<String, String> getAttributes();
    Map<String, String> getStyle();
    HTMLElementModel getModel();
    String getInnerHTML();
    String render(HTMLRenderer renderer);


}
