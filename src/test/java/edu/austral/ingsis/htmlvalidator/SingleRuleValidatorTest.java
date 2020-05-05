package edu.austral.ingsis.htmlvalidator;

import java.util.List;

import static java.util.Collections.singletonList;

public abstract class SingleRuleValidatorTest extends BaseValidatorTest {
    protected abstract String getRule();

    @Override
    protected List<String> getRulesToTest() { return singletonList(getRule());}

    protected void assertThatElementHasSingleViolation(HTMLElement html) {
        assertThatElementViolatesRule(html, getRule());
    }
}
