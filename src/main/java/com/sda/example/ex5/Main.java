package com.sda.example.ex5;

public class Main {
    public static void main(String[] args) throws Exception {

        SDAHashSet<String> sdaHashSet = new SDAHashSet<>();

        sdaHashSet
                .add("Peter")
                .add("George")
                .add("Jimmy");
        System.out.println(sdaHashSet);

        sdaHashSet.remove("Peter");
        System.out.println(sdaHashSet);

        int size = sdaHashSet.size();
        System.out.println(size);

        System.out.println(sdaHashSet.contains("Peter"));
        System.out.println(sdaHashSet.contains("George"));

        sdaHashSet.clear();
        System.out.println(sdaHashSet);

        // -------------------------------
        SDAHashSet<Integer> integerSDAHashSet = new SDAHashSet<>();
        integerSDAHashSet.add(10)
                .add(20)
                .add(40);
        System.out.println(integerSDAHashSet);
        //----

        SDAHashSet<Person> personSDAHashSet = new SDAHashSet<>();

        personSDAHashSet.add(new Person("George", 25));

        System.out.println(personSDAHashSet);
    }
}
