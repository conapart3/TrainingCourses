package com.example.j8_new_features;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream
{

    public static void main(String[] args)
    {
        Person[] people = {
            new Person("Joe", 48),
            new Person("Mary", 30),
            new Person("Mike", 73)
        };

//        for (int i = 0; i < people.length; i++) {
//            System.out.println(people[i].getPersonInfo());
//        }

        Stream<Person> stream = Stream.of(people);
        stream.forEach(p -> System.out.println(p.getPersonInfo()));

        // these do the exact same thing
        Stream<Person> stream2 = Arrays.stream(people);
        stream2.forEach(p -> System.out.println(p.getPersonInfo()));
    }
}
