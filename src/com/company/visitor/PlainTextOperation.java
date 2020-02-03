package com.company.visitor;

public class PlainTextOperation implements Visitor {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Heading-plain-text");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Anchor-plain-text");
    }
}
