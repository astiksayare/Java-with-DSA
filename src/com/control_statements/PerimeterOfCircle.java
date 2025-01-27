package com.control_statements;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        final double pi = 3.14;

        System.out.print("Enter the radius: ");
        int radius = scn.nextInt();

        double perimeterOfCircle = 2*pi*radius;

        System.out.println("Perimeter of Circle is: "+ perimeterOfCircle);

    }
}
