package com.Doloscan.three;


public class Point {
    private double x;
    private double y;

    public  double distanceTo(Point point){
        return Math.sqrt(Math.pow(point.getX() - this.x,2) + (Math.pow(point.getY() - this.y,2)));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public Point(double n) {
        this(n, n);
    }

    public Point() {
        this(0, 0);
    }

    public Point(Point p) {
        this(p.getX(), p.getY());
    }

    public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    public void display() {
        System.out.println("< " + getX() + " ; " + getY() + " >");
    }

    public boolean isAtSamePosition(Point p) {
        return ((p.getX() == this.getX()) && (p.getY() == this.getY()));
    }

    public String toString() {
        return ("< " + getX() + " ; " + getY() + " >");
    }
}

