package com.company.exercises.src.com.codewithmosh.state;

public class Travel {
    private TravelWay currentTravelWay;

    public void getETA() {
        currentTravelWay.getETA();
    }

    public void getDirection() {
        currentTravelWay.getDirection();
    }
    public void setCurrentTravelWay(TravelWay currentTravelWay) {
        this.currentTravelWay = currentTravelWay;
    }
}
