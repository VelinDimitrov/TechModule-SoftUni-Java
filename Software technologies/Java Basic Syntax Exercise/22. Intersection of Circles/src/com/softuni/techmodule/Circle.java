package com.softuni.techmodule;

public class Circle extends Point {
    private double radius;



    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
