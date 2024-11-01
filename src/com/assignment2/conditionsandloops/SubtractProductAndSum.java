package com.assignment2.conditionsandloops;

import java.util.Scanner;

// Subtract the Product and Sum of Digits of an Integer
public class SubtractProductAndSum {
    static int subtractProductAndSum(int num){
        int product = 1;
        int sum = 0;

        while (num > 0){
            int rem = num % 10;
            product *= rem;
            sum += rem;
            num /= 10;
        }

        return (product - sum);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scn.nextInt();

        int result = SubtractProductAndSum.subtractProductAndSum(number);

        System.out.println("Result: "+ result);

    }
}
