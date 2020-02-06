package com.company.prototype;

public class Main {
    public static void main(String[] args) {
        var circle = new Circle();
        circle.x = 5;
        circle.radius = 15;

        var clonedCircle = (Circle) circle.clone();
        System.out.println(clonedCircle.getRadius());
    }
}
