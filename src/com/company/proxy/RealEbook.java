package com.company.proxy;

public class RealEbook implements Ebook {
    private String name;

    public RealEbook(String name) {
        this.name = name;
        load();
    }

    public void load() {
        System.out.println("Loading the book " + name);
    }

    @Override
    public void show() {
        System.out.println("Showing eboook " + name);
    }

    @Override
    public String getName() {
        return name;
    }
}
