package com.functions;


import java.util.Scanner;

public class PrimeNumberInRange {

    static void getPrimeNumbers(int start, int end){

        for (int i = start; i <= end; i++) {
            if (PrimeNumberMethod.isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scn.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scn.nextInt();

        getPrimeNumbers(start, end);
    }
}
