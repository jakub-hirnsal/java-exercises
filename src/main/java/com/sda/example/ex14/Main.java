package com.sda.example.ex14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> randomValues = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            randomValues.add(
                    random.nextInt(50)
            );
        }

//        System.out.println(randomValues + "\n");

//        System.out.println(getUniqueValues(randomValues));
        System.out.println(getRepeatedValues(randomValues));
        System.out.println(getFrequencies(randomValues));
        System.out.println(get25MostFrequentValues(randomValues));

        System.out.println(removeDuplicates(randomValues));

    }

    public static List<Integer> getUniqueValues(List<Integer> randomValues) {
        return randomValues.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Integer> getRepeatedValues(List<Integer> values) {
        return getFrequencies(values)
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static Map<Integer, Long> getFrequencies(List<Integer> values) {
        return values.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static List<Integer> get25MostFrequentValues(List<Integer> values) {
        return getFrequencies(values)
                .entrySet().stream()
                .sorted((entry1, entry2) -> (int) (entry2.getValue() - entry1.getValue()))
                .map(Map.Entry::getKey)
                .limit(25)
                .collect(Collectors.toList());
    }

    public static List<Integer> removeDuplicates(List<Integer> values) {
        List<Integer> result = new ArrayList<>(values);
        Random random = new Random();

        getRepeatedValues(values).forEach(integer -> {
            int index = result.indexOf(integer);
            result.remove(integer);
            int newValue;

            do {
                newValue = random.nextInt();
            } while (result.contains(newValue));

            result.add(index, newValue);
        });

        return result;
    }
}
