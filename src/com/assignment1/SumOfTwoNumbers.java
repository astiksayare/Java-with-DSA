package com.assignment1;
//Take two numbers and print the sum of both.
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scn.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scn.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println(firstNumber + " + " + secondNumber +" = "+ sum);
    }
}
