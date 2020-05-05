package edu.austral.ingsis.htmlvalidator.renderer;

import edu.austral.ingsis.htmlvalidator.FinalHTMLElement;
import edu.austral.ingsis.htmlvalidator.HTMLElement;
import edu.austral.ingsis.htmlvalidator.ParentHTMLElement;

public class HTMLRendererImpl implements HTMLRenderer {

    @Override
    public String render(ParentHTMLElement element) {
        return renderElement(element);
    }

    @Override
    public String render(FinalHTMLElement element) {
        return renderElement(element);
    }

    @Override
    public String render(HTMLElement e) {
        return e.render(this);
    }

    private String renderElement(ParentHTMLElement e){
        return renderStartingNode(e) + innerHTML(e) + renderEndingNode(e);
    }

    private String renderEndingNode(ParentHTMLElement e) {
        return "</" + e.getTAG() + ">";
    }

    private String innerHTML(ParentHTMLElement e) {
        StringBuilder builder = new StringBuilder();
        String innerHTML = e.getInnerHTML();
        if(innerHTML != null) builder.append(innerHTML).append('\n');
        if(e.getChildren().isPresent()) {
            for (HTMLElement child :e.getChildren().get()) {
                builder.append(render(child)).append('\n');
            }
        }
        return builder.toString();
    }

    private String renderElement(FinalHTMLElement e){
        return renderItem(e, false);
    }

    private String renderStartingNode(ParentHTMLElement e){
        return renderItem(e, true);
    }

    private String renderItem(HTMLElement e, boolean hasContent){
        StringBuilder builder = new StringBuilder();
        builder.append('<').append(e.getTAG()).append( " ");
        for (String attribute: e.getAttributes().keySet()) {
            String val = e.getAttributes().get(attribute);
            if(!val.isEmpty()){
                builder.append(attribute).append("=").append(val);
            }
        }
        if(hasContent) {
            builder.append(">").append('\n');
        }else builder.append("/>");

        return builder.toString();
    }
}
