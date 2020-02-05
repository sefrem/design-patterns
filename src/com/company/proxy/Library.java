package com.company.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Ebook> ebooks = new HashMap<>();

    public void add(Ebook ebook) {
        ebooks.put(ebook.getName(), ebook);
    }

    public void open(String name) {
        ebooks.get(name).show();
    }

}
