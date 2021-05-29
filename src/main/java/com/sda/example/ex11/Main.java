package com.sda.example.ex11;

import com.sda.example.ex9.Circle;
import com.sda.example.ex9.Point2D;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(
                new Point2D(2, 1),
                new Point2D(3, 4)
        );
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());

        circle.resize(2);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
    }
}
