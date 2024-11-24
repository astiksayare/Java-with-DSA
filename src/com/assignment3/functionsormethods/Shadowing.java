package com.assignment3.functionsormethods;

import java.util.Arrays;

public class Shadowing {
    static  double balance = 10000.01; // Shadowing

    static void checkBalance(int ...num) {
        System.out.println(balance);
        int balance = 100;
        System.out.println(balance);

        System.out.println(Arrays.toString(num));
    }


    public static void main(String[] args) {
        System.out.println(balance);
        int num = 20;
        int num2 = 50;
        int balance = 500;
        System.out.println(balance);
        checkBalance(1, num, 3, 4, num2, balance);
    }
}
