package com.assignment1;

import java.util.Scanner;

public class GreetingMessage {

     static  void greet(String name){
        System.out.println("Hello "+name+", Good Morning!");
    }

    public  static  void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scn.nextLine();

        GreetingMessage.greet(name);

    }

}