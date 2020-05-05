package edu.austral.ingsis.htmlvalidator.rules;

import edu.austral.ingsis.htmlvalidator.HTMLElement;
import edu.austral.ingsis.htmlvalidator.HTMLElementModel;

public interface Rule {
    String getName();
    boolean appliesTo(HTMLElementModel model);
    boolean validate(HTMLElement element);
}
