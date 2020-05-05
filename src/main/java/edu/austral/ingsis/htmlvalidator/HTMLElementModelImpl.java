package edu.austral.ingsis.htmlvalidator;

import java.util.List;

public class HTMLElementModelImpl implements HTMLElementModel {

    String TAG;
    List<String> attributesList;
    boolean canHaveChildren;

    public HTMLElementModelImpl(String TAG, List<String> attributesList, boolean canHaveChildren) {
        this.TAG = TAG;
        this.attributesList = attributesList;
        this.canHaveChildren = canHaveChildren;
    }

    @Override
    public String getTAG() {
        return TAG;
    }

    public List<String> getAttributesList() {
        return attributesList;
    }

    @Override
    public boolean canHaveChildren() {
        return canHaveChildren;
    }

    @Override
    public boolean hasAttribute(String attribute) {
        return attributesList.contains(attribute);
    }

}
