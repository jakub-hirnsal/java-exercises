package com.sda.example.ex10;

import com.sda.example.ex9.Circle;
import com.sda.example.ex9.Point2D;

public class Main {
    public static void main(String[] args) {
        MoveDirection moveDirection = new MoveDirection(1,2);

        Circle circle = new Circle(
                new Point2D(1, 1),
                new Point2D(3, 3)
        );
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());

        circle.move(moveDirection);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
    }
}
