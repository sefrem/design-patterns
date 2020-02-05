package com.company.factoryMethod;

public abstract class Factory {

    public void renderWindow() {
        Button button  = createButton();
        button.render();
    }

    public abstract Button createButton();
}
