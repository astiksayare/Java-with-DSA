package com.assignment1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Select one operator (+, -, *, /): ");
        char op = scn.next().charAt(0);

        System.out.print("Enter the first number: ");
        int num1 = scn.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scn.nextInt();

        if (op == '+'){
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        }
        else  if (op == '-'){
            System.out.println(num2 + " - " + num1+ " = " + (num2-num1));
        }
        else  if (op == '*'){
            System.out.println(num1 + " * " + num2+ " = " + (num1*num2));
        }
        else  if (op == '/'){
            System.out.println(num2 + " / " + num1+ " = " + (num2/num1));
        }
    }
}
