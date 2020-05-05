package edu.austral.ingsis.htmlvalidator;

import java.util.List;
import java.util.Optional;

public interface Dialect {

    List<HTMLElementModel> getDeclaredNodes();
    boolean declares(String TagName);
    Optional<HTMLElementModel> get(String tagName);

}
