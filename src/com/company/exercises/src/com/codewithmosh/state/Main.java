package com.company.exercises.src.com.codewithmosh.state;

public class Main {
    public static void main(String[] args){
        var travel = new Travel();
        travel.setCurrentTravelWay(new Driving());
        travel.getDirection();
        travel.getETA();
        travel.setCurrentTravelWay(new Cycling());
        travel.getETA();
        travel.getDirection();
    }
}
