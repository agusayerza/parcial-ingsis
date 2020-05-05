package edu.austral.ingsis.htmlvalidator.rules;

import edu.austral.ingsis.htmlvalidator.BasicRules;
import edu.austral.ingsis.htmlvalidator.HTMLElement;
import edu.austral.ingsis.htmlvalidator.HTMLElementModel;

public class DontUseXMLAttributes implements Rule {
    final String name = BasicRules.DONT_USE_XML_ATTRIBUTES;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean appliesTo(HTMLElementModel model) {
        return true; // Applies to all
    }

    @Override
    public boolean validate(HTMLElement element) {
        for (String k : element.getAttributes().keySet()) {
            if(element.getAttributes().get(k).contains(":")) return false;
        }
        return true;
    }
}
