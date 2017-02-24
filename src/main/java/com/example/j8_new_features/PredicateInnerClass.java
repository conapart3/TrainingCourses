package com.example.j8_new_features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInnerClass
{
    public static void main(String[] args)
    {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 25));
        people.add(new Person("Mary", 65));
        people.add(new Person("Mike", 66));

        Predicate<Person> predOlder = (person) -> person.getAge() >= 65;
        Predicate<Person> predYounger = (person) -> person.getAge() <= 40;

        displayPeople(people, predOlder);
        displayPeople(people, predYounger);

        // You could also use both predicates like this:
        people.forEach(p -> {
            if (predOlder.test(p) || predYounger.test(p)) {
                System.out.println(p);
            }
        });
    }

    private static void displayPeople(List<Person> people, Predicate<Person> pred)
    {
        people.forEach(p -> {
            if (pred.test(p)) {
                System.out.println(p);
            }
        });
    }
}
