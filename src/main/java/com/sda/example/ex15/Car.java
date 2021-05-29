package com.sda.example.ex15;

public enum Car {

    FERRARI(10000D, 250), // 0
    PORSCHE(70000D, 210), // 1
    MERCEDES(60000D, 230), // 2
    BMW(50000D, 170), // 3
    OPEL(10000D, 80), // 4
    FIAT(20000D, 700), // 5
    TOYOTA(30000D, 110); // 6

    public final double price;
    public final int power;

    private Car(double price, int power) {
        this.price = price;
        this.power = power;
    }

    public boolean isPremium() {
        return !isRegular();
    }

    public boolean isRegular() {
        return this.price < 40000D;
    }

    public boolean isFasterThan(Car car) {
        return this.compareTo(car) < 0;
    }
}
