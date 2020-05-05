package edu.austral.ingsis.htmlvalidator;

import edu.austral.ingsis.htmlvalidator.rules.Rule;

import java.util.ArrayList;
import java.util.List;

public class ValidationResultImpl implements ValidationResult {

    List<String> violatedRules = new ArrayList<>();

    @Override
    public boolean isValid() {
        return violatedRules.isEmpty();
    }

    public void addViolatedRule(HTMLElement e, Rule r){
        violatedRules.add(e.getTAG() + " violated " + r.getName());
    }

    @Override
    public List<String> getViolatedRules() {
        return violatedRules;
    }
}
