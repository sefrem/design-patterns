package com.company.builder.components;

public class AudioSystem {
    private final int number_of_speakers;

    public AudioSystem(int number_of_speakers) {
        this.number_of_speakers = number_of_speakers;
    }

    public int getNumber_of_speakers() {
        return number_of_speakers;
    }
}
