package com.assignment3.functionsormethods;


import java.util.Scanner;

public class PrimeNumberInRange {

    static void getPrimeNumbers(int start, int end){

        for (int i = start; i <= end; i++) {
            if (isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }

    static boolean isPrime(int num){

        if(num <= 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
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
