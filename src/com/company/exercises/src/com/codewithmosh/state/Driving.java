package com.company.exercises.src.com.codewithmosh.state;

public class Driving extends TravelWay {

    private Number TravelSpeed = 1;

    @Override public Number getETA() {
        System.out.println("Calculating ETA driving" + (this.TravelSpeed));
        return this.TravelSpeed;
    }

    @Override public Number getDirection() {
        System.out.println("Getting directions driving" + (this.TravelSpeed));
        return this.TravelSpeed;
    }

}
