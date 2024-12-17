package com.assignment3.functionsormethods;

import java.util.Scanner;


public class MakeABig {

    static String sort(String str){

        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1- i; j++){
                if(arr[j] < arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return new String(arr);
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scn.nextInt();
        String temp = ""+num;
        String ans = sort(temp);

        System.out.println(Integer.parseInt(ans));

    }
}
