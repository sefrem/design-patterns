package com.company.proxy;

public class EbookProxy implements Ebook {
    private String name;
    private RealEbook ebook;

    public EbookProxy(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        if(ebook == null)
        {ebook = new RealEbook(name);}
        ebook.show();
    }

    @Override
    public String getName() {
        return name;
    }
}
