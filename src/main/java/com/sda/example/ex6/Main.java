package com.sda.example.ex6;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("Škoda", "Octavia");
        map.put("Volkswagen", "Up");
        map.put("Ford", "Mustang");
        map.put("Dodge", "Challenger");

        printFirstAndLast(map);
    }

    public static <K, V> void printFirstAndLast(TreeMap<K, V> map) {
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
    }
}
