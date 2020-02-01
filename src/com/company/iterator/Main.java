package com.company.iterator;

public class Main {
    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        history.push("d");
        history.pop();
        history.pop();


        Iterator iterator = history.createIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
