package com.number_problem;

//Input a year and find whether it is a leap year or not.
import java.util.Scanner;

class LeapYear {

    static  void firstApproachOfLeapYear(int year) {
        if(year%4==0 && year%100!=0 || year%400==0)
            System.out.println(year+" is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }


    static void secondApproachOfLeapYear(int year){

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year +" is a Leap Year");
        }else if(year % 400 == 0){
            System.out.println(year +" is a Leap Year");
        }else {
            System.out.println(year +" is not a Leap Year");
        }
    }

}

public class LeapYearOrNot {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scn.nextInt();

        // First way to write the code for leap year.
        LeapYear.firstApproachOfLeapYear(year);

        // Second Way to write the code for the leap year.
        LeapYear.secondApproachOfLeapYear(year);
    }
}
