package com.assignment1;

import java.util.Scanner;

// To find out whether the given String is Palindrome or not.
public class PalindromeString {

   static String reverseString(String str){

       String temp = "";

       // Using Array
       char[] arr = str.toCharArray();
       for (int i = arr.length - 1; i >= 0; i--) {
           temp += arr[i];
       }

       /*
            Without using array
             for (int i = str.length() - 1; i >= 0; i--) {
                temp += str.charAt(i);
             }
        */

       return temp;
   }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the String value: ");
        String str = scn.next();

        String newStr = reverseString(str);
        System.out.println(newStr +" --- revere of the String.");
        boolean palindrome = str.equalsIgnoreCase(newStr);

        if (palindrome)
            System.out.println(str + " is a Palindrome String.");
        else
            System.out.println(str +" is not a Palindrome String.");
    }
}
