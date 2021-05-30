package com.sda.example.ex27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Joiner<T> {

    private final String separator;
    private final List<T> items;

    public Joiner(String separator) {
        this.separator = separator;
        this.items = new ArrayList<>();
    }

    public void join(T item) {
        this.items.add(item);
    }

    public String toString() {
        return items.stream()
                .map(Object::toString)
                .collect(Collectors.joining(this.separator));
    }

    public String toString2() {
        StringBuilder builder = new StringBuilder();

        Iterator<T> iterator = items.iterator();

        while (iterator.hasNext()) {
            T item = iterator.next();
            builder.append(item);

            if (iterator.hasNext()) {
                builder.append(separator);
            }
        }

        return builder.toString();
    }
}
