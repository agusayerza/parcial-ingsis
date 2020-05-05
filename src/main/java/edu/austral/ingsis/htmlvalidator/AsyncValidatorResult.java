package edu.austral.ingsis.htmlvalidator;

import edu.austral.ingsis.htmlvalidator.rules.Rule;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AsyncValidatorResult implements ValidationResult, AsyncObservable {
    List<PartialValidationResult> violatedRules = new ArrayList<>();

    @Override
    public boolean isValid() {
        return false; //todo: implement, for each violatedRules if exist 1 that is invalid then the whole set is invalid
    }

    public void addViolatedRule(HTMLElement e, Rule r){
        violatedRules.add(new PartialValidationResult(r, e));
    }

    @Override
    public List<String> getViolatedRules() {
       return violatedRules.stream().map(partialValidationResult -> partialValidationResult.rule.getName()).collect(Collectors.toList());
    }

    @Override
    public List<PartialValidationResult> observe() {
        return violatedRules;
    }
}
