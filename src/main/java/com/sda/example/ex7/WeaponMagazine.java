package com.sda.example.ex7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;
import java.util.Stack;

public class WeaponMagazine {

    // FIFO a LIFO
    private final Deque<String> magazine;
    private final Stack<String> stack;
    private int size;

    public WeaponMagazine(int size) {
        this.size = size;
        this.magazine = new ArrayDeque<>(size);
        this.stack = new Stack<>();
    }

    public void loadBullet(String bullet) throws Exception {
        if (this.stack.size() == size) {
            throw new Exception("Cartridge is full");
        }
//        this.cartridge.offerFirst(bullet);
        this.stack.push(bullet);
    }

    public boolean isLoaded() {
        //return !this.cartridge.isEmpty();
        return !this.stack.isEmpty();
    }

    public void shot() {
        try {
            String bullet = this.stack.pop();
            System.out.println(bullet);
        } catch (EmptyStackException exception) {
            System.out.println("empty magazine");
        }

//        String bullet = this.cartridge.pollFirst();
//
//        if (bullet != null) {
//            System.out.println(bullet);
//        } else {
//            System.out.println("empty magazine");
//        }
    }
}
