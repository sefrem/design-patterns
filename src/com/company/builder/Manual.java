package com.company.builder;

import com.company.builder.components.AudioSystem;
import com.company.builder.components.Engine;
import com.company.builder.components.Transmission;

public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final AudioSystem audioSystem;


    public Manual(Type type, int seats, Engine engine, Transmission transmission,  AudioSystem audioSystem) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.audioSystem = audioSystem;
    }

    public String print() {
        String string = "\"Type of car " + type +
                        "\"Number of seats " + seats +
                     "Engine volume " + engine.getVolume() +
                "Transmission " + transmission  +
                "Audio " + audioSystem;
       return string;

    }
}
