package com.sda.example.ex28;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        list.add("l");
        list.add("m");
        list.add("n");
        list.add("o");
        System.out.println(list.getEveryNthElement(2, 3));
        System.out.println(list.getEveryNthElement2(2, 3));
    }
}
