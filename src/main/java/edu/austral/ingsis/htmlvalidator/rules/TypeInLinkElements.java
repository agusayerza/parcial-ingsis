package edu.austral.ingsis.htmlvalidator.rules;

import edu.austral.ingsis.htmlvalidator.BasicRules;
import edu.austral.ingsis.htmlvalidator.HTMLElement;
import edu.austral.ingsis.htmlvalidator.HTMLElementModel;

public class TypeInLinkElements implements Rule {
    private final String name = BasicRules.TYPE_IN_LINK_ELEMENTS;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean appliesTo(HTMLElementModel model) {
        // if i had more time i would have a better way of checking
        return model.getTAG().toLowerCase().equals("link");
    }

    @Override
    public boolean validate(HTMLElement element) {
        return element.getAttributes().containsKey("type");
    }
}
