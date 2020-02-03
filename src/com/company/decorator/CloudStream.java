package com.company.decorator;

public class CloudStream implements Stream {
    @Override
    public void write(String data) {
        System.out.println("Storing some data" + data);
    }
}
