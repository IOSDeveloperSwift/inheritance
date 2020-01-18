package com.Doloscan;

import com.Doloscan.three.Point;
import com.Doloscan.two.Rectangle;

public class Main {

    public static void main(String[] args) {

        Point p = new Point(5,5);
        Rectangle rectangle = new Rectangle(p,3,2);
        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getSurface());
        rectangle.move(10,12);
        System.out.println(rectangle);
    }
}
