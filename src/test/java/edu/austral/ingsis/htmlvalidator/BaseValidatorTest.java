package edu.austral.ingsis.htmlvalidator;

import org.junit.Before;

import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public abstract class BaseValidatorTest {
    protected final HTMLElementBuilderFactory builderFactory = new HTMLElementBuilderFactory();
    protected final BasicTagNamesBuilders builders = new BasicTagNamesBuilders(builderFactory);
    private final HTMLValidatorFactory validatorFactory = new HTMLValidatorFactory();

    private HTMLValidator validator;

    protected abstract List<String> getRulesToTest();

    @Before
    public void initValidator() throws UnknownRuleException {
        validator = validatorFactory.createFromRules(getRulesToTest());
    }

    protected void assertThatElementIsValid(HTMLElement html) {
        assertThatElementViolatesRules(html, emptyList());
    }

    void assertThatElementViolatesRule(HTMLElement html, String violatedRule) {
        assertThatElementViolatesRules(html, singletonList(violatedRule));
    }

    void assertThatElementViolatesRules(HTMLElement html, List<String> violatedRules) {
        final ValidationResult result = this.validator.validate(html);

        assertEquals(result.isValid(), violatedRules.isEmpty());
        assertThat(result.getViolatedRules(), containsInAnyOrder(violatedRules.toArray()));
    }


}
