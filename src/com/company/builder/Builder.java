package com.company.builder;

import com.company.builder.components.AudioSystem;
import com.company.builder.components.Engine;
import com.company.builder.components.Transmission;

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setAudioSystem(AudioSystem audioSystem);
}

