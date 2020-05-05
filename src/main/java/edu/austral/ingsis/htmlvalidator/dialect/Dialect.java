package edu.austral.ingsis.htmlvalidator.dialect;

import edu.austral.ingsis.htmlvalidator.HTMLElementModel;

import java.util.List;
import java.util.Optional;

public interface Dialect {

    List<HTMLElementModel> getDeclaredNodes();
    boolean declares(String TagName);
    Optional<HTMLElementModel> get(String tagName);

}
