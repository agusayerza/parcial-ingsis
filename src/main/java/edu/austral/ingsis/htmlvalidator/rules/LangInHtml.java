package edu.austral.ingsis.htmlvalidator.rules;

import edu.austral.ingsis.htmlvalidator.BasicRules;
import edu.austral.ingsis.htmlvalidator.HTMLElement;
import edu.austral.ingsis.htmlvalidator.HTMLElementModel;

public class LangInHtml implements Rule {
    final String name = BasicRules.LANG_IN_HTML;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean appliesTo(HTMLElementModel model) {
        // if i had more time i would have a better way of checking
        return model.getTAG().toLowerCase().equals("html");
    }

    @Override
    public boolean validate(HTMLElement element) {
        return element.getAttributes().containsKey("lang");
    }
}
