package com.sda.example.ex36;

public class Main {

    private static Thread thread1;
    private static Thread thread2;

    public static void main(String[] args) {

        thread1 = new Thread(new ThreadPlaygroundRunnable("first"));
        thread2 = new Thread(new ThreadPlaygroundRunnable("second"));

        thread1.start();
        thread2.start();
    }
}
