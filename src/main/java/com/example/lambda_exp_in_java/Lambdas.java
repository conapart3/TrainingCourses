package com.example.lambda_exp_in_java;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Lambdas
{
    public static void main(String[] args)
    {
        // Use a predicate to print a string if word length less than 10
        Predicate<String> pred = s -> s.length() < 10;
        System.out.println(pred.test("Sugar") + " word is less than 10 chars.");

        // Use consumer to print a string changed to lower case
        Consumer<String> consumer = s -> System.out.println(s.toLowerCase());
        consumer.accept("CONAL");

        // use function<a,b> to convert Integer to String and print
        Function<Integer, String> func = (num) -> Integer.toString(num);
        System.out.println("Length of the number 26: " + func.apply(26).length());

        // Use supplier to supply a print string saying Java is fun
        Supplier<String> supplier = () -> "Java is fun";
        System.out.println(supplier.get());

        // Use a binary operator to add two integers together
        BinaryOperator<Integer> add = (i, j) -> i + j;
        System.out.println("Added = " + add.apply(1, 2));

        // Use an unary operator to change a message to be uppercase
        UnaryOperator<String> unaryOperator = (a) -> a.toUpperCase();
        System.out.println(unaryOperator.apply("this text input as lowercase and should be output as uppercase."));

        // Use a consumer func intfce and
        List<String> list = Arrays.asList("aaron", "bernard", "caleb");
        Consumer<String> hello = name -> System.out.println("Hello, " + name);
        list.stream()
            .filter(str -> str.contains("b"))
            .forEach(str -> hello.accept(str));

        // Using a custom functional interface
        GreetingFunction greeting = message -> System.out.println("message: " + message);
        greeting.sayMessage("Here is a sample message using our own functional intfce.");
    }

    @FunctionalInterface
    interface GreetingFunction
    {
        void sayMessage(String message);
    }
}
