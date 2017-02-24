package com.example.j8_new_features;

import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class StringJoinerClass
{
    public static void main(String[] args)
    {

        StringJoiner sj = new StringJoiner(",", "{", "}");
        // set the default for empty
        sj.setEmptyValue("No stooges yet");
        System.out.println(sj);

        //add just like builder
        sj.add("abc").add("def").add("ghi");
        System.out.println(sj);

        StringJoiner sj2 = new StringJoiner(",");
        sj2.add("Shemp");
        sj.merge(sj2);
        System.out.println(sj);

        Set<String> set = new TreeSet<>();
        set.add("Cali");
        set.add("Oreg");
        set.add("Wash");
        StringJoiner sj3 = new StringJoiner("-");

        set.forEach(s -> sj3.add(s));
        System.out.println(sj3);
    }
}
