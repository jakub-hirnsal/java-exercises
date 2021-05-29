package com.sda.example.ex9;

import com.sda.example.ex10.Movable;
import com.sda.example.ex10.MoveDirection;
import com.sda.example.ex11.Resizable;
import java.util.List;

public class Circle implements Movable, Resizable {

    private final Point2D center;
    private final Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        return getDistance();
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public List<Point2D> getSlicePoints() {
        double pointAngleInRad = findPointAngle();

        return List.of(
                getNewPointAtAngle(pointAngleInRad + Math.toRadians(90)),
                getNewPointAtAngle(pointAngleInRad + Math.toRadians(180)),
                getNewPointAtAngle(pointAngleInRad + Math.toRadians(270))
        );
    }

    private double getDistance() {
        return Math.sqrt(Math.pow((point.getX() - center.getX()), 2) + Math.pow((point.getY() - center.getY()), 2));
    }

    private double findPointAngle() {
        return Math.atan2(
                point.getY() - center.getY(),
                point.getX() - center.getX()
        );
    }

    private Point2D getNewPointAtAngle(double angle) {
        return new Point2D(
                round(center.getX() + (getRadius() * Math.cos(angle)), 100),
                round(center.getY() + (getRadius() * Math.sin(angle)), 100)
        );
    }

    private double round(double value, float div) {
        return Math.round(value * div) / div;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.point.move(moveDirection);
        this.center.move(moveDirection);
    }

    @Override
    public void resize(double resizeFactor) {
        // TODO: Fix this implementation
        this.point.setX(
                this.point.getX() * resizeFactor
        );
        this.point.setY(
                this.point.getY() * resizeFactor
        );
    }
}
