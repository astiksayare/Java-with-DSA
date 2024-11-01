package com.assignment2.conditionsandloops;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the largest number from all.
public class LargestNumberOfAllNumber {
    static int largeNumber(){
        Scanner scn  = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scn.nextInt();

        int max = num;
        while (num != 0){
            System.out.print("Enter the number: ");
            num = scn.nextInt();

            if (num > max) max = num;
        }

        return max;
    }

    public static void main(String[] args) {
        int max = largeNumber();
        System.out.println("The largest number is: "+ max);
    }

}
