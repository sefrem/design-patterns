package com.company.builder;

import com.company.builder.components.AudioSystem;
import com.company.builder.components.Engine;
import com.company.builder.components.Transmission;

public class Car {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final AudioSystem audioSystem;


    public Car(Type type, int seats, Engine engine, Transmission transmission, AudioSystem audioSystem) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.audioSystem = audioSystem;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
