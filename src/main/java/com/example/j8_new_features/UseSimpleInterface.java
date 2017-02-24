package com.example.j8_new_features;

public class UseSimpleInterface
{
    public static void main(String[] args)
    {
        SimpleInterface obj = () -> System.out.println("Say Something");

        obj.doSomething();

    }
}
