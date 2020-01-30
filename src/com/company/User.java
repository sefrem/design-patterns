package com.company;

public class User {
    public String name;
    public String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void sayHello() {
        System.out.print("HI, i'm " + name + " " + surname);
    }
}
