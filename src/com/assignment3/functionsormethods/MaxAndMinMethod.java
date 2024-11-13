package com.assignment3.functionsormethods;

import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class MaxAndMinMethod {

    static  int maxVal(int ...num){

        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (max < num[i]){
                max = num[i];
            }
        }
        return max;
    }

    static int minVal(int ...num){
        int min = num[0];
        for (int j : num) {
            if (min > j) {
                min = j;
            }
        }

        return  min;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scn.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scn.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scn.nextInt();

        int max = maxVal(num1, num2, num3);
        int min = minVal(num1, num2, num3);

        System.out.println("Max value is: "+max);
        System.out.println("Min value is: "+min);

    }
}
