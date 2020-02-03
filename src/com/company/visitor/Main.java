package com.company.visitor;

public class Main {
    public static void main(String[] args) {
        var document = new HtmlDocument();
//        document.add(new HeadingNode());
        document.add(new AnchorNode());
        var heading = new HeadingNode();
        document.add(heading);
        document.execute(new HighlightOperation());

        heading.execute(new PlainTextOperation());

    }
}
