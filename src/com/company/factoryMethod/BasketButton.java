package com.company.factoryMethod;

public class BasketButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering the basket button");
    }

    @Override
    public void onClick() {
        System.out.println("Clicking the basket button");
    }
}
