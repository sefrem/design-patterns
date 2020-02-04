package com.company.flywheel;

public class Main {
    public static void main(String[] args) {
        var pointService = new PointService(new PointIconFactory());
        for (var point : pointService.getPoints())
            point.draw();
    }
}
