package com.company.visitor;

public class AnchorNode implements HtmlNode {
    @Override
    public void execute(Visitor visitor) {
        visitor.apply(this);
    }
}
