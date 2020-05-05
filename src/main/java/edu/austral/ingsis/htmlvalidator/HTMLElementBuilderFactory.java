package edu.austral.ingsis.htmlvalidator;

import java.util.List;

public class HTMLElementBuilderFactory implements HTMLElementBuilder{

    private final Dialect dialect = new BasicHTMLDialect();
    private final HTMLElementModel model;
    private final HTMLElement element;
    public HTMLElementBuilder createFrom(String tagName) {
        if(dialect.declares(tagName)){
            // Risky
            return new HTMLElementBuilderFactory(dialect.get(tagName).get());
        }
        throw new UndeclaredElementException();
    }

    private HTMLElementBuilderFactory(HTMLElementModel model){
        this.model = model;
        this.element = new
    }

    @Override
    public HTMLElementBuilder withChildren(List<HTMLElement> children) {
        return null;
    }

    @Override
    public HTMLElementBuilder addChild(HTMLElement child) {
        return null;
    }

    @Override
    public HTMLElementBuilder addText(String child) {
        return null;
    }

    @Override
    public HTMLElementBuilder withAttribute(String name, String value) {
        return null;
    }

    @Override
    public HTMLElementBuilder withStyle(String name, String value) {
        return null;
    }

    @Override
    public HTMLElement build() {
        return null;
    }
}
