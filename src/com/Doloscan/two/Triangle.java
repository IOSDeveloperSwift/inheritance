package com.Doloscan.two;


import com.Doloscan.three.Point;

public class Triangle extends Polygon {

    public Triangle(Point cornerOne, Point cornerTwo, Point cornerThree) {

        vertices = new Point[3];
        vertices[0] = cornerOne;
        vertices[1] = cornerTwo;
        vertices[2] = cornerThree;
    }

    @Override
    public double getSurface() {
        double a = vertices[0].distanceTo(vertices[1]);
        double b = vertices[1].distanceTo(vertices[2]);
        double c = vertices[2].distanceTo(vertices[3]);

       double perimeter = super.getPerimeter();
       double s = perimeter / 2;
       return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public boolean isIsosceles() {

        double a = vertices[0].distanceTo(vertices[1]);
        double b = vertices[1].distanceTo(vertices[2]);
        double c = vertices[2].distanceTo(vertices[3]);

        return b == c || a == b || c ==a;
    }

    public boolean isEquilateral() {
        double a = vertices[0].distanceTo(vertices[1]);
        double b = vertices[1].distanceTo(vertices[2]);
        double c = vertices[2].distanceTo(vertices[3]);

        return a == b && b == c;
    }

    public boolean isRight() {
        double a = vertices[0].distanceTo(vertices[1]);
        double b = vertices[1].distanceTo(vertices[2]);
        double c = vertices[2].distanceTo(vertices[3]);

       return vertices[0].getX() == vertices[1].getX() && vertices[0].getY() == vertices[2].getY() ||
        vertices[0].getY() == vertices[1].getY() && vertices[1].getX() == vertices[2].getX() ||
        vertices[0].getY() == vertices[2].getY() && vertices[1].getX() == vertices[2].getX();

    }

    @Override
    public String toString() {
        return "Triangle{}";
    }
}
