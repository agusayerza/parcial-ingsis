package edu.austral.ingsis.htmlvalidator;

import edu.austral.ingsis.htmlvalidator.renderer.HTMLRenderer;
import edu.austral.ingsis.htmlvalidator.renderer.HTMLRendererImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RendererTest {

    private final HTMLElementBuilderFactory builderFactory = new HTMLElementBuilderFactory();
    private final BasicTagNamesBuilders builders = new BasicTagNamesBuilders(builderFactory);
    private final HTMLRenderer renderer = new HTMLRendererImpl();

    @Test
    public void testRendererSimpleObject(){
        final HTMLElement html = builders.html()
                .withAttribute("lang", "en")
                .addChild(builders.head().build())
                .build();

        assertEquals(renderer.render(html), "<html lang=en>\n" +
                "<head >\n" +
                "</head>\n" +
                "</html>");
    }

    @Test
    public void testRendererComplexObject(){
        // todo: will implement if i have spare time

    }
}
