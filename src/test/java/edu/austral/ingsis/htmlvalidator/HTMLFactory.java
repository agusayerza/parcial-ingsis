package edu.austral.ingsis.htmlvalidator;

import java.util.List;

public class HTMLFactory {
    private final HTMLElementBuilderFactory builderFactory = new HTMLElementBuilderFactory();
    private final BasicTagNamesBuilders builders = new BasicTagNamesBuilders(builderFactory);

    HTMLElement htmlWithStructure(List<HTMLElement> headChildren, List<HTMLElement> bodyChildren) {
        return builders.html()
            .addChild(builders.head()
                .withChildren(headChildren)
                .build())
            .addChild(builders.body()
                .withChildren(bodyChildren)
                .build())
            .build();

    }
}
