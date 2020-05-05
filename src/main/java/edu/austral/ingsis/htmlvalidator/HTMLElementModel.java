package edu.austral.ingsis.htmlvalidator;

public interface HTMLElementModel {
    String getTAG();
    boolean canHaveChildren();
    boolean hasAttribute(String attribute);
}
