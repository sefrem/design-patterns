package com.company.abstractFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;


    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }
}
