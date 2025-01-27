package com.functions;

import java.util.Scanner;

// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class CircumferenceAndAreaOfCircleMethods {

    static final double pi = 3.14;

    static double circumferenceOfCircle(double radius){
        return 2 * pi * radius;
    }

    static double areaOfCircle(double radius){
        return pi*Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the radius value: ");
        double radius = scn.nextDouble();

        double circumferenceVal = circumferenceOfCircle(radius);
        double areaVal = areaOfCircle(radius);

        System.out.println("Circumference of Circle is: "+circumferenceVal);
        System.out.println("Area of Circle is: "+ areaVal);
    }
}
