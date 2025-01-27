package com.number_problem;

import java.util.Scanner;

public class NthPrimeNumber {

    static boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    static int nthPrimeNumber(int num){
        int count = 0;
        int number = 2;
        while (true) {
            if (isPrime(number)) {
                count++;
                if(count == num) return number;
            }
            number++;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scn.nextInt();

        int ans = nthPrimeNumber(num);

        System.out.println(ans);
    }
}
