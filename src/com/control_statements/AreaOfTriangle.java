package com.control_statements;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the base : ");
        double base = scn.nextInt();

        System.out.print("Enter the height : ");
        double height = scn.nextInt();

        double areaOfTriangle = (base * height )/2;

        System.out.println("Area of Triangle: "+ (int) areaOfTriangle);
    }
}
