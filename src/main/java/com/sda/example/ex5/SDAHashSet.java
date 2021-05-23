package com.sda.example.ex5;

import java.util.HashSet;
import java.util.Set;

public class SDAHashSet<E> {

    private static final int MAX_SIZE = 100;

    private Set<E> set;

    public SDAHashSet() {
        this.set = new HashSet<>();
    }

    public SDAHashSet<E> add(E value) throws Exception {
        if (set.size() == MAX_SIZE) {
            throw new Exception("Max size is " + MAX_SIZE);
        }

        this.set.add(value);
        return this;
    }

    public void remove(E value) {
        this.set.remove(value);
    }

    public int size() {
        return this.set.size();
    }

    public boolean contains(E value) {
        return set.contains(value);
    }

    public void clear() {
        this.set.clear();
    }

    /**
     * To String method.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "SDAHashSet{"
                + "set=" + set
                + '}';
    }
}
