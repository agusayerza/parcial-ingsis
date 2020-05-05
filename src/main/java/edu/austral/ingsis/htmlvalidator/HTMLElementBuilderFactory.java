package edu.austral.ingsis.htmlvalidator;

import edu.austral.ingsis.htmlvalidator.dialect.BasicHTMLDialect;
import edu.austral.ingsis.htmlvalidator.dialect.Dialect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HTMLElementBuilderFactory implements HTMLElementBuilder{

    private List<HTMLElement> children = new ArrayList<>();
    private Map<String, String> attributes = new HashMap<>();
    private Map<String, String> style = new HashMap<>();
    private String text = "";
    private final Dialect dialect = new BasicHTMLDialect();
    private HTMLElementModel model;

    public HTMLElementBuilder createFrom(String tagName) {
        if(dialect.declares(tagName)){
            if(dialect.get(tagName).isPresent())
                return new HTMLElementBuilderFactory(dialect.get(tagName).get());
        }
        throw new UndeclaredElementException();
    }

    HTMLElementBuilderFactory(){

    }

    private HTMLElementBuilderFactory(HTMLElementModel model){
        this.model = model;
    }

    @Override
    public HTMLElementBuilder withChildren(List<HTMLElement> children) {
        if(model.canHaveChildren()){
            this.children.addAll(children);
        }
        return this;
    }

    @Override
    public HTMLElementBuilder addChild(HTMLElement child) {
        if(model.canHaveChildren()){
            this.children.add(child);
        }
        return this;
    }

    @Override
    public HTMLElementBuilder addText(String child) {
        text = child;
        return this;
    }

    @Override
    public HTMLElementBuilder withAttribute(String name, String value) {
//        if(model.hasAttribute(name)){  will implement if have spare time
            attributes.put(name, value);
//        }
        return this;
    }

    @Override
    public HTMLElementBuilder withStyle(String name, String value) {
        style.put(name, value);
        return this;
    }

    @Override
    public HTMLElement build() {
        if(model.canHaveChildren()){
            return new ParentHTMLElement(model, children, attributes, style,  text);
        }else{
            return new FinalHTMLElement(attributes, style, model, text);
        }
    }
}
