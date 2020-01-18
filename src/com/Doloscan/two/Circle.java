package com.Doloscan.two;

import com.Doloscan.three.Point;

abstract public class Circle extends Shape {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getSurface() {
        return 3.14 * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public void move(double dx, double dy) {
        center.move(dx,dy);

    }

    @Override
    public String toString() {
        return "Center=" + center +
                ",Radius=" + radius;
    }
}
