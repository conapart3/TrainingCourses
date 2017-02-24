package com.example.j8_new_features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class UseComparator
{
    public static void main(String[] args)
    {
        Collection<String> strings = new ArrayList<>();
        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("DDD");
        strings.add("EEE");

        Comparator<String> comp = (str1, str2) -> {
            return str1.compareToIgnoreCase(str2);
        };

//        Collections.sort(strings, comp);
    }
}
