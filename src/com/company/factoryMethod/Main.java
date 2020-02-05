package com.company.factoryMethod;

public class Main {
    public static void main(String[] args) {
        var accountWindow = new AccountWindow();
        accountWindow.renderWindow();
        accountWindow.createButton().onClick();
        var basket = new BasketButton();
        basket.onClick();
    }
}
