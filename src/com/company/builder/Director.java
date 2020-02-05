package com.company.builder;

import com.company.builder.components.AudioSystem;
import com.company.builder.components.Engine;
import com.company.builder.components.Transmission;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(5.0, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setAudioSystem(new AudioSystem(5));
    }

    public void constructMomsCar(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(99);
        builder.setEngine(new Engine(1.0, 10000));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setAudioSystem(new AudioSystem(3));
    }

}
