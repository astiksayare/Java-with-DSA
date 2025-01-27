package com.number_problem;

// Take in two numbers and an operator (+, -, *, /) and calculate the value till the user click on x to terminate the program.
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        while (true){
            System.out.print("Enter the operator: ");
            char op = scn.next().trim().charAt(0);

            if (op == '+'){
                System.out.println("Enter the first number: ");
                int num1 = scn.nextInt();
                System.out.println("Enter the second number: ");
                int num2 = scn.nextInt();

                System.out.println(num1 + " + " + num2 +" = "+ (num1 + num2));
            } else if (op == '-'){
                System.out.println("Enter the first number: ");
                int num1 = scn.nextInt();
                System.out.println("Enter the second number: ");
                int num2 = scn.nextInt();

                System.out.println(num1 + " - " + num2 +" = "+ (num1 - num2));
            } else if (op == '*'){
                System.out.println("Enter the first number: ");
                int num1 = scn.nextInt();
                System.out.println("Enter the second number: ");
                int num2 = scn.nextInt();

                System.out.println(num1 + " * " + num2 +" = "+ (num1 * num2));
            } else if (op == '%'){
                System.out.println("Enter the first number: ");
                int num1 = scn.nextInt();
                System.out.println("Enter the second number: ");
                int num2 = scn.nextInt();

                System.out.println(num1 + " % " + num2 +" = "+ (num1 % num2));
            }else if (op == '/'){
                System.out.println("Enter the first number: ");
                int num1 = scn.nextInt();
                System.out.println("Enter the second number: ");
                int num2 = scn.nextInt();

                if (num2 != 0){
                    System.out.println(num1 + " / " + num2 +" = "+ (num1 / num2));
                }else {
                    System.out.println("Cannot be divided by 0");
                }

            }else if (op == 'x' || op == 'X'){
                System.out.println("Program End");
                break;
            }else {
                System.out.println("Invalid Operator");
            }
        }

    }
}
