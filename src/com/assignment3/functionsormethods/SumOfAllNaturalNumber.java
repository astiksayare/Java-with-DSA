package com.assignment3.functionsormethods;

import java.util.Scanner;

public class SumOfAllNaturalNumber {

    static int sumOfAll(int num){
        int sum = 0;
        while (num  >= 1){
            sum += num--;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scn.nextInt();

        int ans = sumOfAll(number);

        System.out.println("Sum of all the natural number is: "+ ans);
    }

}
