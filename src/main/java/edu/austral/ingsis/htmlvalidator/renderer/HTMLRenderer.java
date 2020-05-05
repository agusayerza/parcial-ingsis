package edu.austral.ingsis.htmlvalidator.renderer;

import edu.austral.ingsis.htmlvalidator.FinalHTMLElement;
import edu.austral.ingsis.htmlvalidator.HTMLElement;
import edu.austral.ingsis.htmlvalidator.ParentHTMLElement;

public interface HTMLRenderer {
    String render(ParentHTMLElement e);
    String render(FinalHTMLElement e);
    String render(HTMLElement e);
}
