package com.DSA.Programs;

import java.util.Scanner;

public class PerfectSquare {

    static boolean perfectSquare(int num) {
        int start = 1;
        int end = num / 2;

        while (start <= end){
            int mid = start + ( end - start ) / 2;

            if(mid * mid < num) start++;
            else if( mid * mid > num) end = mid - 1;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scn.nextInt();
        boolean ans = perfectSquare(num);
        System.out.println(ans? num+" is Perfect square number" : num+" is not a perfect square number");
    }
}
