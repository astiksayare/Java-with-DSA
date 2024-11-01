package com.assignment2.conditionsandloops;

import java.util.Scanner;

public class Factor {
    static void factor(int num){
        for (int i = 1; i <=num/2; i++) {
            if (num % i == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scn.nextInt();

        factor(number);
    }
}
