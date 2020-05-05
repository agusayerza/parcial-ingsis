package edu.austral.ingsis.htmlvalidator;

import edu.austral.ingsis.htmlvalidator.rules.Rule;

import java.util.Set;

public class AsyncValidator implements AsyncHTMLValidator {

    private final Set<Rule> rules;
    HTMLValidator internalValidator;

    public AsyncValidator(Set<Rule> rules) {
        this.rules = rules;
        this.internalValidator = new HTMLValidatorImpl(rules);
    }


    @Override
    public ValidationResult validate(HTMLElement html) {
        return null; //todo: out of time to implement
    }
}
