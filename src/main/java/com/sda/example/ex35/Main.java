package com.sda.example.ex35;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);
        thread.start();

        Thread thread1 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        thread1.start();
    }
}
