package org.jsp.dsa;

import java.util.Scanner;

public class StackImpln {
    static int[] stack;
    static int top;

    static void createStack(int size){
        stack = new int[size];
        top = -1;
        System.out.println("Stack had been created with size: "+size);
    }

    static void push(int num){
        if(top == stack.length -1){
            System.out.println("Stack OverFlow Error...!!!");
        }else {
            top++;
            stack[top] = num;
            System.out.println(num+ " has been added into the stack...!!!");
        }
    }





    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("-".repeat(10) +"Welcome to Stack Implementation"+ "-".repeat(10));
        System.out.print("Enter the size of the stack: ");
        int size = scn.nextInt();
        createStack(size);
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60);



    }
}
