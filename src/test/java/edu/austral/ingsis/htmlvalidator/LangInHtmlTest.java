package edu.austral.ingsis.htmlvalidator;

import org.junit.Test;

import static edu.austral.ingsis.htmlvalidator.BasicRules.LANG_IN_HTML;
import static java.util.Collections.emptyList;

public class LangInHtmlTest extends SingleRuleValidatorTest {
    private final HTMLFactory htmlFactory = new HTMLFactory();

    @Override
    protected String getRule() { return LANG_IN_HTML;}

    @Test
    public void htmlShouldBeValidIfLangIsPresent() {
        final HTMLElement html = builders.html()
            .withAttribute("lang", "en")
            .addChild(builders.head().build())
            .build();

        assertThatElementIsValid(html);
    }

    @Test
    public void htmlShouldBeInvalidIfLangIsNotPresent() {
        final HTMLElement html = htmlFactory
            .htmlWithStructure(emptyList(), emptyList());

        assertThatElementHasSingleViolation(html);
    }
}
