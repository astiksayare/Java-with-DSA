package com.number_problem;

//Take a number input and print the multiplication table for it.
import  java.util.Scanner;

class Multiplication {
     static  void table(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num +" * "+ i +" = "+ (num*i));
        }
    }

}

public class NumberTable {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scn.nextInt();

        // Multiplication table.
        Multiplication.table(number);

    }

}
