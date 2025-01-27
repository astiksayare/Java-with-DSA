package com.control_statements;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class SumOfAllNumber {
    static int sumOfAll(){
        int sum = 0;
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scn.nextInt();

        while (num != 0){
            sum += num;
            System.out.print("Enter the number: ");
            num = scn.nextInt();
        }
        return  sum;
    }

    public static void main(String[] args) {
        int ans = SumOfAllNumber.sumOfAll();
        System.out.println("Sum of all the above numbers is: "+ ans);
    }
}
