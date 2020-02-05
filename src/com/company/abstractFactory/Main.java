package com.company.abstractFactory;

public class Main {
    public static void main(String[] args) {
        var application = new Application(new WindowsFactory());
        application.render();

        var anotherApplication = new Application(new MacOsFactory());
        anotherApplication.render();
    }
}
