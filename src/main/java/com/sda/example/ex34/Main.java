package com.sda.example.ex34;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();

        myThread.start();
        myThread2.start();
        myThread3.start();
    }
}
