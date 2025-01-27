package com.control_statements;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        final double pi = 3.14;
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the radius value: ");
        int radius = scn.nextInt();

        double areaOfCircle = pi * radius * radius;

        System.out.println("Area of Circle is: "+ areaOfCircle);

    }
}
