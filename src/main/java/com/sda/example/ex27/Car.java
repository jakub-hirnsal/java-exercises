package com.sda.example.ex27;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String type;
    private String model;

    /**
     * To String method.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Auto je " + model + " a typ" + type;
    }
}
