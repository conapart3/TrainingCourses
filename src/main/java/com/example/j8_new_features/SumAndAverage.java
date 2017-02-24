package com.example.j8_new_features;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class SumAndAverage
{
    public static void main(String args[])
    {
        System.out.println("Creating list:");
        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

        // Getting stream of primitive type int from a complex object stream
        // and we can use this stream of ints to sum() them
        int sum = people.stream().mapToInt(p -> p.getAge()).sum();

        System.out.println("Sum: " + sum);

        OptionalDouble avg = people.stream()
            .mapToInt(p -> p.getAge())
            .average();

        // with an optional before processing we need to make sure it actually has a value.
        if (avg.isPresent()) {
            System.out.println("Average: " + avg.getAsDouble());
        } else {
            System.out.println("Average not calculated");
        }
    }

}
