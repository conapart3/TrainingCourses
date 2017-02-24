package com.example.lambda_exp_in_java;

@FunctionalInterface
public interface Calculate
{
    int calc(int x, int y);

    // only 1 abstract method in functional interfaces
//    double calc(double x, double y);
}
