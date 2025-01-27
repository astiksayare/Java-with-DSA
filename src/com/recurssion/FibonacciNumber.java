package com.recurssion;

import java.util.Scanner;

public class FibonacciNumber {

    static void fibo(int firstNum, int secondNum, int count, int target){

        System.out.print(firstNum+ " ");
        if(count == target){
            return;
        }
        fibo(firstNum + secondNum, firstNum, count+1, target);
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int target = scn.nextInt();
        System.out.println("Fibonacci Series up-to "+ target +"th number");
        fibo(0, 1, 1, target);
        System.out.println();
    }
}
