package edu.austral.ingsis.htmlvalidator;

class BasicTagNamesBuilders {
    private final HTMLElementBuilderFactory builderFactory;

    BasicTagNamesBuilders(HTMLElementBuilderFactory builderFactory) {this.builderFactory = builderFactory;}

    HTMLElementBuilder html() { return builderFactory.createFrom(BasicTagNames.HTML);}

    HTMLElementBuilder body() { return builderFactory.createFrom(BasicTagNames.BODY);}

    HTMLElementBuilder head() { return builderFactory.createFrom(BasicTagNames.HEAD);}

    HTMLElementBuilder meta() { return builderFactory.createFrom(BasicTagNames.META);}

    HTMLElementBuilder link() { return builderFactory.createFrom(BasicTagNames.LINK);}

    HTMLElementBuilder script() { return builderFactory.createFrom(BasicTagNames.SCRIPT);}

    HTMLElementBuilder div() { return builderFactory.createFrom(BasicTagNames.DIV);}

    HTMLElementBuilder br() { return builderFactory.createFrom(BasicTagNames.BR);}

    HTMLElementBuilder article() { return builderFactory.createFrom(BasicTagNames.ARTICLE);}

    HTMLElementBuilder iframe() { return builderFactory.createFrom(BasicTagNames.IFRAME);}

    HTMLElementBuilder img() { return builderFactory.createFrom(BasicTagNames.IMG);}
}
