package com.control_statements;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scn.nextInt();

        System.out.print("Enter the height: ");
        int height = scn.nextInt();

        int areaOfRectangle = base * height;

        System.out.println("Area of Rectangle is: "+ areaOfRectangle);
    }
}
