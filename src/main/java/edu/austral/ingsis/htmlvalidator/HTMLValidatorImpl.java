package edu.austral.ingsis.htmlvalidator;

import edu.austral.ingsis.htmlvalidator.rules.Rule;

import java.util.Set;

public class HTMLValidatorImpl implements HTMLValidator {

    private final Set<Rule> rules;

    public HTMLValidatorImpl(Set<Rule> rules) {
        this.rules = rules;
    }

    @Override
    public ValidationResult validate(HTMLElement html) {

    }
}
