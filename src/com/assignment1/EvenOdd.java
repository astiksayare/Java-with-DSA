package com.assignment1;

// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scn.nextInt();

//        String str = num % 2 == 0 ? " is a Even Number" : " is a Odd Number";
        String str = (num & 1) == 0 ? " is a Even Number" : " is a Odd Number";

        System.out.println(num + str);

//        if (num % 2 == 0){
//            System.out.println(num +" is a Even number");
//        }else {
//            System.out.println(num +" is a Odd number");
//        }
    }
}
