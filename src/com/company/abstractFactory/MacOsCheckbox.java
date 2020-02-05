package com.company.abstractFactory;

public class MacOsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("MacOs checkbox");
    }
}
