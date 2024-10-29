package com.assignment1;

import java.util.Scanner;

public class SimpleInterest {

    static  void simpleInterest(int p, int r, int t){
        int si = p*r*t;
        System.out.println("Simple Interest is: "+ si);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the principle value: ");
        int principle = scn.nextInt();

        System.out.print("Enter the rate value: ");
        int rate = scn.nextInt();

        System.out.print("Enter the time value: ");
        int time = scn.nextInt();

        SimpleInterest.simpleInterest(principle, rate, time);
    }
}
