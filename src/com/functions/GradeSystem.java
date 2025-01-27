package com.functions;

import java.util.Scanner;

// Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

public class GradeSystem {

    static void checkGrade(int mark){
        switch (mark/10){
            case 9 -> System.out.println("AA Grade");
            case 8 -> System.out.println("AB Grade");
            case 7 -> System.out.println("BB Grade");
            case 6 -> System.out.println("BC Grade");
            case 5 -> System.out.println("CD Grade");
            case 4 -> System.out.println("DD Grade");
            case 0  -> System.out.println("Fail");
            default -> System.out.println("Invalid Marks");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Your Marks: ");
        int mark = scn.nextInt();

        checkGrade(mark);
    }
}
