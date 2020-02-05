package com.company.bridge;

public class Main {
    public static void main(String[] args) {
        var remote = new RemoteControl(new SonyTv());
        remote.turnOff();
        remote.turnOn();
    }

}
