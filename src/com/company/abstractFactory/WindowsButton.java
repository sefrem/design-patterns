package com.company.abstractFactory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button");
    }
}
