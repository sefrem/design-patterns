package com.company.visitor;

public class HighlightOperation implements Visitor {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Highlight Heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Highlight anchor");
    }
}
