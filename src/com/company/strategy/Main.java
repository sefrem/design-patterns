package com.company.strategy;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        var imageStorage  = new ImageStorage();
        imageStorage.store("First one", new PngCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("First one", new JpegCompressor(), new BlackAndWhiteFilter());
    }

}
