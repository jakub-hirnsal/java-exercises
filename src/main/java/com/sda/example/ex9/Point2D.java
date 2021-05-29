package com.sda.example.ex9;

import com.sda.example.ex10.Movable;
import com.sda.example.ex10.MoveDirection;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Point2D implements Movable {

    private double x;
    private double y;

    @Override
    public void move(MoveDirection moveDirection) {
        this.x += moveDirection.getX();
        this.y += moveDirection.getY();
    }
}
