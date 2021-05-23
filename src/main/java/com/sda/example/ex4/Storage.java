package com.sda.example.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

    private final Map<String, List<String>> storageMap;

    public Storage() {
        this.storageMap = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        if (!this.storageMap.containsKey(key)) {
            this.storageMap.put(key, new ArrayList<>());
        }

        this.storageMap.get(key).add(value);
    }

    /**
     * Print all values associated with given key.
     * @param key String
     */
    public void printValues(String key) {
        this.storageMap.get(key)
                .forEach(System.out::println);
    }

    /**
     * Find keys by given value using Stream API.
     * @param value String
     */
    public void findValues(String value) {
        this.storageMap
                .entrySet()
                .stream()
                .filter(stringListEntry -> stringListEntry.getValue().contains(value))
                .forEach(stringListEntry -> System.out.println(stringListEntry.getKey()));
    }

    /**
     * Find keys by given value using "old style".
     * @param value String
     */
    public void findValues2(String value) {
        for (Map.Entry<String, List<String>> entry : this.storageMap.entrySet()) {
            if (entry.getValue().contains(value)) {
                System.out.println(entry.getKey());
            }
        }
    }
}
