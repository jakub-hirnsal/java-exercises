package com.sda.example.ex23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Zoo {

    private final List<String> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public int getNumberOfAllAnimals() {
        return this.animals.size();
    }

    public Map<String, Integer> getAnimalsCount() {
        return this.animals.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));
    }

    public Map<String, Integer> getAnimalsCount2() {
        Map<String, Integer> frequencies = new HashMap<>();

        for (String animal : animals) {
            if (!frequencies.containsKey(animal)) {
                frequencies.put(animal, 1);
            } else {
                Integer actualCount = frequencies.get(animal);
                frequencies.put(animal, actualCount + 1);
            }
        }

        return frequencies;
    }

    public Map<String, Integer> getAnimalsCountSorted() {
        return getAnimalsCount().entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue() - entry1.getValue())
                .collect(
                        LinkedHashMap::new,
                        (map, entry) -> map.put(entry.getKey(), entry.getValue()),
                        Map::putAll
                );
    }

    public void addAnimals(String name, int count) {
        for (var i = 0; i < count; i++) {
            this.animals.add(name);
        }
    }
}
