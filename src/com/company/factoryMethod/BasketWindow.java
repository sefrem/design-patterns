package com.company.factoryMethod;

public class BasketWindow extends Factory {
    @Override
    public Button createButton() {
        return new BasketButton();
    }
}
