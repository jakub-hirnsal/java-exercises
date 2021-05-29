package com.sda.example.ex9;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(
                new Point2D(1, 1),
                new Point2D(1, 3)
        );

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());

        System.out.println(
                circle.getSlicePoints()
        );
    }
}
