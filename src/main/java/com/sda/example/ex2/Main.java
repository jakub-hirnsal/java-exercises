package com.sda.example.ex2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> myList = List.of("Karel", "karel2", "Franta", "Pepa", "pepa2", "Ota", "Jirka");

        List<String> sortedList = sortReverse(myList);

        System.out.println(sortedList);
    }

    public static List<String> sortReverse(List<String> list) {
        return list
                .stream()
                .sorted((t1, t2) -> t2.compareToIgnoreCase(t1))
//                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
