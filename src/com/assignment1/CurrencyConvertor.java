package com.assignment1;

import java.util.Scanner;

// Input currency in rupees and output in USD.
public class CurrencyConvertor {
    final static double usd = 0.012;

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the amount in rupees: ");
        double rs = scn.nextDouble();

        System.out.println(rs + "rs = "+ (usd*rs) + "usd");

    }
}
