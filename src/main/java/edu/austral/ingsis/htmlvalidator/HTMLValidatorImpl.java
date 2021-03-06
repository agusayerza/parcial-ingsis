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
        ValidationResultImpl result = new ValidationResultImpl();
        for (Rule r: rules) {
            validateNode(html, r, result);
        }
        return result;
    }

    public PartialValidationResult validateNode(HTMLElement e, Rule r){
        PartialValidationResult partialResult = new PartialValidationResult(null, e);
        if(r.appliesTo(e.getModel())){
            if(!r.validate(e)){
                partialResult = new PartialValidationResult(r, e);
            }
        }
        return partialResult;
    }

    private void validateNode(HTMLElement e, Rule r, ValidationResultImpl partialResult){
        if(r.appliesTo(e.getModel())){
            if(!r.validate(e)){
                partialResult.addViolatedRule(e, r);
            }
        }

        if(e.getChildren().isPresent()){
            for (HTMLElement child: e.getChildren().get()) {
                validateNode(child, r, partialResult);
            }
        }
    }
}
