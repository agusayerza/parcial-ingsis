package edu.austral.ingsis.htmlvalidator;

import java.util.ArrayList;
import java.util.List;

public class ValidationResultImpl implements ValidationResult {

    boolean isValid = true;
    List<String> valiolatedRules = new ArrayList<>();

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public List<String> getViolatedRules() {
        return null;
    }
}
