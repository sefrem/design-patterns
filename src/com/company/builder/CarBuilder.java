package com.company.builder;

import com.company.builder.components.AudioSystem;
import com.company.builder.components.Engine;
import com.company.builder.components.Transmission;

public class CarBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private AudioSystem audioSystem;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setAudioSystem(AudioSystem audioSystem) {
        this.audioSystem = audioSystem;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, audioSystem);
    }
}
