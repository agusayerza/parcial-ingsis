package edu.austral.ingsis.htmlvalidator;

import edu.austral.ingsis.htmlvalidator.rules.Rule;

import java.util.ArrayList;
import java.util.List;

public class PartialValidationResult implements ValidationResult {


    Rule rule;
    HTMLElement element;

    public PartialValidationResult(Rule rule, HTMLElement element) {
        this.rule = rule;
        this.element = element;
    }

    @Override
    public boolean isValid() {
        return rule == null;
    }

    @Override
    public List<String> getViolatedRules() {
        List<String> r = new ArrayList<>();
         r.add(rule.getName());
         return r;
    }
}
