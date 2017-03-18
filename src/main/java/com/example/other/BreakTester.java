package com.example.other;

/**
 * Created by Conal on 18/03/2017.
 */
public class BreakTester {

    public static void main(String[] args) {

        outerloop:
        for (int a = 0; a < 25; a++) {
            System.out.println("a: " + a);
            innerloop1:
            for (int b = 0; b < 25; b++) {
                System.out.println("b: " + b);
                innerloop2:
                for (int c = 0; c < 25; c++) {
                    System.out.println("c: " + c);
                    break outerloop;
                }
            }
        }
    }
}
