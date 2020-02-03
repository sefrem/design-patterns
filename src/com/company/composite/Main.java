package com.company.composite;

public class Main {
    public static void main(String[] args) {
        var group = new Group();
        group.add(new Shape());
        group.add(new Shape());
        var group1 = new Group();
        group1.add(group);
        group1.add(new Shape());
        group1.render();
        group1.move();

    }
}
