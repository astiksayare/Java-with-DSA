package com.number_problem;

import java.util.Scanner;

public class PrimeNumbers {

    static boolean isPrime(int num){
        if(num <= 1) return false;

        int i = 2;

        while (i*i <= num){
            if(num % i == 0) return false;

            i++;
        }

        return true;
    }

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scn.nextInt();

        System.out.print("Prime numbers from 1 to "+num+" is : ");
        for(int i = 1; i <= num; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
}
