package com.example.j8_new_features;

public class JoinerMethod
{
    public static void main(String[] args){
        String stooges = String.join(",","Larry", "abc", "DisplayOnScreen", "Dave");
        System.out.println(stooges);

        String[] states = {"Cali", "Oreg", "Wash"};
        String statesList = String.join(",", states);
        System.out.println(statesList);
    }
}
