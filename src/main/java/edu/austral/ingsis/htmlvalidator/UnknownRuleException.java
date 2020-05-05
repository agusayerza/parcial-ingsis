package edu.austral.ingsis.htmlvalidator;

import static java.lang.String.format;

public class UnknownRuleException extends Exception {
    public final String rule;

    public UnknownRuleException(String rule) {
        super(format("Rule %s is unknown", rule));
        this.rule = rule;
    }
}
