package edu.austral.ingsis.htmlvalidator;

import edu.austral.ingsis.htmlvalidator.rules.DontUseXMLAttributes;
import edu.austral.ingsis.htmlvalidator.rules.LangInHtml;
import edu.austral.ingsis.htmlvalidator.rules.Rule;
import edu.austral.ingsis.htmlvalidator.rules.TypeInLinkElements;

import java.util.*;

public class HTMLValidatorFactory {

    private Set<Rule> rules = new HashSet<>();
    private Map<String, Rule> existingRules = loadRules();
    public Map<String, Rule> loadRules() {
        Map<String, Rule> rules = new HashMap<>();
        rules.put(BasicRules.DONT_USE_XML_ATTRIBUTES, new DontUseXMLAttributes());
        rules.put(BasicRules.LANG_IN_HTML, new LangInHtml());
        rules.put(BasicRules.TYPE_IN_LINK_ELEMENTS, new TypeInLinkElements());
        return rules;
    }

    public HTMLValidator createFromRules(String ...rules) throws UnknownRuleException {
        for(String r : rules) {
            if(existingRules.containsKey(r)){
                this.rules.add(existingRules.get(r));
            }else throw new UnknownRuleException("Unknown rule: " + r);
        }
    }

    public HTMLValidator createFromRules(List<String> rules) throws UnknownRuleException {

    }
}
