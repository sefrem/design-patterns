package com.company.adapter;

public class VividFilter implements Filter{
    @Override
    public void apply(Image image) {
        System.out.println("Vivid filter applied");
    }
}
