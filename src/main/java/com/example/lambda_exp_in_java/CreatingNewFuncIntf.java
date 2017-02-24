package com.example.lambda_exp_in_java;

public class CreatingNewFuncIntf
{
    public static void main(String[] args)
    {

        // Since we have the types of the parameters specified in the Calculate interface,
        // the compiler can infer that a and b are both ints
        Calculate add = (a, b) -> a + b;
        Calculate diff = (a, b) -> Math.abs(a - b);
        Calculate divide = (a, b) -> (b != 0 ? a / b : 0);
        Calculate multiply = (a, b) -> a * b;

        System.out.println(add.calc(3, 2));
        System.out.println(diff.calc(5, 10));
        System.out.println(divide.calc(12, 0));
        System.out.println(multiply.calc(3, 5));
    }
}
