package com.assignment1;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import  java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = 's';

        int sum = 0;
        while (true){
            System.out.print("Enter the number: ");
            int number = scn.nextInt();

            sum += number;
            System.out.println("Do you want to check the sum all the number?");
            System.out.println("click y for yes");
            ch = scn.next().charAt(0);
            if (ch == 'y' || ch == 'Y'){
                break;
            }else {
                System.out.println("Invalid click! We are continue with your program...");
            }

        }

        System.out.println("Sum of all the number is : "+ sum);

    }
}
