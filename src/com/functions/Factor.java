package com.functions;

import java.util.Scanner;

public class Factor {

    static int factorOf(int num){

        int fact = 1;

        if (num == 1 || num == 0)
            return 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scn.nextInt();

        int ans = factorOf(number);

        System.out.println(number + "! = "+ans);
    }
}
