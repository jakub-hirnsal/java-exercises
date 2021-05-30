package com.sda.example.ex28;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyArrayList <E> extends ArrayList<E> {

    public List<E> getEveryNthElement(int startIndex, int skip) {
        return IntStream.range(startIndex, this.size())
                .filter(n -> (n - startIndex) % (skip + 1) == 0)
                .mapToObj(i -> this.get(i))
                .collect(Collectors.toList());

    }

    public List<E> getEveryNthElement2(int startIndex, int skip) {
        List<E> list = new ArrayList<>();

        for (int i = startIndex; i  < this.size(); i++) {
            if ((i - startIndex) % (skip + 1) == 0) {
                list.add(this.get(i));
            }
        }

        return list;
    }
}
