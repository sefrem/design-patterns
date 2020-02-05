package com.company.factoryMethod;

public class AccoutButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering an an account button");
    }

    @Override
    public void onClick() {
        System.out.println("Clicking the account button");
    }
}
