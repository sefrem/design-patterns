package com.codewithmosh.template;

public class StateWindow extends Window {

    public void SaveAndClose() {
        System.out.println("Saved");
        close();
        System.out.println("Changed the state after the window was closed");
    }
}
