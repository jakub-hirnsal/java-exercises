package com.sda.example.ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> myList = List.of("Karel", "Franta", "Pepa", "Ota", "Jirka");

        List<String> sortedList = sortReverse(myList);

        System.out.println(sortedList);
    }

    public static List<String> sortReverse(List<String> list) {
        return list
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
