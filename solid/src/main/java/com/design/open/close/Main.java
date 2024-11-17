package com.design.open.close;

public class Main {
    public static void main(String[] args) {

            Rectangle rectangle = new Rectangle(10, 20);
            Circle circle = new Circle(10);

            System.out.println("Area of rectangle: " + rectangle.calculateArea());
            System.out.println("Area of circle: " + circle.calculateArea());

            Sphere s1 = new Sphere(10);

        System.out.println("Area of sphere: " + s1.calculateArea());
        System.out.println("Volume of sphere: " + s1.calculateVolume());

    }
}
