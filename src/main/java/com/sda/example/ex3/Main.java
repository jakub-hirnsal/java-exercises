package com.sda.example.ex3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Java", 18);
        myMap.put("Python", 1);
        myMap.put("PHP", 0);

        printMap(myMap);
    }

    public static void printMap(Map<String, Integer> map) {
        var iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            var item = iterator.next();
            System.out.printf("Key: %s, Value: %d", item.getKey(), item.getValue());

            if (iterator.hasNext()) {
                System.out.print(",\n");
            } else {
                System.out.print(".\n");
            }
        }
    }
}
