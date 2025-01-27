package com.functions;

import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class EvenOrOddMethod {

    static boolean evenOrOdd(int num) {

        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scn.nextInt();

        boolean ans = evenOrOdd(num);
        if (ans) {
            System.out.println(num+ " is a even number.");
        }else {
            System.out.println(num+ " is a odd number.");
        }
    }
}
