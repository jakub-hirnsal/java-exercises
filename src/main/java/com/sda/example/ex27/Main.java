package com.sda.example.ex27;

public class Main {
    public static void main(String[] args) {
        Joiner<Integer> joiner = new Joiner<>("-");
        joiner.join(10);
        joiner.join(1);
        joiner.join(15);
        joiner.join(4);

        System.out.println(joiner.toString());
        System.out.println(joiner.toString2());

        Joiner<Boolean> joiner2 = new Joiner<>("/");
        joiner2.join(true);
        joiner2.join(false);
        joiner2.join(true);
        joiner2.join(true);

        System.out.println(joiner2.toString());
        System.out.println(joiner2.toString2());

        Joiner<Car> carJoiner = new Joiner<>("/");
        carJoiner.join(new Car("Combi", "Ocavia"));
        carJoiner.join(new Car("Cupe", "mazda"));

        System.out.println(carJoiner.toString());
        System.out.println(carJoiner.toString2());
    }
}
