package com.assignment2.conditionsandloops;

import java.util.Scanner;

// Reverse A String In Java
public class ReverseString {

    static  String reverseString(String str){
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your string value: ");
        String userStr = scn.next();

        String str = reverseString(userStr);

        System.out.println(str.toUpperCase());
    }
}
