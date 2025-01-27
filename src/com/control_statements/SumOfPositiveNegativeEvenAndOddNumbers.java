package com.control_statements;

import java.util.Scanner;

// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.
public class SumOfPositiveNegativeEvenAndOddNumbers {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int sumOfPositiveNumber = 0;
        int sumOfNegativeNumber = 0;
        int sumOfEvenNumber = 0;
        int sumOfOddNumber = 0;

        System.out.print("Enter your number: ");
        int num = scn.nextInt();

        while (num != 0){

            if(num < 0){
                sumOfNegativeNumber += num;
            }else if (num % 2 == 0){
                sumOfEvenNumber += num;
            }else if (num % 2 != 0){
                sumOfOddNumber += num;
            }

            if(num > 0){
                sumOfPositiveNumber += num;
            }

            System.out.print("Enter the number: ");
            num = scn.nextInt();

        }
        System.out.println("Sum of Negative numbers are: "+ sumOfNegativeNumber);
        System.out.println("Sum of Positive numbers are: "+ sumOfPositiveNumber);
        System.out.println("Sum of Even numbers are: "+ sumOfEvenNumber);
        System.out.println("Sum of Odd numbers are: "+ sumOfOddNumber);
    }
}
