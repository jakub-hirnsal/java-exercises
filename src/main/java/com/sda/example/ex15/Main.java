package com.sda.example.ex15;

public class Main {
    public static void main(String[] args) {
        Car bmw = Car.BMW;

        System.out.println("isRegular: " + bmw.isRegular());
        System.out.println("isPremium: " + bmw.isPremium());
        System.out.println("isFasterThan FERRARI: " + bmw.isFasterThan(Car.FERRARI));

        Car fiat = Car.FIAT;

        System.out.println("isRegular: " + fiat.isRegular());
        System.out.println("isPremium: " + fiat.isPremium());
        System.out.println("isFasterThan TOYOTA: " + fiat.isFasterThan(Car.TOYOTA));
        System.out.println(fiat.compareTo(Car.BMW));
    }
}
