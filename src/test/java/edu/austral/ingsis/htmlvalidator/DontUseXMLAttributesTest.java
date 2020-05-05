package edu.austral.ingsis.htmlvalidator;

import org.junit.Test;

import static edu.austral.ingsis.htmlvalidator.BasicRules.DONT_USE_XML_ATTRIBUTES;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

public class DontUseXMLAttributesTest extends SingleRuleValidatorTest {
    private final HTMLFactory htmlFactory = new HTMLFactory();

    @Override
    protected String getRule() { return DONT_USE_XML_ATTRIBUTES;}

    @Test
    public void htmlShouldBeValidIfIsEmpty() {
        final HTMLElement html = htmlFactory.htmlWithStructure(
            emptyList(),
            emptyList()
        );

        assertThatElementIsValid(html);
    }

    @Test
    public void htmlShouldBeValidIfThereIsNoXmlAttributes() {
        final HTMLElement html = htmlFactory.htmlWithStructure(
            emptyList(),
            asList(
                builders.div()
                    .addChild(
                        builders.div()
                            .withAttribute("class", "some-class")
                            .build()
                    )
                    .build(),
                builders.div()
                    .addChild(builders.div().build())
                    .build()
            )
        );

        assertThatElementIsValid(html);
    }

    @Test
    public void htmlShouldBeInvalidIfHasXmlAttributes() {
        final HTMLElement html = htmlFactory.htmlWithStructure(
            emptyList(),
            asList(
                builders.div()
                    .addChild(
                        builders.div()
                            .withAttribute("xmlns:xhtml", "http://www.w3.org/1999/xhtml")
                            .build()
                    )
                    .build(),
                builders.div()
                    .addChild(builders.div().build())
                    .build()
            )
        );

        assertThatElementHasSingleViolation(html);
    }
}
