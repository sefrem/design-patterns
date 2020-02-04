package com.company.flywheel;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }

    public List<Point> getPoints() {
         List<Point> points = new ArrayList<>();
            var point = new Point(1, 2, iconFactory.getPointIcon(PointType.CAGE));
            points.add(point);
            points.add(new Point(3, 56, iconFactory.getPointIcon(PointType.TRADE_CENTER)));
            return points;
    }

}
