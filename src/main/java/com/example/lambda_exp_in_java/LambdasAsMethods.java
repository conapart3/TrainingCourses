package com.example.lambda_exp_in_java;

import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class LambdasAsMethods
{
    public static void main(String[] args)
    {
        // An intfunction which turns an integer into a string
        IntFunction<String> intToString = num -> Integer.toString(num);
        System.out.println(intToString.apply(5));

        // An intfunction which turns an integer into a string using :: syntax
        IntFunction<String> intToString2 = Integer::toString;
        System.out.println(intToString2.apply(24215));

        // A function which creates a new big int from a string?
        Function<String, BigInteger> newBigInt = BigInteger::new;
        System.out.println(newBigInt.apply("12345689"));

        // a consumer which calls sysout using :: syntax
        Consumer<String> consumer = System.out::println;
        consumer.accept("String to output");

        // a unary operator which uses :: syntax to concat onto "Hello "
        UnaryOperator<String> makeGreeting = "Hello, "::concat;
        System.out.println(makeGreeting.apply("Conal"));
    }
}
