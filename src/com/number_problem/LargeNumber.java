package com.number_problem;

//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargeNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scn.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scn.nextInt();

        int max = num1;

        if(num2 > max) max = num2;

        System.out.println(max+ " is the Greatest number.");
    }
}
