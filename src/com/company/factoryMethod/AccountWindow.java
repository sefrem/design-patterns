package com.company.factoryMethod;

import org.w3c.dom.ls.LSOutput;

public class AccountWindow extends Factory {
    @Override
    public Button createButton() {
        return new AccoutButton();
    }
}
