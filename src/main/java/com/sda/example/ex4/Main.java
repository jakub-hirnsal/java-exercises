package com.sda.example.ex4;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("Karel", "car");
        storage.addToStorage("Karel", "mobile");
        storage.addToStorage("Karel", "house");

        storage.addToStorage("Jimmy", "Motorbike");
        storage.addToStorage("Jimmy", "Radio");
        storage.addToStorage("Jimmy", "house");

        storage.addToStorage("George", "bike");

        System.out.println("displaying all elements under a given key: Jimmy");
        storage.printValues("Jimmy");

        System.out.println();

        System.out.println("displaying all keys that have a given value: house");
        storage.findValues("house");
        System.out.println("displaying all keys that have a given value: house");
        storage.findValues2("house");
    }
}
