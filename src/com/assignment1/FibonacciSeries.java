package com.assignment1;

import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.
public class FibonacciSeries {

    // method to print the fibonacci series.
    static void printFibonacciSeries(int num){

        int container1 = 0;
        int container2 = 1;

        for (int i = 0; i < num-2; i++) {
            int temp = container1 + container2;

            System.out.print(temp+ " ");

            // Swipe logic
            container1 = container2;
            container2 = temp;
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scn.nextInt();

        System.out.print(0 +" "+ 1 +" ");
        FibonacciSeries.printFibonacciSeries(number);
    }

}
