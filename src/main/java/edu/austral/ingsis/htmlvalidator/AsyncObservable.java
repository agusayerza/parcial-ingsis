package edu.austral.ingsis.htmlvalidator;

import java.util.List;

public interface AsyncObservable {
    public List<PartialValidationResult> observe();
}
