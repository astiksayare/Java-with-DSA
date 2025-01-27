package com.functions;

import java.util.Scanner;

//Define a method to find out if a number is prime or not.
public class PrimeNumberMethod {

    static boolean isPrime(int num){

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scn.nextInt();

        boolean ans = isPrime(number);

        if (ans){
            System.out.println(number+ " is a prime number.");
        }else {
            System.out.println(number+ " is not a prime number");
        }
    }
}
