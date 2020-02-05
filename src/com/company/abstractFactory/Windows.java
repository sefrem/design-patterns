package com.company.abstractFactory;

public class Windows implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button");
    }
}
