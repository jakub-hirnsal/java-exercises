package com.sda.example.ex37;

import com.sda.example.ex36.ThreadPlaygroundRunnable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i< 10; i++ ) {
            executor.execute(new ThreadPlaygroundRunnable("myRunnable-" + i));
        }

        executor.shutdown();
    }
}
