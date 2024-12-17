package com.recurssion;

public class Sum {

    static int sum(int num) {
        if(num == 0){
           return  0;
        }
        int rem = sum(num - 1);
        int sum = num + rem;
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sum(4));
    }
}