package com.design.open.close;

public class Sphere implements Shape3d {

    private double radius;

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
