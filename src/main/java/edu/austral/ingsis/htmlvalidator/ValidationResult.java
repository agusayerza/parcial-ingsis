package edu.austral.ingsis.htmlvalidator;

import java.util.List;

public interface ValidationResult {
    boolean isValid();

    List<String> getViolatedRules();
}
