package com.company.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructMomsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println(carManual.print());
    }
}
