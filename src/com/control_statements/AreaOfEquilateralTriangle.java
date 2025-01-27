package com.control_statements;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the side value: ");
        double side = scn.nextInt();

        double areaOfEquilateralTriangle = (Math.sqrt(3)*side*side)/4;

        System.out.println("Area of Equilateral Triangle is: "+ areaOfEquilateralTriangle);

    }
}
