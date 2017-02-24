package com.example.j8_new_features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class TraverseCollection
{
    public static void main(String[] args)
    {
        Collection<String> strings = new ArrayList<>();
        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("DDD");
        strings.add("EEE");

        Consumer<String> consumer = (str) -> {
            System.out.println(str);
        };

        // instead of foreach loop spanning 3 lines
        strings.forEach(str -> System.out.println(str));
        // this does the same as the above since we have defined our consumer impl and it knows what to do!
        strings.forEach(consumer);


    }
}
