package com.company.abstractFactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Windows Checkbox");
    }
}
