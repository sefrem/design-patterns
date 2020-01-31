package com.company.exercises.src.com.codewithmosh.state;

public class Cycling extends TravelWay {

    private Number TravelSpeed = 2;

    @Override public Number getETA() {
        System.out.println("Calculating ETA cycling " + (this.TravelSpeed));
        return this.TravelSpeed;
    }

    @Override public Number getDirection() {
        System.out.println("Getting directions cycling " + (this.TravelSpeed));
        return this.TravelSpeed;
    }

}
