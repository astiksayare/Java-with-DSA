package com.assignment1;

import java.util.Scanner;
import  java.lang.Math;

// Find the given number is Armstrong or not.
public class ArmstrongNumber {

    static int isArmstrong(int number){
        int num = number;
        int sum = 0;
        int count = 0;

        while (number != 0){
            count++;
            number /= 10;
        }

        while (num != 0)
        {
            int rem = num % 10;
            sum += Math.pow(rem, count);
            num /= 10;
        }

        return sum;
    }


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scn.nextInt();

        int result = isArmstrong(number);

        if (number == result)
            System.out.println(number +" is a Armstrong number.");
        else
            System.out.println(number +" is not Armstrong number.");
    }
}
