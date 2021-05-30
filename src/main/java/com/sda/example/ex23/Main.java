package com.sda.example.ex23;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimals("papoušek", 3);
        zoo.addAnimals("lev", 1);
        zoo.addAnimals("surikati", 10);
        zoo.addAnimals("tučňák", 5);

        System.out.println(zoo.getNumberOfAllAnimals());

        System.out.println(zoo.getAnimalsCount());
        System.out.println(zoo.getAnimalsCount2());
        System.out.println(zoo.getAnimalsCountSorted());
    }
}
