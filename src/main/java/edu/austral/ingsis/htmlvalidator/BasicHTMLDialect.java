package edu.austral.ingsis.htmlvalidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class BasicHTMLDialect implements Dialect {


    private final List<HTMLElementModel> elementModels;

    public BasicHTMLDialect() {
        // really missing scala over here
        this.elementModels = new ArrayList<>();
        elementModels.add(new HTMLElementModelImpl(BasicTagNames.BODY, new ArrayList<>(), true));
        elementModels.add(new HTMLElementModelImpl(BasicTagNames.ARTICLE, new ArrayList<>(), true));
        elementModels.add(new HTMLElementModelImpl(BasicTagNames.BR, new ArrayList<>(), false));
        elementModels.add(new HTMLElementModelImpl(BasicTagNames.DIV, new ArrayList<>(), true));
        elementModels.add(new HTMLElementModelImpl(BasicTagNames.HEAD, new ArrayList<>(), true));
        elementModels.add(new HTMLElementModelImpl(BasicTagNames.IMG, new ArrayList<>(), false));
    }

    @Override
    public List<HTMLElementModel> getDeclaredNodes() {
        return null;
    }

    @Override
    public boolean declares(String tagName) {
        return elementModels.stream().map(HTMLElementModel::getTAG).anyMatch(s -> s.equals(tagName));
    }

    public Optional<HTMLElementModel> get(String tagName) {
        return elementModels.stream().filter(e -> e.getTAG().equals(tagName)).findFirst();
    }
}
