package com.company.proxy;

public class Main {
    public static void main(String[] args) {
        var library = new Library();
        String[] books = { "a", "b", "c"};
        for (var book : books) {library.add(new EbookProxy(book));}
        library.open("a");
        library.open("c");
    }
}
