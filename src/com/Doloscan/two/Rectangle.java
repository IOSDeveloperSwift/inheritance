package com.Doloscan.two;


import com.Doloscan.three.Point;

public class Rectangle extends Polygon {
    public Rectangle(Point topRightCorner, int width, int height) {
        Point topLeftCorner = new Point(topRightCorner.getX() - width, topRightCorner.getY());
        Point bottomLeftCorner = new Point(topLeftCorner.getX(), topLeftCorner.getY() - height);
        Point bottomRightCorner = new Point(bottomLeftCorner.getX() + width, bottomLeftCorner.getY());

        vertices = new Point[4];
        vertices[0] = topRightCorner;
        vertices[1] = topLeftCorner;
        vertices[2] = bottomLeftCorner;
        vertices[3] = bottomRightCorner;

    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getSurface() {
        double width = vertices[1].distanceTo(vertices[0]);
        double height = vertices[0].distanceTo(vertices[3]);

        return width * height;
    }

}
