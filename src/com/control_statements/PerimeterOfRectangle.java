package com.control_statements;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length = scn.nextInt();

        System.out.print("Enter the width: ");
        int width = scn.nextInt();

        int perimeterOfRectangle = 2 * (length + width);

        System.out.println("Perimeter of Rectangle: "+ perimeterOfRectangle);
    }
}
