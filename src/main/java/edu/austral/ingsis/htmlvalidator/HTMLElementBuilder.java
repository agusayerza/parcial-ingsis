package edu.austral.ingsis.htmlvalidator;

import java.util.List;

public interface HTMLElementBuilder {

    HTMLElementBuilder withChildren(List<HTMLElement> children);

    HTMLElementBuilder addChild(HTMLElement child);

    HTMLElementBuilder addText(String child);

    HTMLElementBuilder withAttribute(String name, String value);

    HTMLElementBuilder withStyle(String name, String value);

    HTMLElement build();
}
