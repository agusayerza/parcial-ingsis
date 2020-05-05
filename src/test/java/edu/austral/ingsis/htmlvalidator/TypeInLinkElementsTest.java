package edu.austral.ingsis.htmlvalidator;

import org.junit.Test;

import static edu.austral.ingsis.htmlvalidator.BasicRules.TYPE_IN_LINK_ELEMENTS;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

public class TypeInLinkElementsTest extends SingleRuleValidatorTest {
    private final HTMLFactory htmlFactory = new HTMLFactory();

    @Override
    protected String getRule() { return TYPE_IN_LINK_ELEMENTS;}

    @Test
    public void htmlShouldBeValidIfLinkIsNotPresent() {
        final HTMLElement html = htmlFactory
            .htmlWithStructure(emptyList(), emptyList());

        assertThatElementIsValid(html);
    }

    @Test
    public void htmlShouldBeValidIfLinkHasType() {
        final HTMLElement html = htmlFactory
            .htmlWithStructure(
                singletonList(
                    builders.link().withAttribute("type", "stylesheet").build()
                ),
                emptyList()
            );

        assertThatElementIsValid(html);
    }

    @Test
    public void htmlShouldBeInvalidIfLangHasNotType() {
        final HTMLElement html = htmlFactory
            .htmlWithStructure(
                singletonList(builders.link().build()),
                emptyList()
            );

        assertThatElementHasSingleViolation(html);
    }
}
